<%-- 
    Document   : consultar
    Created on : 9 de abr. de 2024, 11:41:34
    Author     : daviferreira
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Livro"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/favicon.ico" type="image/x-ico">
        <link rel="stylesheet" type="text/css" href="style/style consultar/style-consultar-mobile.css">
        <link rel="stylesheet" type="text/css" href="style/style consultar/style-mediaQuery-consultar.css">
        <title>Acervo Digital / Consultar</title>
    </head>

    <body>
        <%
            /* Criação de objeto lista, para pegar atributos armazenados na memoria pela servlet */
            List<Livro> objListaLivro = (List<Livro>) request.getAttribute("lista");
        %>
        <main>
            <%
                if (!objListaLivro.isEmpty()) {
            %>
            <div id="linha">
                <%
                    /* Criação de estrutura de repetição para dados armazenados na lista */
                    for (Livro objLivro : objListaLivro) {
                %>
                <div id="foto">
                    <img id="image" src="fotos/<% out.println(objLivro.getImagem());%>"> 
                </div>
                <div id="informacoes">
                    
                    <p class="dados" id="precoLivro">
                        Preço: <% out.println(objLivro.getPreco()); %>
                    </p>
                    
                    <p class="dados" id="nomeLivro">
                        Nome do Livro: <% out.println(objLivro.getTitulo()); %>
                    </p>

                    <p class="dados" id="autor">
                        Autor: <% out.println(objLivro.getAutor()); %>
                    </p>

                    <p class="dados" id="genero">
                        Gênero: <% out.println(objLivro.getGenero()); %>
                    </p>

                    <p class="dados" id="editora">
                        Editora: <% out.println(objLivro.getEditora()); %>
                    </p>

                    <p class="dados" id="anoPublicacao">
                        Ano de Publicação: <% out.println(objLivro.getAnoPublicacao()); %>
                    </p>
                    <form action="Servlet_Acervo" method="post" enctype="multipart/form-data">
                       <p id="btnAtualizar">
                           <%--<%request.setAttribute("idCod", objLivro.getId());%>--%>
                           <input type="hidden" name="id" value="<%out.print(objLivro.getId()); %>">
                            <button class="button" type="submit" name="btnOperacao" value="ConsultarID">Atualizar</button>
                        </p>
                        <p id="btnExcluir">
                            <input type="hidden" name="iid" value="<%out.print(objLivro.getId()); %>">
                            <button class="button" type="submit" name="btnOperacao" value="Excluir">Excluir</button>
                        </p> 
                    </form>
                    
                </div>
                <%}
                    } else {%>
                <h2 id="txtcodigo">Não há Livros Cadastrados!</h2>
                <div id="imagem_sem_cadastro"> 
                    <picture>
                        <source media="(max-width: 900px)" srcset="images/sem-cadastro200px.png" type="image/png">
                        <img id="imagem_sem_cadastro" src="images/sem-cadastro300px.png" alt="Sem Livros cadastrados">
                    </picture>
                </div>
                <%}%>
            </div>
        </main>
    </body>
</html>
