/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import DAO.LivroDAO;
import Model.Livro;
import Util.Upload;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daviferreira
 */
public class ExcluirLivroAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response, Upload objUpload) throws Exception {
        /* Variavel para tratamento de mensagem */
        String message = "";
        
        /* Variavel que pega o ID do formulario */
        int get_ParameterById = Integer.parseInt(objUpload.getForm().get("iid").toString());

        LivroDAO objDAO = new LivroDAO();

        Livro objLivro = Livro.getBuilder().comId(get_ParameterById).constroi();

        try {
            objDAO.deletar(objLivro);
            message = "Livro excluido com sucesso!";
        } catch (ClassNotFoundException | SQLException ex) {
            message = "Erro ao excluir livro: " + ex.getMessage();
            System.out.println("Erro: " + ex.getMessage());
        }

        request.setAttribute("message", message);
        return "resultadodeletar.jsp";
    }
}
