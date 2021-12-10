package DAO;

import Modelo.Dados;
import Modelo.Pedido;
import java.util.List;

/**
 *
 * @author danie
 */
public class DAOPedido {
    public List<Pedido> getLista(){
        return Dados.listaPedido;
    }
    public void salvar(Pedido p){
        if(p.getId_pedido() != null){  
            int id = Dados.listaPedido.size() + 1;
            p.setId_pedido(id);
            Dados.listaPedido.add(p);   
        }
    }
    public void remover(Pedido p){ 
        Dados.listaPedido.remove(p);   
    }
    public void mostrar(){
        for(Pedido pedido : getLista()){
            System.out.println(pedido.getId_pedido());
            System.out.println(pedido.getValor_total());
            System.out.println(pedido.getDescricao());
            System.out.println(pedido.getData_pedido());
            System.out.println(pedido.getFuncionario());
        }
    }
}
      