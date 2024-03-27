/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;

/**
 *
 * @author PTOLEDO
 */
@WebServlet(name = "Controller_Cliente", urlPatterns = {"/Controller_Cliente"})
public class Controller_Cliente extends HttpServlet {

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

            String op = request.getParameter("btnoperacao");
            String message = "";
            if (op.equals("CADASTRAR")) {
                String nome = request.getParameter("txtnome");
                String telefone = request.getParameter("txttelefone");
                String endereco = request.getParameter("txtendereco");

                Cliente cli = new Cliente();
                ClienteDAO clidao = new ClienteDAO();

                cli.setNome(nome);
                cli.setTelefone(telefone);
                cli.setEndereco(endereco);

                try {
                    clidao.cadastrar(cli);
                    message = "CADATRADO COM SUCESSO";
                } catch (ClassNotFoundException | SQLException ex) {
                    message = "CADASTRO NÃO REALIZADO: " + ex.getMessage();
                    System.out.println("Erro: " + ex.getMessage());
                }
                
                request.setAttribute("message", message);
                request.getRequestDispatcher("/resultadocadastrar.jsp").forward(request, response);
            }  
            else if (op.equals("DELETAR")) {
                int id = Integer.parseInt(request.getParameter("txtid"));

                Cliente cli = new Cliente();
                ClienteDAO clidao = new ClienteDAO();

                cli.setId(id);

                try {
                    clidao.excluir(cli);
                    message = "EXCLUÍDO COM SUCESSO";
                } catch (ClassNotFoundException | SQLException ex) {
                    message = "EXCLUSÃO NÃO REALIZADO: " + ex.getMessage();
                    System.out.println("Erro: " + ex.getMessage());
                }
                
                request.setAttribute("message", message);
                request.getRequestDispatcher("/resultadodeletar.jsp").forward(request, response);
            }else if(op.equals("EXIBIR TODOS")){
                
                ClienteDAO clidao = new ClienteDAO();
                List<Cliente> lcli = new ArrayList<>();
                try{
                   lcli = clidao.listarTodos();
                }catch (ClassNotFoundException | SQLException ex){
                    message = "ERRO" + ex.getMessage();
                    System.out.println("ERRO" + message);
                }
                
                request.setAttribute("lcli", lcli);
                request.getRequestDispatcher("/listarTodos.jsp").forward(request, response);
            }
            
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
