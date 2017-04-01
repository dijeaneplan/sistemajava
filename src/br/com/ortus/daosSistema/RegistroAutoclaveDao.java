/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ortus.daosSistema;

import br.com.ortus.beans.RegistroAutoclave;
import java.util.List;

/**
 *
 * @author ti
 */
public class RegistroAutoclaveDao extends BaseDao<RegistroAutoclave> {
    
    public RegistroAutoclaveDao() {
        super(RegistroAutoclave.class);
    }
    
    public List<RegistroAutoclave> obterRegistros(String filtro){
        return obterListaFiltroCompleto("FROM RegistroAutoclave WHERE status='"+filtro+"'"); 
    }
}
