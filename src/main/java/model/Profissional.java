/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gabri
 */
public class Profissional extends Pessoa {
    private String registroProfissional;

    public Profissional(String nome, String cpf, String registroProfissional) {
        super(nome, cpf);
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
