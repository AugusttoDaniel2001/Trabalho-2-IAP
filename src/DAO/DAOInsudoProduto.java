package DAO;

import Modelo.Dados;
import Modelo.InsumoProduto;
import java.util.List;

/**
 *
 * @author danie
 */
public class DAOInsudoProduto {
    public List<Modelo.InsumoProduto> getLista(){
        return Dados.listaInsumoProsuto;
    }
    public void salvar(Modelo.InsumoProduto ip){
        if(ip.getInsumo()!= null && ip.getProduto()!= null){   
            Dados.listaInsumoProsuto.add(ip);   
        }else{
            
        }
    }
    public void remover(Modelo.InsumoProduto ip){ 
        Dados.listaInsumoProsuto.remove(ip);   
    }
    public void mostrar(){
        for(InsumoProduto insumoProduto : getLista()){
            System.out.println(insumoProduto.getInsumo());
            System.out.println(insumoProduto.getProduto());
            System.out.println(insumoProduto.getQuantidade());
        }
    }  
}
