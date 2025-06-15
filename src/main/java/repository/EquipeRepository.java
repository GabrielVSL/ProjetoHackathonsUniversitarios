/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Equipe;

/**
 *
 * @author gabri
 */
public class EquipeRepository {
    private static EquipeRepository instance;
    private List<Equipe> equipes;

    private EquipeRepository() {
        equipes = new ArrayList<>();
    }

    public static EquipeRepository getInstance() {
        if (instance == null) {
            instance = new EquipeRepository();
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
