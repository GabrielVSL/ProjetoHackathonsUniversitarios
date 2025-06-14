/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gabri
 */
public class Projeto implements Avaliavel {
    private int id;
    private String titulo;
    private String descricao;
    private double notaFinal;
    private Equipe equipe;
    private Apresentacao apresentacao;

    public Projeto(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setApresentacao(Apresentacao apresentacao) {
        this.apresentacao = apresentacao;
    }

    public Apresentacao getApresentacao() {
        return apresentacao;
    }

    public void calcularNotaFinal() {
        this.notaFinal = apresentacao.calcularMedia();
    }

    @Override
    public double calcularNota() {
        return notaFinal;
    }
}
