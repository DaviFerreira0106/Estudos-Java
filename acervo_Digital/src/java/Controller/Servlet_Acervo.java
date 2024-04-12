/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.LivroDAO;
import Model.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
            
            /* Variavel que pega a informação passada dos formularios */
            String get_Parameter = request.getParameter("btnOperacao");
            
            /* Variavel para tratamento de mensagem */
            String message = "";
            
            /* Estrutura condicional */
            if(get_Parameter.equals("Cadastrar")){
                /* Variaveis para armazenar o valor pego dos input de cadastro */
                int id = Integer.parseInt(request.getParameter("id"));
                String titulo = request.getParameter("titulo");
                double preco = Double.parseDouble(request.getParameter("preco"));
                String autor = request.getParameter("autor");
                String genero = request.getParameter("genero");
                String editora = request.getParameter("editora");
                String idioma = request.getParameter("idioma");
                String classificacao = request.getParameter("classificacao");
                int anoPublicacao = Integer.parseInt(request.getParameter("anoPublicacao"));
                int numeroPaginas = Integer.parseInt(request.getParameter("pagina"));
                
                /* Criação dos Objetos para efetuar as operações e persistir os dados */
                Livro objLivro = new Livro();
                LivroDAO objDAO = new LivroDAO();
                
                /* armazenar os dados pegos dos input, nos atributos da classe Livro */
                objLivro.setId(id);
                objLivro.setTitulo(titulo);
                objLivro.setPreco(preco);
                objLivro.setAutor(autor);
                objLivro.setGenero(genero);
                objLivro.setEditora(editora);
                objLivro.setIdioma(idioma);
                objLivro.setClassificacaoIndicativa(classificacao);
                objLivro.setAnoPublicacao(anoPublicacao);
                objLivro.setNumeroPaginas(numeroPaginas);
                
                /* Chamar o objDAO para persistir os dados no banco de dados */
                try {
                    objDAO.cadastrar(objLivro);
                    message = "Livro cadastrado com sucesso!";
                } catch(ClassNotFoundException | SQLException ex) {
                    message = "Livro não cadastrado" + ex.getMessage();
                    System.out.println("Erro: " + ex.getMessage());
                }
                
                /* Armazenar a mensagem de cadastro na memoria do servidor / computador e passar ela para a pagina de resposta */
                request.setAttribute("message", message);
                request.getRequestDispatcher("/respostaTemp.jsp").forward(request, response);
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
