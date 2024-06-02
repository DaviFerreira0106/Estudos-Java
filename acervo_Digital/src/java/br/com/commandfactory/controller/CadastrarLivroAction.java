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
public class CadastrarLivroAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response, Upload objUpload) throws Exception{
        /* Variavel para tratamento de mensagem */
        String message = "";

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
        LivroDAO objDAO = new LivroDAO();

        /* armazenar os dados pegos dos input, nos atributos da classe Livro */
        Livro objLivro = Livro.getBuilder()
                .comId(id)
                .comTitulo(titulo)
                .comPreco(preco)
                .comAutor(autor)
                .comGenero(genero)
                .comEditora(editora)
                .comIdioma(idioma)
                .comClassificacaoIndicativa(classificacao)
                .comAnoPublicacao(anoPublicacao)
                .comNumeroPaginas(numeroPaginas)
                .comImagem(imagem)
                .constroi();

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
        return "respostaTemp.jsp";
    }
}
