/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.LivroDAO;
import Model.Livro;
import Util.Upload;
import java.io.File;
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
                /* Variavel para tratamento de mensagem */
                String message = "";

                /* Estrutura condicional */
                if (get_Parameter.equals("Cadastrar")) {

                    /* Variaveis para armazenar o valor pego dos input de cadastro */
                    int id = Integer.parseInt(objUpload.getForm().get("id").toString());
                    String titulo = objUpload.getForm().get("titulo").toString();
                    double preco = Double.parseDouble(objUpload.getForm().get("preco").toString());
                    String autor = objUpload.getForm().get("autor").toString();
                    String genero = objUpload.getForm().get("genero").toString();
                    String editora = objUpload.getForm().get("editora").toString();
                    String idioma = objUpload.getForm().get("idioma").toString();
                    String classificacao = objUpload.getForm().get("classificacao").toString();
                    int anoPublicacao = Integer.parseInt(objUpload.getForm().get("anoPublicacao").toString());
                    int numeroPaginas = Integer.parseInt(objUpload.getForm().get("pagina").toString());
                    String imagem = objUpload.getFiles().get(0);

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
                    objLivro.setImagem(imagem);

                    /* Chamar o objDAO para persistir os dados no banco de dados */
                    try {
                        objDAO.cadastrar(objLivro);
                        message = "Livro cadastrado com sucesso!";
                    } catch (ClassNotFoundException | SQLException ex) {
                        message = "Livro não cadastrado" + ex.getMessage();
                        System.out.println("Erro: " + ex.getMessage());
                    }


                    /* Armazenar a mensagem de cadastro na memoria do servidor / computador e passar ela para a pagina de resposta */
                    request.setAttribute("message", message);
                    request.getRequestDispatcher("/respostaTemp.jsp").forward(request, response);
                } else if (get_Parameter.equals("Excluir")) {
                    /* Variavel que pega o ID do formulario */
                    int get_ParameterById = Integer.parseInt(objUpload.getForm().get("iid").toString());

                    Livro objLivro = new Livro();
                    LivroDAO objDAO = new LivroDAO();

                    objLivro.setId(get_ParameterById);

                    try {
                        objDAO.deletar(objLivro);
                        message = "Livro excluido com sucesso!";
                    } catch (ClassNotFoundException | SQLException ex) {
                        message = "Erro ao excluir livro: " + ex.getMessage();
                        System.out.println("Erro: " + ex.getMessage());
                    }

                    request.setAttribute("message", message);
                    request.getRequestDispatcher("/resultadodeletar.jsp").forward(request, response);
                    
                } else if (get_Parameter.equals("Consultar")) {

                    /* Criação do objeto de acesso ao Banco de Dados */
                    LivroDAO objDAO = new LivroDAO();

                    /* Criação de objeto Lista para armazenar os dados do obj trazidos do BD */
                    List<Livro> objLista = new ArrayList<>();

                    /* Chamar o objeto lista para que os valores do objDAO sejam armazenados na lista */
                    try {
                        objLista = objDAO.consultarTodos();
                    } catch (ClassNotFoundException | SQLException ex) {
                        message = "Erro" + ex.getMessage();
                        out.println("Erro" + message);
                    }

                    /* Armazenar a mensagem de cadastro na memoria do servidor / computador e passar ela para a pagina de resposta */
                    request.setAttribute("lista", objLista);
                    request.getRequestDispatcher("/consultar.jsp").forward(request, response);
                } else if (get_Parameter.equals("ConsultarExcluir")) {

                    /* Criação do objeto de acesso ao Banco de Dados */
                    LivroDAO objDAO = new LivroDAO();

                    /* Criação de objeto Lista para armazenar os dados do obj trazidos do BD */
                    List<Livro> objLista = new ArrayList<>();

                    /* Chamar o objeto lista para que os valores do objDAO sejam armazenados na lista */
                    try {
                        objLista = objDAO.consultarTodos();
                    } catch (ClassNotFoundException | SQLException ex) {
                        message = "Erro" + ex.getMessage();
                        out.println("Erro" + message);
                    }

                    /* Armazenar a mensagem de cadastro na memoria do servidor / computador e passar ela para a pagina de resposta */
                    request.setAttribute("lista", objLista);
                    request.getRequestDispatcher("/excluir.jsp").forward(request, response);
                } else if (get_Parameter.equals("ConsultarID")) {

                    /* variavel que receberá o id */
                    int id = Integer.parseInt(objUpload.getForm().get("id").toString());

                    Livro objLivro = new Livro();
                    LivroDAO objDao = new LivroDAO();
                    objLivro.setId(id);
                    try {
                        objLivro = objDao.consultarporId(objLivro);
                        request.setAttribute("objLivro", objLivro);
                        request.getRequestDispatcher("/atualizar.jsp").forward(request, response);
                    } catch (ClassNotFoundException | SQLException ex) {
                        System.out.println("Erro ClassNotFound: " + ex.getMessage());
                    }

                }else if (get_Parameter.equals("ConsultarIdExcluir")) {

                    /* variavel que receberá o id */
                    int id = Integer.parseInt(objUpload.getForm().get("id").toString());

                    Livro objLivro = new Livro();
                    LivroDAO objDao = new LivroDAO();
                    objLivro.setId(id);

                    /* Criação de objeto Lista para armazenar os dados do obj trazidos do BD */
                    List<Livro> objLista = new ArrayList<>();
                    try {
                        objLista.add(objDao.consultarporId(objLivro));
                        request.setAttribute("lista", objLista);
                        request.getRequestDispatcher("/excluir.jsp").forward(request, response);
                    } catch (ClassNotFoundException | SQLException ex) {
                        System.out.println("Erro ClassNotFound: " + ex.getMessage());
                    }

                }else if (get_Parameter.equals("Atualizar")) {

                    if (objUpload.getFiles().isEmpty()) {
                        /* Criação de variaveis que receberá os valore via parametro */
                        int id = Integer.parseInt(objUpload.getForm().get("id").toString());
                        String titulo = objUpload.getForm().get("titulo").toString();
                        double preco = Double.parseDouble(objUpload.getForm().get("preco").toString());
                        String autor = objUpload.getForm().get("autor").toString();
                        String genero = objUpload.getForm().get("genero").toString();
                        String editora = objUpload.getForm().get("editora").toString();
                        String idioma = objUpload.getForm().get("idioma").toString();
                        String classificacaoIndicativa = objUpload.getForm().get("classificacao").toString();
                        int anoPublicacao = Integer.parseInt(objUpload.getForm().get("anoPublicacao").toString());
                        int numeroPagina = Integer.parseInt(objUpload.getForm().get("pagina").toString());
                        /* Pegando instancia dos objetos armazenados em memoria */
                        String imagem = objUpload.getForm().get("imagem").toString();

                        /* Criação de objetos de acesso */
                        Livro objLivro = new Livro();
                        LivroDAO objDao = new LivroDAO();

                        /* Setando o valor recebido como parametro nas variaveis de acesso da classe livro */
                        objLivro.setId(id);
                        objLivro.setTitulo(titulo);
                        objLivro.setPreco(preco);
                        objLivro.setAutor(autor);
                        objLivro.setGenero(genero);
                        objLivro.setEditora(editora);
                        objLivro.setIdioma(idioma);
                        objLivro.setClassificacaoIndicativa(classificacaoIndicativa);
                        objLivro.setAnoPublicacao(anoPublicacao);
                        objLivro.setNumeroPaginas(numeroPagina);
                        objLivro.setImagem(imagem);

                        /* Tratamento de erros na atualização dos dados */
                        try {
                            /* passando dados para classe DAO */
                            objDao.atualizar(objLivro);
                            message = "Livro Atualizado com sucesso!";
                        } catch (ClassNotFoundException | SQLException ex) {
                            message = "Erro: " + ex.getMessage();
                        }
                        request.setAttribute("message", message);
                        request.getRequestDispatcher("/respostaAtualizar.jsp").forward(request, response);
                    } else {
                        /* Criação de variaveis que receberá os valore via parametro */
                        int id = Integer.parseInt(objUpload.getForm().get("id").toString());
                        String titulo = objUpload.getForm().get("titulo").toString();
                        double preco = Double.parseDouble(objUpload.getForm().get("preco").toString());
                        String autor = objUpload.getForm().get("autor").toString();
                        String genero = objUpload.getForm().get("genero").toString();
                        String editora = objUpload.getForm().get("editora").toString();
                        String idioma = objUpload.getForm().get("idioma").toString();
                        String classificacaoIndicativa = objUpload.getForm().get("classificacao").toString();
                        int anoPublicacao = Integer.parseInt(objUpload.getForm().get("anoPublicacao").toString());
                        int numeroPagina = Integer.parseInt(objUpload.getForm().get("pagina").toString());
                        String imagem = objUpload.getFiles().get(0);

                        /* Criação de objetos de acesso */
                        Livro objLivro = new Livro();
                        LivroDAO objDao = new LivroDAO();

                        /* Setando o valor recebido como parametro nas variaveis de acesso da classe livro */
                        objLivro.setId(id);
                        objLivro.setTitulo(titulo);
                        objLivro.setPreco(preco);
                        objLivro.setAutor(autor);
                        objLivro.setGenero(genero);
                        objLivro.setEditora(editora);
                        objLivro.setIdioma(idioma);
                        objLivro.setClassificacaoIndicativa(classificacaoIndicativa);
                        objLivro.setAnoPublicacao(anoPublicacao);
                        objLivro.setNumeroPaginas(numeroPagina);
                        objLivro.setImagem(imagem);

                        /* Tratamento de erros na atualização dos dados */
                        try {
                            /* passando dados para classe DAO */
                            objDao.atualizar(objLivro);
                            request.getRequestDispatcher("/index.html").forward(request, response);
                        } catch (ClassNotFoundException | SQLException ex) {
                            System.out.println("Erro: " + ex.getMessage());
                        }
                    }

                }
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
