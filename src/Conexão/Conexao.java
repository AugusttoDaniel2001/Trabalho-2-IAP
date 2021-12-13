package Conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Conexao {
    private static final String BANCO = "jdbc:mysql://localhost:3306/crud";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static Connection con = null;
    public static Connection getConnection(){
        if (con == null) {
            try {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(BANCO, USUARIO, SENHA);
            } catch (ClassNotFoundException e) {
                System.out.println("Driver não encontrado");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return con;
    }
    public static PreparedStatement getPreparedStatement(String sql){
        if (con == null) {
            con = getConnection();
        }
        
        try {
            return con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return null;
    }


}

