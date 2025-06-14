/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gabri
 */
public class Sala {
    private String identificacao;
    private int capacidade;
    private boolean reservada = false;

    public Sala(String identificacao, int capacidade) {
        this.identificacao = identificacao;
        this.capacidade = capacidade;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void reservar() {
        this.reservada = true;
    }
}

