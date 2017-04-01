
package br.com.ortus.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author ti
 */
@Entity
public class RegistroAutoclave implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne
    private Cliente revenda;
    
    @OneToOne
    private Cliente clienteFinal;
    
    private String dataRegistro;
    
    @OneToOne
    private Autoclave Autoclave;
    
    private String dataDesbloqueio;
    
    private String status;

    public br.com.ortus.beans.Autoclave getAutoclave() {
        return Autoclave;
    }

    public void setAutoclave(br.com.ortus.beans.Autoclave Autoclave) {
        this.Autoclave = Autoclave;
    }

    public Cliente getClienteFinal() {
        return clienteFinal;
    }

    public void setClienteFinal(Cliente clienteFinal) {
        this.clienteFinal = clienteFinal;
    }

    public String getDataDesbloqueio() {
        return dataDesbloqueio;
    }

    public void setDataDesbloqueio(String dataDesbloqueio) {
        this.dataDesbloqueio = dataDesbloqueio;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getRevenda() {
        return revenda;
    }

    public void setRevenda(Cliente revenda) {
        this.revenda = revenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
