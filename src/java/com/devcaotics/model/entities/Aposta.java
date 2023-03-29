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
public class Aposta {
    
    private int codigo;
    //descrição do premio dado aos competidores
    private String premio[];
    private String descricao;
    
    private Piloto ranking[];

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String[] getPremio() {
        return premio;
    }

    public void setPremio(String[] premio) {
        this.premio = premio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Piloto[] getRanking() {
        return ranking;
    }

    public void setRanking(Piloto[] ranking) {
        this.ranking = ranking;
    }
    
    
    
}
