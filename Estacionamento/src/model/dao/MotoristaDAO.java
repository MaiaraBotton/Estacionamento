package model.dao;

import model.bean.Motorista;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MotoristaDAO {
    public void create(Motorista m){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO motorista (nomeCompleto, cpf, genero, rg, celular, email, senha) VALUES (?, ?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, m.getCpf());
            stmt.setString(2, m.getNomeCompleto());
            stmt.setBoolean(3, m.getGenero());
            stmt.setInt(4, m.getRg());
            stmt.setInt(5, m.getCelular());
            stmt.setInt(6, m.getEmail());
            stmt.setInt(7, m.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Motorista salvo com sucesso!");
                            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
