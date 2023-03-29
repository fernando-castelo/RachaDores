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
public class Local {
    
    private int codigo;
    private String endereco;
    private String comprimentoPercurso;
    private String observacao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComprimentoPercurso() {
        return comprimentoPercurso;
    }

    public void setComprimentoPercurso(String comprimentoPercurso) {
        this.comprimentoPercurso = comprimentoPercurso;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
}
