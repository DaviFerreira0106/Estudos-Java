<%-- 
    Document   : excluir
    Created on : 10 de abr. de 2024, 11:11:29
    Author     : daviferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="../images/favicon.ico" type="image/x-ico">
        <link rel="stylesheet" type="text/css" href="../style/style excluir/style-excluir-mobile.css"/>
        <link rel="stylesheet" type="text/css" href="../style/style excluir/style-mediaQuery-excluir.css">
        <title>Acervo Digital / Excluir</title>
    </head>
    <body>
        <header>
            <h1>Excluir Livro</h1>
        </header>
        <main>
            <form id="pesquisa" action="#" method="post">
                <p>
                    <label for="icodigo">Código do Livro</label>
                    <input type="search" name="codigo" id="icodigo" maxlength="40" placeholder=" &#x1F50D Digite o Código do Livro"
                </p>
            </form>
            <div id="linha">
                <form id="formulario" action="#" method="post">
                    <div id="dados">
                        <p>
                            <div id="imagem">
                                <!-- Aqui vai a Imagem -->
                            </div>
                        </p>
                        <p>
                            <input id="buttonExcluir" name="btnOperacao" type="button" value="Excluir">
                        </p>
                    </div>
                </form>
            </div>
        </main>
    </body>
</html>
