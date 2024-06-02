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
public class ConsultarIDLivroAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response, Upload objUpload) throws Exception {

        
        /* variavel que receberá o id */
        int id = Integer.parseInt(objUpload.getForm().get("id").toString());

        LivroDAO objDao = new LivroDAO();
        Livro objLivro = Livro.getBuilder().comId(id).constroi();
        try {
            objLivro = objDao.consultarporId(objLivro);
            request.setAttribute("objLivro", objLivro);
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ClassNotFound: " + ex.getMessage());
        }
        
        return "atualizar.jsp";
    }
}
