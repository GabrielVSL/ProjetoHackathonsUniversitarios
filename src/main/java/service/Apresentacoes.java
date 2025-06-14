/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Apresentacao;
import model.Equipe;

/**
 *
 * @author gabri
 */
public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> apresentacoes;

    private Apresentacoes() {
        apresentacoes = new ArrayList<>();
    }

    public static Apresentacoes getInstance() {
        if (instance == null) {
            instance = new Apresentacoes();
        }
        return instance;
    }

    public void adicionarApresentacao(Apresentacao a) {
        apresentacoes.add(a);
    }

    public Apresentacao buscarApresentacao(int id) {
        return apresentacoes.stream()
                             .filter(a -> a.getId() == id)
                             .findFirst()
                             .orElse(null);
    }

    public List<Apresentacao> listarApresentacoes() {
        return new ArrayList<>(apresentacoes);
    }

    /**
     * Lista projetos aprovados a partir das apresentações.
     */
    public List<Equipe> listarProjetosAprovados() {
        List<Equipe> aprovados = new ArrayList<>();
        apresentacoes.stream()
            .filter(a -> a.calcularMedia() >= 7)
            .forEach(a -> aprovados.add(a.getProjeto().getEquipe()));
        return aprovados;
    }
}
