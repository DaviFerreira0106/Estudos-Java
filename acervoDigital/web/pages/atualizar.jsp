<%-- 
    Document   : atualizar
    Created on : 10 de abr. de 2024, 00:19:39
    Author     : daviferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shorcut icon" href="../images/favicon.ico" type="image/x-ico">
        <link rel="stylesheet" type="text/css" href="../style/style atualizar/style-atualizar-mobile.css">
        <link rel="stylesheet" type="text/css" href="../style/style atualizar/style-mediaQuery-atualizar.css">
        <title>Acervo Digital / Atualizar</title>
    </head>
    <body>
        <header>
            <h1>Atualizar Acervo</h1>
        </header>
        <main>
            <div id="imagem">
                <!<!-- Aqui vai a Imagem do BD -->
            </div>
            <div id="dados">
                <form action="#" method="post" autocomplete="on">
                    <p>
                        <label for="iid">Id</label>
                        <input class="campo" name="id" id="iid" type="number">
                    </p>
                    <p>
                        <label for="ititulo">Titulo</label>
                        <input class="campo" name="titulo" id="ititulo" type="text">
                    </p>
                    <p>
                        <label for="ipreco">Preço</label>
                        <input class="campo" name="preco" id="ipreco" type="number">
                    </p>
                    <p>
                        <label for="iautor">Autor</label>
                        <input class="campo" name="autor" id="iautor" type="text">
                    </p>
                    <p>
                        <label for="igenero">Genero</label>
                        <input class="campo" name="genero" id="igenero" type="text">
                    </p>
                    <p>
                        <label for="ieditora">Editora</label>
                        <input class="campo" name="editora" id="ieditora" type="text">
                    </p>
                    <p>
                        <label for="iidioma">Idioma</label>
                        <input class="campo" name="idioma" id="iidioma" type="text">
                    </p>
                    <p>
                        <label for="iclassificacao">Classificação Indicativa</label>
                        <input class="campo" name="classificacao" id="iclassificacao" type="text">
                    </p>
                    <p>
                        <label for="ianoPublicacao">Ano de Publicação</label>
                        <input class="campo" name="anoPublicacao" id="ianoPublicacao" type="number">
                    </p>
                    <p>
                        <label for="ipagina">Número de Páginas</label>
                        <input class="campo" name="pagina" id="ipagina" type="number">
                    </p>
                    <p>
                        <input type="submit" value="Atualizar" id="btnAtualizar">
                    </p>
                </form>
            </div>
            
        </main>
    </body>
</html>
