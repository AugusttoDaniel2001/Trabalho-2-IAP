package DAO;

import Modelo.Dados;
import Modelo.Fornecedor;
import java.util.List;

/**
 *
 * @author danie
 */
public class DAOFornecedor {
    public List<Fornecedor> getLista(){
        return Dados.listaFornecedor;
    }
    public void salvar(Fornecedor f){
        if(f.getCnpj() != null){   
        Dados.listaFornecedor.add(f);   
        }
    }
    public void remover(Fornecedor f){ 
        Dados.listaFornecedor.remove(f);   
    }
    public void mostrar(){
        for(Fornecedor fornecedor : getLista()){
            System.out.println("CNPJ: " + fornecedor.getCnpj());
            System.out.println("Nome: " +fornecedor.getNome());
            System.out.println("Telefone: " +fornecedor.getTelefone());
        }
    }
}
