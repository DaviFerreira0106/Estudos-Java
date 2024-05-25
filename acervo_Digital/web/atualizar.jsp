<%-- 
    Document   : atualizar
    Created on : 10 de abr. de 2024, 00:19:39
    Author     : daviferreira
--%>

<%@page import="Model.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shorcut icon" href="images/favicon.ico" type="image/x-ico">
        <link rel="stylesheet" type="text/css" href="style/style atualizar/style-atualizar-mobile.css">
        <link rel="stylesheet" type="text/css" href="style/style atualizar/style-mediaQuery-atualizar.css">
        <title>Acervo Digital / Atualizar</title>
    </head>
    <body>
        <%
            Livro objLivro = (Livro) request.getAttribute("objLivro");
        %>
        <header>
            <h1>Atualizar Acervo</h1>
        </header>
        <main>
            <!-- Verifica se tem livros cadastrados pelo id, caso tenha, exibe formulario para digitar id do livro -->
            <%if(objLivro.getId() != 0) {%>
            <div id="imagem">
                <!<!-- Aqui vai a Imagem do BD -->
            </div>
            <div id="dados">
                <form action="Servlet_Acervo" method="post" autocomplete="on">
                    <p>
                        <label for="iid">Id</label>
                        <input class="campo" name="id" id="iid" type="number" value="<%out.print(objLivro.getId());%>">
                    </p>
                    <p>
                        <label for="ititulo">Titulo</label>
                        <input class="campo" name="titulo" id="ititulo" type="text" value="<%out.print(objLivro.getTitulo());%>">
                    </p>
                    <p>
                        <label for="ipreco">Preço</label>
                        <input class="campo" name="preco" id="ipreco" type="number" value="<%out.print(objLivro.getPreco());%>">
                    </p>
                    <p>
                        <label for="iautor">Autor</label>
                        <input class="campo" name="autor" id="iautor" type="text" value="<%out.print(objLivro.getAutor());%>">
                    </p>
                    <p>
                        <label for="igenero">Genero</label>
                        <input class="campo" name="genero" id="igenero" type="text" value="<%out.print(objLivro.getGenero());%>">
                    </p>
                    <p>
                        <label for="ieditora">Editora</label>
                        <input class="campo" name="editora" id="ieditora" type="text" value="<%out.print(objLivro.getEditora());%>">
                    </p>
                    <p>
                        <label for="iidioma">Idioma</label>
                        <input class="campo" name="idioma" id="iidioma" type="text" value="<%out.print(objLivro.getIdioma());%>">
                    </p>
                    <p>
                        <label for="iclassificacao">Classificação Indicativa</label>
                        <input class="campo" name="classificacao" id="iclassificacao" type="text" value="<%out.print(objLivro.getClassificacaoIndicativa());%>">
                    </p>
                    <p>
                        <label for="ianoPublicacao">Ano de Publicação</label>
                        <input class="campo" name="anoPublicacao" id="ianoPublicacao" type="number" value="<%out.print(objLivro.getAnoPublicacao());%>">
                    </p>
                    <p>
                        <label for="ipagina">Número de Páginas</label>
                        <input class="campo" name="pagina" id="ipagina" type="number" value="<%out.print(objLivro.getNumeroPaginas());%>">
                    </p>
                    <p>
                        <input type="submit" value="Atualizar" id="btnOperacao" name="btnOperacao">
                    </p>
                </form>
            </div>
            <!-- Caso não tenha livro cadastrado, retorna um else vazio para não exibir formulario -->
            <%}else {%>
                <h2 id="txtcodigo">Não há Livros para Atualizar!</h2>
                <div id="imagem_sem_cadastro"> 
                    <picture>
                        <source media="(max-width: 900px)" srcset="images/sem-cadastro200px.png" type="image/png">
                        <img id="image" src="images/sem-cadastro300px.png" alt="Sem Livros cadastrados">
                    </picture>
                </div>
            <%}%>
        </main>
    </body>
</html>
