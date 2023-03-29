package com.devcaotics.model.repositorios;

import com.devcaotics.model.entities.Organizador;
import java.util.ArrayList;
import java.util.List;

public class RepositorioOrganizador{

    private static RepositorioOrganizador myself = null;

    private List<Organizador> organizadores;

    private RepositorioOrganizador(){

        this.organizadores = new ArrayList<>();
    }

    public static RepositorioOrganizador getCurrentInstance() {

        if(myself == null) {
            RepositorioOrganizador.myself = new RepositorioOrganizador();
        }

        return myself;
    }

    public void inserir(Organizador org) {

        this.organizadores.add(org);
    }

    public void alterar(Organizador org) {

        for(Organizador orgAux : this.organizadores) {

            if(org.getCodigo() == orgAux.getCodigo()) {

                orgAux.setCodNome(org.getCodNome());
                orgAux.setContato(org.getContato());
                orgAux.setObservacao(org.getObservacao());

                return;
            }
        }
    }

    public Organizador ler(int codigo) {

        for(Organizador org: this.organizadores) {
            if(org.getCodigo() == codigo) {
                return org;
            }
        }

        return null;
    }

    public void deletar(int codigo) {

        for(int i=0; i < this.organizadores.size(); i++) {

            if(this.organizadores.get(i).getCodigo() == codigo) {
                this.organizadores.remove(i);

                return;
            }
        }
    }

    public List<Organizador> lerTudo() {
        return this.organizadores;
    }
}
