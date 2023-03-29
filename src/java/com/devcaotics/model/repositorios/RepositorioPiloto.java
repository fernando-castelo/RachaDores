/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.repositorios;

import com.devcaotics.model.entities.Piloto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class RepositorioPiloto {
    
    private static RepositorioPiloto myself = null;
    
    private List<Piloto> pilotos;
    
    private RepositorioPiloto(){
        
        this.pilotos = new ArrayList<>();
        
    }
    
    public static RepositorioPiloto getCurrentInstance(){
        
        if(myself == null)
            RepositorioPiloto.myself = new RepositorioPiloto();
        
        return myself;
        
    }
    
    public void inserir(Piloto p){
        
        this.pilotos.add(p);
        
    }
    
    public void alterar(Piloto p){
        
        for(Piloto pAux: this.pilotos){
            
            if(p.getCodigo() == pAux.getCodigo()){
                
                //this.pilotos.remove(pAux);
                //this.pilotos.add(p);
                
                pAux.setCarro(p.getCarro());
                pAux.setCodNome(p.getCodNome());
                pAux.setContato(p.getContato());
                
                return;
                
            }
            
        }
        
    }
    
    public Piloto ler(int codigo){
        
        for(Piloto p: this.pilotos){
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        
        return null;
        
    }
    
    public void deletar(int codigo){
        
        for(int i = 0; i < this.pilotos.size(); i++){
            
            if(this.pilotos.get(i).getCodigo() == codigo){
                this.pilotos.remove(i);
                
                return;
            }
            
        }
        
    }
    
    public List<Piloto> lerTudo(){
        
        return this.pilotos;
        
    }
    
}
