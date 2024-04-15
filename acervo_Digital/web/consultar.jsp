<%-- 
    Document   : consultar
    Created on : 9 de abr. de 2024, 11:41:34
    Author     : daviferreira
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="../images/favicon.ico" type="image/x-ico">
        <link rel="stylesheet" type="text/css" href="style/style consultar/style-consultar-mobile.css">
        <link rel="stylesheet" type="text/css" href="style/style consultar/style-mediaQuery-consultar.css">
        <title>Acervo Digital / Consultar</title>
    </head>
    
    <body>
        <% 
            /* Criação de objeto lista, para pegar atributos armazenados na memoria pela servlet */
            List<Livro> objListaLivro = (List<Livro>) request.getAttribute("message");
        %>
        <main>
            <div id="linha">
                <%
                    /* Criação de estrutura de repetição para dados armazenados na lista */
                    for(Livro objLivro : objListaLivro) {
                %>
                <div id="foto">
                    
                </div>
                <div id="informacoes">
                    
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
                    
                    <form action="Servlet_Acervo" method="post">
                        <p id="btnAtualizar">
                            <a href="atualizar.jsp"><input class="button" type="button" value="Atualizar"></a>
                        </p> 
                        <p id="btnExcluir">
                            <input class="button" type="submit" value="Excluir" id="btnOperacao" name="btnOperacao">
                        </p>
                    </form>
                </div>
                <%
                    }
                %>
            </div>
        </main>
    </body>
</html>
