/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gabri
 */
public class Jurado extends Profissional implements Avaliavel {
    private String especialidade;

    public Jurado(String nome, String cpf, String registroProfissional, String especialidade) {
        super(nome, cpf, registroProfissional);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public double calcularNota() {
        // Nota aleatória entre 0 e 10
        return Math.random() * 10;
    }

    public double avaliar(Apresentacao apresentacao) {
        double nota = calcularNota();
        apresentacao.adicionarNota(nota);
        return nota;
    }
}
