/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daviferreira
 */
@WebServlet(name = "LivroServilet", urlPatterns = {"/LivroServilet"})
public class LivroServilet extends HttpServlet {

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
            private static final long serialVersionUID = 1L;
            private LivroController livroController;

            public LivroServlet() {
                super();
                livroController = new LivroController();
            }

            protected void doGet(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
                String action = request.getParameter("action");

                if (action == null) {
                    action = "listar";
                }

                switch (action) {
                    case "listar":
                        listarLivros(request, response);
                        break;
                    case "adicionar":
                        adicionarLivro(request, response);
                        break;
                    case "remover":
                        removerLivro(request, response);
                        break;
                    // Adicione mais casos para outras ações conforme necessário
                    default:
                        listarLivros(request, response);
                        break;
                }
            }

            protected void doPost(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
                doGet(request, response);
            }

            private void listarLivros(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
                List<Livro> livros = livroController.consultarTodosLivros();
                request.setAttribute("livros", livros);
                request.getRequestDispatcher("listagemLivros.jsp").forward(request, response);
            }

            private void adicionarLivro(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
                // Obter parâmetros do formulário
                int id = Integer.parseInt(request.getParameter("id"));
                String titulo = request.getParameter("titulo");
                double preco = Double.parseDouble(request.getParameter("preco"));
                String autor = request.getParameter("autor");
                String genero = request.getParameter("genero");
                String editora = request.getParameter("editora");
                String idioma = request.getParameter("idioma");
                String classificacaoIndicativa = request.getParameter("classificacaoIndicativa");
                int anoPublicacao = Integer.parseInt(request.getParameter("anoPublicacao"));
                int numeroPaginas = Integer.parseInt(request.getParameter("numeroPaginas"));

                // Inserir livro
                livroController.inserirLivro(id, titulo, preco, autor, genero, editora, idioma, classificacaoIndicativa,
                        anoPublicacao, numeroPaginas);

                // Redirecionar para a página de listagem de livros
                listarLivros(request, response);
            }

            private void removerLivro(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
                // Obter ID do livro a ser removido
                int id = Integer.parseInt(request.getParameter("id"));

                // Remover livro
                livroController.deletarLivro(id);

                // Redirecionar para a página de listagem de livros
                listarLivros(request, response);
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
