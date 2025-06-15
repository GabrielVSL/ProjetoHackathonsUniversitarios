/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gabriel e Joao Pedro
 * Classe Empresa representa uma instituição que atua em uma área específica.
 */
public class Empresa extends Instituicao {
    private String areaAtuacao;

    public Empresa(String nome, String endereco, String areaAtuacao) {
        super(nome, endereco);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
}
