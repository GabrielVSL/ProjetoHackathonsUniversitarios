/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Apresentacao  {
    private int id;
    private LocalDate data;
    private LocalTime hora;
    private Sala sala;
    private Avaliavel banca;
    private List<Double> notas = new ArrayList<>();
    private Projeto projeto;

    public Apresentacao(int id, LocalDate data, LocalTime hora, Sala sala) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.sala = sala;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setBanca(Banca banca) {
        this.banca = banca;
    }

    public Avaliavel getBanca() {
        return banca;
    }
    
    public void setProjeto(Projeto projeto) {
    this.projeto = projeto;
    }

    public Projeto getProjeto() {
        return this.projeto;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double avaliar() {
        return  banca.calcularNota();
    }
    

    
}
