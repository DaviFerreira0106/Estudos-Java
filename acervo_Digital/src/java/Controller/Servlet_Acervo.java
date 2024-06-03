/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.LivroDAO;
import Model.Livro;
import Util.Upload;
import br.com.commandfactory.controller.ICommand;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daviferreira
 */
@WebServlet(name = "Servlet_Acervo", urlPatterns = {"/Servlet_Acervo"})
public class Servlet_Acervo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            /* Utilizando classe upload para realizar o envio dos dados e imagem */
            Upload objUpload = new Upload();

            /* Criando pasta fotos para setar as imagens lá */
            objUpload.setFolderUpload("fotos");

            if (objUpload.formProcess(getServletContext(), request)) {

                /* Variavel que pega a informação passada dos formularios */
                String get_Parameter = objUpload.getForm().get("btnOperacao").toString();
                
                /* Montagem do nome da classe de acordo com solicitação requisitada */
                String nomeClasse = "br.com.commandfactory.controller." + get_Parameter + "LivroAction";
                
                /* Criação de classe (meta-programação) */
                Class classeAction = Class.forName(nomeClasse);
                
                /* Instancia a classe utilizando a factory da classe criada */
                ICommand commandAction = (ICommand) classeAction.newInstance();
                
                /* Executa a ação */
                String pageDispatcher = commandAction.executar(request, response, objUpload);
                RequestDispatcher rd = request.getRequestDispatcher(pageDispatcher);
                rd.forward(request, response);
            }
        }catch(Exception e){
            request.setAttribute("message", e);
            RequestDispatcher rd = request.getRequestDispatcher("/respostaTemp.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
