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
public class AtualizarLivroAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response, Upload objUpload) throws Exception {
        /* Variavel para tratamento de mensagem / pagina a ser enviada*/
        String message = "";
        
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
            LivroDAO objDao = new LivroDAO();

            /* Setando o valor recebido como parametro nas variaveis de acesso da classe livro */
            Livro objLivro = Livro.getBuilder()
                    .comId(id)
                    .comTitulo(titulo)
                    .comPreco(preco)
                    .comAutor(autor)
                    .comGenero(genero)
                    .comEditora(editora)
                    .comIdioma(idioma)
                    .comClassificacaoIndicativa(classificacaoIndicativa)
                    .comAnoPublicacao(anoPublicacao)
                    .comNumeroPaginas(numeroPagina)
                    .comImagem(imagem)
                    .constroi();

            /* Tratamento de erros na atualização dos dados */
            try {
                /* passando dados para classe DAO */
                objDao.atualizar(objLivro);
                message = "Livro Atualizado com sucesso!";
            } catch (ClassNotFoundException | SQLException ex) {
                message = "Erro: " + ex.getMessage();
            }
            request.setAttribute("message", message);
            return "respostaAtualizar.jsp";
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
            LivroDAO objDao = new LivroDAO();

            /* Setando o valor recebido como parametro nas variaveis de acesso da classe livro */
            Livro objLivro = Livro.getBuilder()
                    .comId(id)
                    .comTitulo(titulo)
                    .comPreco(preco)
                    .comAutor(autor)
                    .comGenero(genero)
                    .comEditora(editora)
                    .comIdioma(idioma)
                    .comClassificacaoIndicativa(classificacaoIndicativa)
                    .comAnoPublicacao(anoPublicacao)
                    .comNumeroPaginas(numeroPagina)
                    .comImagem(imagem)
                    .constroi();

            /* Tratamento de erros na atualização dos dados */
            try {
                /* passando dados para classe DAO */
                objDao.atualizar(objLivro);
                message = "Livro atualizado com sucesso!";

            } catch (ClassNotFoundException | SQLException ex) {
                message = "Erro: " + ex.getMessage();
            }

            request.setAttribute("message", message);
            return "respostaAtualizar.jsp";
        }
    }
}
