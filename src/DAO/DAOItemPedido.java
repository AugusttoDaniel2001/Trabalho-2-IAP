package DAO;

import Modelo.Dados;
import Modelo.ItemPedido;
import java.util.List;

/**
 *
 * @author danie
 */
public class DAOItemPedido {
        public List<ItemPedido> getLista(){
        return Dados.listaItemPedido;
    }
    public void salvar(ItemPedido ip){
        if(ip.getPedido()!= null && ip.getProduto()!= null){   
            Dados.listaItemPedido.add(ip);   
        }else{
            
        }
    }
    public void remover(ItemPedido ip){ 
        Dados.listaItemPedido.remove(ip);   
    }
    public void mostrar(){
        for(ItemPedido itemPedido : getLista()){
            System.out.println(itemPedido.getQuantidade());
            System.out.println(itemPedido.getPedido());
            System.out.println(itemPedido.getProduto());
        }
    }
}
