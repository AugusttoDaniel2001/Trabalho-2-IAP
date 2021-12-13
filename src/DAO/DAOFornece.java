package DAO;

import Conexão.Conexao;
import Modelo.Fornece;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class DAOFornece {
    public List<Fornece> getLista(){
        String sql = "SELECT * FROM fornece";
        List<Fornece> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Fornece obj = new Fornece();
                obj.setFornecedor(rs.getString("fornecedores_cnpj"));
                obj.setInsumo(rs.getInt("id_produto"));
                obj.setQto_fornecida(rs.getInt("qto_fornecida"));
                lista.add(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return lista;
    }
    public void salvar(Object o){
        Fornece obj = new Fornece();       
        if(obj.getFornecedor()== null){
            //Inserir
            incluir(obj);            
        } else {
            //Atualizar  
            atualizar(obj);
        } 
    }
    private void incluir(Fornece obj){
        String sql = "INSERT INTO fornecce (fornecedores_cnpj, id_produto, qto_fornecida) VALUES (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getFornecedor());
            pst.setString(2, obj.getInsumo());
            pst.setString(3, obj.getQto_fornecida());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados da Tabela Fornece incluída com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Dados da Tabela Fornece não incluídos com sucesso!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
    }
    private void atualizar(Fornece obj){
        String sql = "UPDATE cidade SET fornecedores_cnpj = ?, id_produto = ?, id_produto = ? WHERE fornecedores_cnpj = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getFornecedor());
            pst.setString(2, obj.getInsumo());
            pst.setString(3, obj.getQto_fornecida());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade atualizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não atualizada com sucesso!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
    }
    public void remover(Object o){
        Fornece obj = (Fornece)o;
        String sql = "DELETE FROM cidade WHERE codigo = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getFornecedor());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade excluída com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não excluída com sucesso!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
    }


}
