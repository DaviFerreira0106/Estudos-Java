<%-- 
    Document   : cadastro
    Created on : 7 de abr. de 2024, 16:24:50
    Author     : daviferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="../images/favicon.ico" type="image/x-ico">
        <link rel="stylesheet" href="../style/style-cadastro/style-cadastro.css">
        <title>Acervo Digital / Cadastrar</title>
    </head>
    <body>
        <header>
            <h1>Cadastrar Acervo</h1>
        </header>
        <main>
            <div id="imagem">

            </div>
            <section id="formulario">
                <form action="#" method="post" autocomplete="on">
                    <p>
                        <label for="iid">Id</label>
                        <input name="id" id="iid" type="number" required min="1">
                    </p>
                    <p>
                        <label for="ititulo">Titulo</label>
                        <input name="titulo" id="ititulo" type="text" required maxlength="20">
                    </p>
                    <p>
                        <label for="ipreco">Preço</label>
                        <input name="preco" id="ipreco" type="number" required min="1">
                    </p>
                    <p>
                        <label for="iautor">Autor</label>
                        <input name="autor" id="iautor" type="text" required maxlength="30">
                    </p>
                    <p>
                        <label for="igenero">Genero</label>
                        <input name="genero" id="igenero" type="text" required maxlength="15">
                    </p>
                    <p>
                        <label for="ieditora">Editora</label>
                        <input name="editora" id="ieditora" type="text" required maxlength="15">
                    </p>
                    <p>
                        <label for="iidioma">Idioma</label>
                        <input name="idioma" id="iidioma" type="text" required maxlength="10">
                    </p>
                    <p>
                        <label for="iclassificacao">Classificação Indicativa</label>
                        <input name="classificacao" id="iclassificacao" type="text" required maxlength="8">
                    </p>
                    <p>
                        <label for="ianoPublicacao">Ano de Publicação</label>
                        <input name="anoPublicacao" id="ianoPublicacao" type="number" required>
                    </p>
                    <p>
                        <label for="ipagina">Número de Páginas</label>
                        <input name="pagina" id="ipagina" type="number" required>
                    </p>
                    <p>
                        <input type="submit" value="Cadastrar">
                    </p>
                </form>
            </section>
        </main>
    </body>
</html>
