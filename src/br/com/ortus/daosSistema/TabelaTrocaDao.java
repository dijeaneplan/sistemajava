/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ortus.daosSistema;

import br.com.ortus.beans.TabelaTroca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class TabelaTrocaDao extends BaseDao<TabelaTroca> {
    
    public TabelaTrocaDao(){
        super(TabelaTroca.class);
    }
    
    public List<TabelaTroca> obterTrocas(String filtro){
        List<TabelaTroca> trocas = new ArrayList<TabelaTroca>();
        if(filtro.equals("Enviado")){
            trocas = obterListaFiltroCompleto("FROM TabelaTroca as t WHERE t.statusProducao='Enviado' AND t.devolucao='Ok'");
        }else if(filtro.equals("Pendente")){
            trocas = obterListaFiltroCompleto("FROM TabelaTroca as t WHERE t.statusProducao='Pendente' OR t.statusProducao='Pronto'");
        }else if(filtro.equals("Estoque")){
            trocas = obterListaFiltroCompleto("FROM TabelaTroca as t WHERE t.statusProducao='Estoque'");
        }else if(filtro.equals("Aguardando")){
            trocas = obterListaFiltroCompleto("FROM TabelaTroca as t WHERE t.devolucao='Aguardando' AND t.statusProducao='Enviado'");
        }
        return trocas;
    }
    
    public List<TabelaTroca> obterTrocas(String filtro,String filtroNome){
        List<TabelaTroca> trocas = new ArrayList<TabelaTroca>();
        if(filtro.equals("Enviado")){
            trocas = obterListaFiltroCompleto("FROM TabelaTroca as t WHERE " + filtroNome + " AND t.statusProducao='Enviado' AND t.devolucao='Ok'");
        }else if(filtro.equals("Pendente")){
            trocas = obterListaFiltroCompleto("FROM TabelaTroca as t WHERE " + filtroNome + " AND t.statusProducao='Pendente' OR t.statusProducao='Pronto'" );
        }else if(filtro.equals("Estoque")){
            trocas = obterListaFiltroCompleto("FROM TabelaTroca as t WHERE " + filtroNome + " AND t.statusProducao='Estoque'");
        }else if(filtro.equals("Aguardando")){
            trocas = obterListaFiltroCompleto("FROM TabelaTroca as t WHERE " + filtroNome + " AND t.devolucao='Aguardando' AND t.statusProducao='Enviado'");
        }
        return trocas;
    }
    
}
