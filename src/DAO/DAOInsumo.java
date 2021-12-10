package DAO;

import Modelo.Dados;
import Modelo.Insumo;
import java.util.List;

/**
 *
 * @author danie
 */
public class DAOInsumo {
    public List<Modelo.Insumo> getLista(){
        return Dados.listaInsumo;
    }
    public void salvar(Modelo.Insumo i){
        if(i.getId_insumo()!= null){              
            int id = Dados.listaInsumo.size() + 1;
            i.setId_insumo(id);
            Dados.listaInsumo.add(i);   
        }
    }
    public void remover(Modelo.Insumo i){ 
        Dados.listaInsumo.remove(i);   
    }
    public void mostrar(){
        for(Insumo insumo : getLista()){
            System.out.println(insumo.getId_insumo());
            System.out.println(insumo.getPreco());
            System.out.println(insumo.getNome());
        }
    } 
}
      