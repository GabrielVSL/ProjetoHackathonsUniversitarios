/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Equipe;

/**
 *
 * @author gabri
 */
public class Equipes {
    private static Equipes instance;
    private List<Equipe> equipes;

    private Equipes() {
        equipes = new ArrayList<>();
    }

    public static Equipes getInstance() {
        if (instance == null) {
            instance = new Equipes();
        }
        return instance;
    }

    public void adicionarEquipe(Equipe e) {
        equipes.add(e);
    }

    public Equipe buscarEquipe(int id) {
        return equipes.stream()
                      .filter(e -> e.getId() == id)
                      .findFirst()
                      .orElse(null);
    }

    public List<Equipe> listarEquipes() {
        return new ArrayList<>(equipes);
    }
}
