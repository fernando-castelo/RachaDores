/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Corrida {
    
    private int codigo;
    private String data;
    private String observacao;
    private int[] ordemChegada;
    
    private Organizador organizador;
    private Local principal;
    private Local backup;
    private Aposta aposta;
    
    private List<Piloto> corredores;
    
    public Corrida(List<Piloto> pilotos){
        
        if(pilotos.size() < 2 || pilotos.size() > 6){
            throw new RuntimeException("Quantidade de Pilotos inválida!");
        }
        
    }
    
    public Corrida(){
        
        this.corredores = new ArrayList<>();
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int[] getOrdemChegada() {
        return ordemChegada;
    }

    public void setOrdemChegada(int[] ordemChegada) {
        this.ordemChegada = ordemChegada;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public Local getPrincipal() {
        return principal;
    }

    public void setPrincipal(Local principal) {
        this.principal = principal;
    }

    public Local getBackup() {
        return backup;
    }

    public void setBackup(Local backup) {
        this.backup = backup;
    }

    public List<Piloto> getCorredores() {
        
        List<Piloto> pAux = new ArrayList();
        
        for(Piloto p: this.corredores){
            pAux.add(p);
        }
        
        return pAux;
    }

    public void setCorredores(List<Piloto> corredores) {
        
        if(corredores.size()> 2 && this.corredores.size()<6)
            this.corredores = corredores;
        else
            throw new RuntimeException("Quantidade de Pilotos inválida!");
        
    }

    public Aposta getAposta() {
        return aposta;
    }

    public void setAposta(Aposta aposta) {
        this.aposta = aposta;
    }
    
    
    
}
