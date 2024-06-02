<%-- 
    Document   : repostaTemp
    Created on : 11 de abr. de 2024, 11:07:26
    Author     : daviferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/favicon.ico" type="image/x-ico">
        <title>Acervo Digital / Cadastrar</title>
    </head>
    <body>
        <h2 id="menssagem">
            <%
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
