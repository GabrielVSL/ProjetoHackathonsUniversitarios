/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author gabri
 */
public class Jurado extends Profissional  {
    private String especialidade;

    public Jurado( String nome, String cpf, String registroProfissional, String especialidade) {
    super(nome, cpf, registroProfissional);
    this.especialidade = especialidade;
}

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

  
    
}
