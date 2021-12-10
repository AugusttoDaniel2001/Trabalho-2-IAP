package DAO;

import Modelo.Dados;
import Modelo.Funcionario;
import java.util.List;

/**
 *
 * @author danie
 */
public class DAOFuncionario {
    public List<Modelo.Funcionario> getLista(){
        return Dados.listaFuncionario;
    }
    public void salvar(Modelo.Funcionario f){
        if(f.getId_funcionario()!= null){   
            Dados.listaFuncionario.add(f);   
        }else{
            
        }
    }
    public void remover(Modelo.Funcionario f){ 
        Dados.listaFuncionario.remove(f);   
    }
    public void mostrar(){
        for(Funcionario funcionario : getLista()){
            System.out.println(funcionario.getId_funcionario());
            System.out.println(funcionario.getNumero());
            System.out.println(funcionario.getCpf());
            System.out.println(funcionario.getSalario());
            System.out.println(funcionario.getSexo());
            System.out.println(funcionario.getTelefone());
            System.out.println(funcionario.getRua());
            System.out.println(funcionario.getCidade());
            System.out.println(funcionario.getEstado());
            System.out.println(funcionario.getCep());
            System.out.println(funcionario.getBairro());
            System.out.println(funcionario.getNumero());
        }
    }  
}
