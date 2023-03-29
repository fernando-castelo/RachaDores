/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.entities;

/**
 *
 * @author ALUNO
 */
public class Piloto {
    
    private int codigo;
    private String codNome;
    private String carro;
    private String contato;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodNome() {
        return codNome;
    }

    public void setCodNome(String codNome) {
        this.codNome = codNome;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
    
}
