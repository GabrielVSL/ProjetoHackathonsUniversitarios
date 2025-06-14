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
public class Banca {
    private List<Jurado> jurados = new ArrayList<>();

    public void adicionarJurado(Jurado j) {
        jurados.add(j);
    }

    public List<Jurado> getJurados() {
        return jurados;
    }

    public double calcularMediaNotas() {
        return jurados.stream()
                     .mapToDouble(Jurado::calcularNota)
                     .average()
                     .orElse(0);
    }
}
