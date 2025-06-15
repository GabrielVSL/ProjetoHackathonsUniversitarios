
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import model.Apresentacao;
import model.Banca;
import model.Equipe;
import model.Estudante;
import model.Jurado;
import model.Projeto;
import model.Sala;
import repository.ApresentacaoRepository;
import repository.EquipeRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class App {
    public static void main(String[] args) {
        // 1) Criar duas equipes com 5 estudantes cada
        Equipe e1 = new Equipe(1, "Equipe Alpha");
        Equipe e2 = new Equipe(2, "Equipe Beta");
        for (int i = 1; i <= 5; i++) {
            e1.adicionarAluno(new Estudante("AlunoA" + i, "CPF-A" + i, "MAT-A" + i));
            e2.adicionarAluno(new Estudante("AlunoB" + i, "CPF-B" + i, "MAT-B" + i));
        }
        EquipeRepository.getInstance().adicionarEquipe(e1);
        EquipeRepository.getInstance().adicionarEquipe(e2);

        // 2) Criar projetos e associar às equipes
        Projeto p1 = new Projeto(1, " Manager.Io ", "Descrição do projeto Manager.Io ");
        Projeto p2 = new Projeto(2, " Culturar ", "Descrição do projeto Culturar ");
        e1.setProjeto(p1);    p1.setEquipe(e1);
        e2.setProjeto(p2);    p2.setEquipe(e2);

        // 3) Para cada projeto, criar banca de 4 jurados e adiciona suas notas
        Banca b1 = new Banca(p1, null);
        Banca b2 = new Banca(p2,null);
        for (int j = 1; j <= 4; j++) {
            b1.adicionarJurado(new Jurado("" + j, "CPF-J1-" + j, "REG-J1-" + j, "Especialidade"), 10); // Nota fixa de 10 para simular avaliação
            b2.adicionarJurado(new Jurado("" + j, "CPF-J2-" + j, "REG-J2-" + j, "Especialidade"), (int) (Math.random() * 11)); // Nota aleatória entre 0 e 10
            
        }

        // 4) Criar apresentação, associar banca, sala e projeto
        Sala sala1 = new Sala("Sala A", 30);
        Sala sala2 = new Sala("Sala B", 25);
        Apresentacao a1 = new Apresentacao(1, LocalDate.now(), LocalTime.now(), sala1);
        Apresentacao a2 = new Apresentacao(2, LocalDate.now(), LocalTime.now(), sala2);
        ApresentacaoRepository.getInstance().adicionarApresentacao(a1);
        ApresentacaoRepository.getInstance().adicionarApresentacao(a2);

        a1.setBanca(b1);
        a1.setProjeto(p1);
        p1.setApresentacao(a1);

        a2.setBanca(b2);
        a2.setProjeto(p2);
        p2.setApresentacao(a2);

        // Fazer cada jurado avaliar (coleta notas que serão usadas para calcular a média), usamos numeros aleatórios para simular notas
       

        // 5) Calcular nota final de cada projeto
        p1.calcularNotaFinal();
        p2.calcularNotaFinal();

        // 6) Listar projetos com nota ≥ 7
        System.out.println("Projetos Aprovados: ");
        List<Apresentacao> aprovadas = ApresentacaoRepository.getInstance().listarProjetosAprovados();
        if (aprovadas.isEmpty()) {
            System.out.println("Nenhum projeto aprovado.");
            return;
        }
        for (Apresentacao apresentacao : aprovadas) {
            Projeto projeto = apresentacao.getProjeto();
            System.out.println("Projeto " + projeto.getTitulo()+", Nota Final: " + projeto.getNotaFinal()+ ", Equipe: " + projeto.getEquipe().getNome());   
        } 
    }
}
