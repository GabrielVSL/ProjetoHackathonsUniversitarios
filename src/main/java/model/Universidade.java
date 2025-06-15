/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gabriel e Joao Pedro
 * Classe Universidade representa uma instituição de ensino superior, com um curso principal.
 */
public class Universidade extends Instituicao {
    private String cursoPrincipal;

    public Universidade(String nome, String endereco, String cursoPrincipal) {
        super(nome, endereco);
        this.cursoPrincipal = cursoPrincipal;
    }

    public String getCursoPrincipal() {
        return cursoPrincipal;
    }

    public void setCursoPrincipal(String cursoPrincipal) {
        this.cursoPrincipal = cursoPrincipal;
    }
}
