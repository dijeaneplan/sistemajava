/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ortus.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ti
 */
@Entity
public class Autoclave implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    
    private String nomeAutoclave;
    
    private String numeroSerie;
    
    private String codigoDesbloqueio;

    public String getCodigoDesbloqueio() {
        return codigoDesbloqueio;
    }

    public void setCodigoDesbloqueio(String codigoDesbloqueio) {
        this.codigoDesbloqueio = codigoDesbloqueio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeAutoclave() {
        return nomeAutoclave;
    }

    public void setNomeAutoclave(String nomeAutoclave) {
        this.nomeAutoclave = nomeAutoclave;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    
}
