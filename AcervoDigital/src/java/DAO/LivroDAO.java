/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Livro;
import java.sql.SQLException;
import java.sql.Connection;
import util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author daviferreira
 */
public class LivroDAO {
    public void cadastrar(Livro l) throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into livros (id, titulo, preco, autor, genero, editora, idioma, classificacao_indicativa, ano_publicacao, numero_paginas) values (?,?,?,?,?,?,?,?,?,?)");
        comando.setInt(1, l.getId());
        comando.setString(2, l.getTitulo());
        comando.setDouble(3, l.getPreco());
        comando.setString(4,l.getAutor());
        comando.setString(5,l.getGenero());
        comando.setString(6,l.getEditora());
        comando.setString(7,l.getIdioma());
        comando.setString(8,l.getClassificacaoIndicativa());
        comando.setInt(9,l.getAnoPublicacao());
        comando.setInt(10,l.getNumeroPaginas());
        
        comando.execute();
        con.close();
    }
    
    public void deletar(Livro l) throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from livros where id = ?");
        comando.setInt(1, l.getId());
        comando.execute();
        con.close();
    }
    
    public void atualizar(Livro l) throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("update livros set titulo = ?, preco = ?, autor = ?, genero = ?, editora = ?, idioma = ?,classificacao_indicativa = ?, ano_publicacao = ?, numero_paginas = ? where id = ?");
        comando.setString(1, l.getTitulo());
        comando.setDouble(2, l.getPreco());
        comando.setString(3,l.getAutor());
        comando.setString(4,l.getGenero());
        comando.setString(5,l.getEditora());
        comando.setString(6,l.getIdioma());
        comando.setString(7,l.getClassificacaoIndicativa());
        comando.setInt(8,l.getAnoPublicacao());
        comando.setInt(9,l.getNumeroPaginas());
        comando.setInt(10, l.getId());
        comando.execute();
        con.close();
    }
     

    public Livro consultarporId(Livro l) throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from livros where id = ?");
        comando.setInt(1, l.getId());
        ResultSet rs = comando.executeQuery();
        Livro liv = new Livro();
        if (rs.next()){
            liv.setId(rs.getInt("id"));
            liv.setTitulo(rs.getString("titulo"));
            liv.setPreco(rs.getDouble("preco"));
            liv.setAutor(rs.getString("autor"));
            liv.setGenero(rs.getString("genero"));
            liv.setEditora(rs.getString("editora"));
            liv.setIdioma(rs.getString("idioma"));
            liv.setClassificacaoIndicativa(rs.getString("classificacao_indicativa"));
            liv.setAnoPublicacao(rs.getInt("ano_publicacao"));
            liv.setNumeroPaginas(rs.getInt("numero_paginas"));
        }        
        return liv;
    }
    
    
    public List<Livro> consultarTodos() throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from livros");
        ResultSet rs = comando.executeQuery();
        
        List<Livro> lliv = new ArrayList<Livro>();
        while(rs.next()){
            Livro liv = new Livro();
            liv.setId(rs.getInt("id"));
            liv.setTitulo(rs.getString("titulo"));
            liv.setPreco(rs.getDouble("preco"));
            liv.setAutor(rs.getString("autor"));
            liv.setGenero(rs.getString("genero"));
            liv.setEditora(rs.getString("editora"));
            liv.setIdioma(rs.getString("idioma"));
            liv.setClassificacaoIndicativa(rs.getString("classificacao_indicativa"));
            liv.setAnoPublicacao(rs.getInt("ano_publicacao"));
            liv.setNumeroPaginas(rs.getInt("numero_paginas"));
            
            lliv.add(liv);
        }        
        return lliv;
    }
}
