<%-- 
    Document   : respostaAtualizar
    Created on : 2 de jun. de 2024, 15:49:17
    Author     : daviferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/favicon.ico" type="image/x-ico">
        <title>Acervo Digital / Atualizar</title>
    </head>
    <body>
        <h2 id="mensagem"><%
            String message = (String) request.getAttribute("message");
            out.println(message);

            %>
        </h2>
        <script>
            const message = document.querySelector('#menssagem');

            window.alert(`${message}`);

            window.location.assign('http://localhost:8080/acervo_Digital/index.html');
        </script>
    </body>
</html>
