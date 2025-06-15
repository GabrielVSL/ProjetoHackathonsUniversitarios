/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gabriel e Joao Pedro
 * Classe Banca representa um conjunto de jurados que avaliam projetos.
 */
public class Banca implements Avaliavel {
    
    private Projeto projetoAvaliProjeto;
    private Map<Jurado, Integer> jurados;

    public Banca(Projeto projetoAvaliProjeto, Map<Integer, Jurado> jurados) {
        this.projetoAvaliProjeto = projetoAvaliProjeto;
        this.jurados =  new HashMap<>();
    }
    
    public Projeto getProjetoAvaliProjeto() {
        return projetoAvaliProjeto;
    }
    public void setProjetoAvaliProjeto(Projeto projetoAvaliProjeto) {
        this.projetoAvaliProjeto = projetoAvaliProjeto;
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }
    public void setJurados(Map<Jurado, Integer> jurados) {
        this.jurados = jurados;
    }

    public void adicionarJurado(Jurado j, int nota) {
        if (j != null && nota >= 0 && nota <= 10) {
            jurados.put(j, nota);
        } else {
            System.out.println("Erro ao adicionar jurado: Jurado inválido ou nota fora do intervalo permitido (0-10).");
        }
    }

   @Override
    public double calcularNota() {
        double soma = 0.0;
        int totalJurados = jurados.size();

    for (Map.Entry<Jurado, Integer> entry : jurados.entrySet()) {
        Jurado jurado = entry.getKey();
        int nota = entry.getValue();

        soma += nota;
        System.out.println("Jurado " + jurado.getNome() + " deu nota: " + nota + " ao projeto " + projetoAvaliProjeto.getTitulo());
    }

        return totalJurados > 0 ? soma / totalJurados : 0.0;
}
    }

   

    //

