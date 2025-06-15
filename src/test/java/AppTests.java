import model.Apresentacao;
import model.Equipe;
import model.Projeto;
import model.Sala;
import repository.ApresentacaoRepository;
import repository.EquipeRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class AppTests {

    @Test
    public void testEquipeAndProjectLink() {
        Equipe eq = new Equipe(1, "TestTeam");
        Projeto proj = new Projeto(1, "Title", "Desc");
        eq.setProjeto(proj);
        proj.setEquipe(eq);
        assertEquals(eq, proj.getEquipe());
        assertEquals(proj, eq.getProjeto());
    }

    @Test
    public void testApresentacaoAverageAndProjetoFinal() {
        Sala sala = new Sala("S1", 10);
        Apresentacao ap = new Apresentacao(1, LocalDate.now(), LocalTime.now(), sala);
        ap.adicionarNota(8.0);
        ap.adicionarNota(6.0);
        ap.adicionarNota(7.0);
        double media = ap.avaliar();
        assertEquals(7.0, media, 0.001);

        Projeto proj = new Projeto(2, "P2", "Desc");
        proj.setApresentacao(ap);
        ap.setProjeto(proj);
        proj.calcularNotaFinal();
        assertEquals(7.0, proj.getNotaFinal(), 0.001);
    }

    @Test
    public void testSingletonEquipes() {
        Equipe e1 = new Equipe(10, "T1");
        Equipe e2 = new Equipe(20, "T2");
        EquipeRepository s1 = EquipeRepository.getInstance();
        EquipeRepository s2 = EquipeRepository.getInstance();
        assertSame(s1, s2);
        s1.adicionarEquipe(e1);
        s1.adicionarEquipe(e2);
        List<Equipe> list = s2.listarEquipes();
        assertTrue(list.contains(e1));
        assertTrue(list.contains(e2));
        assertEquals(e2, s2.buscarEquipe(20));
    }

    @Test
    public void testSingletonApresentacoesAndFilter() {
        // Preparar apresentações
        Sala s = new Sala("S2", 5);
        Apresentacao a1 = new Apresentacao(101, LocalDate.now(), LocalTime.now(), s);
        Apresentacao a2 = new Apresentacao(102, LocalDate.now(), LocalTime.now(), s);
        // Atribuir notas
        a1.adicionarNota(9.0);
        a1.adicionarNota(8.0);
        a2.adicionarNota(5.0);
        a2.adicionarNota(6.0);
        // Vincular projetos e equipes
        Equipe eq1 = new Equipe(1, "E1");
        Equipe eq2 = new Equipe(2, "E2");
        Projeto p1 = new Projeto(11, "P1", "D");
        Projeto p2 = new Projeto(22, "P2", "D");
        eq1.setProjeto(p1); p1.setEquipe(eq1);
        eq2.setProjeto(p2); p2.setEquipe(eq2);
        p1.setApresentacao(a1); a1.setProjeto(p1);
        p2.setApresentacao(a2); a2.setProjeto(p2);
        // Registrar no singleton
        ApresentacaoRepository apService = ApresentacaoRepository.getInstance();
        apService.adicionarApresentacao(a1);
        apService.adicionarApresentacao(a2);
        // Filtrar aprovados
        List<Apresentacao> aprovadas = apService.listarProjetosAprovados();
        assertTrue(aprovadas.contains(a1));
        assertFalse(aprovadas.contains(a2));
    }
}

