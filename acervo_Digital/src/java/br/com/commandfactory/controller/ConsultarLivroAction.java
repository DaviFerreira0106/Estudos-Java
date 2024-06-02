/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import DAO.LivroDAO;
import Model.Livro;
import Util.Upload;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daviferreira
 */
public class ConsultarLivroAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response, Upload objUpload) throws Exception {
        /* Variavel para tratamento de mensagem */
        String message = "";
        
        /* Criação do objeto de acesso ao Banco de Dados */
        LivroDAO objDAO = new LivroDAO();

        /* Criação de objeto Lista para armazenar os dados do obj trazidos do BD */
        List<Livro> objLista = new ArrayList<>();

        /* Chamar o objeto lista para que os valores do objDAO sejam armazenados na lista */
        try {
            objLista = objDAO.consultarTodos();
        } catch (ClassNotFoundException | SQLException ex) {
            message = "Erro" + ex.getMessage();
            System.out.println("Erro" + message);
        }

        /* Armazenar a mensagem de cadastro na memoria do servidor / computador e passar ela para a pagina de resposta */
        request.setAttribute("lista", objLista);
        return "consultar.jsp";
    }
}
