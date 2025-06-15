/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Equipe {
    private int id;
    private String nome;
    private List<Estudante> membros;
    private Projeto projeto;

    public Equipe(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAluno(Estudante m) {
        membros.add(m);
    }

    public List<Estudante> getAlunos() {
        return membros;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    
}
