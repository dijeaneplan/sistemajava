/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ortus.daosSistema;

import br.com.ortus.beans.AssistenciaExterna;
import java.util.List;

/**
 *
 * @author Paulo Azevedo
 */
public class AssistenciaExternaDao extends BaseDao<AssistenciaExterna> {
    
    public AssistenciaExternaDao(){
        super(AssistenciaExterna.class);
    }
    
    public List<AssistenciaExterna> obterAssistenciasAbertas(String login, String status){
        List<AssistenciaExterna> lista = this.obterListaFiltroCompleto("FROM AssistenciaExterna as a, Usuario as u WHERE u.login = '"+login+"' and a.status = '"+status+"'");
        return lista;
    }
    
    public List<AssistenciaExterna> obterAssistenciasAbertas(String status){
        List<AssistenciaExterna> lista= this.obterListaFiltroCompleto("FROM AssistenciaExterna as a WHERE a.status = '"+status+"'");
        return lista;
    }
}
