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
    private List<Estudante> alunos = new ArrayList<>();
    private Projeto projeto;

    public Equipe(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAluno(Estudante e) {
        alunos.add(e);
    }

    public List<Estudante> getAlunos() {
        return alunos;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Projeto getProjeto() {
        return projeto;
    }
}
