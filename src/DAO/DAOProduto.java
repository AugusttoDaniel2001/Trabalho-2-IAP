package DAO;

import Modelo.Dados;
import Modelo.Produto;
import java.util.List;

/**
 *
 * @author danie
 */
public class DAOProduto {
    public List<Produto> getLista(){
        return Dados.listaProduto;
    }
    public void salvar(Produto p){
        if(p.getId_produtos() != null){  
            int id = Dados.listaProduto.size() + 1;
            p.setId_produtos(id);
            Dados.listaProduto.add(p);   
        }
    }
    public void remover(Produto p){ 
        Dados.listaProduto.remove(p);   
    }
    public void mostrar(){
        for(Produto produto : getLista()){
            System.out.println(produto.getId_produtos());
            System.out.println(produto.getNome());
        }
    }  
}
