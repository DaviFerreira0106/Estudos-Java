/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import util.FabricaConexao;

/**
 *
 * @author PTOLEDO
 */
public class ClienteDAO {

    public void cadastrar(Cliente cliente) throws ClassNotFoundException, SQLException {

        //1
        Connection conexao = FabricaConexao.getConexao();
        //2
        String sql = "INSERT INTO cliente(nome, telefone, endereco) VALUES (?,?,?)";
        //3
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        pstmt.setString(1, cliente.getNome());
        pstmt.setString(2, cliente.getTelefone());
        pstmt.setString(3, cliente.getEndereco());
        pstmt.execute();
        //4
        conexao.close();
    }
    
    
     public void excluir(Cliente cliente) throws ClassNotFoundException, SQLException {

        //1
        Connection conexao = FabricaConexao.getConexao();
        //2
        String sql = "DELETE FROM cliente where id = ?";
        //3
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        pstmt.setInt(1, cliente.getId());
        pstmt.execute();
        //4
        conexao.close();
    }
     
    public List<Cliente> listarTodos() throws ClassNotFoundException, SQLException {
        
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("SELECT * FROM cliente") ;
        ResultSet resultado = comando.executeQuery();
        
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        while(resultado.next()){
            Cliente c = new Cliente();
            c.setId(resultado.getInt("id"));
            c.setNome(resultado.getString("nome"));
            c.setEndereco(resultado.getString("endereco"));
            c.setTelefone(resultado.getString("telefone"));
            listaCliente.add(c);
        }
        con.close();
        return listaCliente;
    }
    
    public void update(Cliente cliente) throws ClassNotFoundException, SQLException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("UPDATE cliente(nome, telefone, endereco) VALUES (?, ?, ?) WHERE id = ?");
        
        comando.setString(1, cliente.getNome());
        comando.setString(2, cliente.getTelefone());
        comando.setString(3, cliente.getEndereco());
        comando.setInt(4, cliente.getId());
        comando.execute();
    }
        
}
