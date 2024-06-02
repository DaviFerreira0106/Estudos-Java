<%-- 
    Document   : excluir
    Created on : 10 de abr. de 2024, 11:11:29
    Author     : daviferreira
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Livro"%>
<%@page import="Model.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/favicon.ico" type="image/x-ico">
        <link rel="stylesheet" type="text/css" href="style/style excluir/style-excluir-mobile.css"/>
        <link rel="stylesheet" type="text/css" href="style/style excluir/style-mediaQuery-excluir.css">
        <title>Acervo Digital / Excluir</title>
    </head>
    <body>
        <%
            /* Criação de objeto lista, para pegar atributos armazenados na memoria pela servlet */
            List<Livro> objListaLivro = (List<Livro>) request.getAttribute("lista");
        %>
        <header>
            <h1>Excluir Livro</h1>
        </header>
        <main>
            <form id="formulario" action="Servlet_Acervo" method="post" enctype="multipart/form-data">
                <%
                    if (!objListaLivro.isEmpty()) {
                %>
                <p>
                    <label for="icodigo">Código do Livro</label>
                    <input type="search" name="id" id="icodigo" maxlength="40" placeholder=" &#x1F50D Digite o Código do Livro">
                    <button type="submit" value="ConsultarIdExcluir" id="btnOperacao" name="btnOperacao">Pesquisar</button> 
                </p>
                <%
                    /* Loop para trazer dados do BD */
                    for (Livro objLivro : objListaLivro) {
                %>
                <div id="linha">
                    <div id="dados">
                        <p>
                        <div id="imagem">
                            <img id="image" src="fotos/<% out.println(objLivro.getImagem());%>"> 
                        </div>
                        </p>
                        <p>
                            <input type="hidden" name="iid" value="<% out.print(objLivro.getId()); %>">
                            <input id="buttonExcluir" name="btnOperacao" type="submit" value="Excluir">
                        </p>
                    </div>
                </div>
                <%}%>
                <%
                } else {
                %>
                <h2 id="txtcodigo">Não há Livros Cadastrados!</h2>
                <div id="imagem_sem_cadastro"> 
                    <picture>
                        <source media="(max-width: 900px)" srcset="images/sem-cadastro200px.png" type="image/png">
                        <img id="image" src="images/sem-cadastro300px.png" alt="Sem Livros cadastrados">
                    </picture>
                </div>
                <%}%>
            </form>

        </main>
    </body>
</html>
