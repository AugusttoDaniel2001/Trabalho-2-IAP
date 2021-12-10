package DAO;

import Modelo.Dados;
import Modelo.Fornece;
import java.util.List;

/**
 *
 * @author danie
 */
public class DAOFornece {
    public List<Fornece> getLista(){
        return Dados.listaFornece;
    }
    public void salvar(Fornece f){
          if(f.getFornecedor()!= null && f.getInsumo() != null){   
            Dados.listaFornece.add(f);   
          }
    }
    public void remover(Fornece f){ 
        Dados.listaFornece.remove(f);   
    }
    public void mostrar(){
        for(Fornece fornece : getLista()){
            System.out.println(fornece.getQto_fornecida());
            System.out.println(fornece.getFornecedor());
            System.out.println(fornece.getInsumo());
        }
    }
}
