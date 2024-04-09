<%-- 
    Document   : consultar
    Created on : 9 de abr. de 2024, 11:41:34
    Author     : daviferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="../images/favicon.ico" type="image/x-ico">
        <link rel="stylesheet" type="text/css" href="../style/style consultar/style-consultar-mobile.css">
        <link rel="stylesheet" type="text/css" href="../style/style consultar/style-mediaQuery-consultar.css">
        <title>Acervo Digital / Consultar</title>
    </head>
    <body>
        <main>
            <div id="linha">
                <div id="foto">
                    
                </div>
                <div id="informacoes">
                    <p class="dados" id="nomeLivro">
                        Nome do Livro: 
                    </p>
                    <p class="dados" id="autor">
                        Autor: 
                    </p>
                    <p class="dados" id="genero">
                        Gênero: 
                    </p>
                    <p class="dados" id="editora">
                        Editora: 
                    </p>
                    <p class="dados" id="anoPublicacao">
                        Ano de Publicação: 
                    </p>
                    <form action="#" method="post">
                        <p id="btnAtualizar">
                            <input class="button" type="button" value="Atualizar">
                        </p> 
                        <p id="btnExcluir">
                            <input class="button" type="button" value="Excluir">
                        </p>
                    </form>
                </div>
            </div>
        </main>
    </body>
</html>
