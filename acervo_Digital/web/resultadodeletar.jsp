<%-- 
    Document   : resultadodeletar
    Created on : 12 de abr. de 2024, 02:41:39
    Author     : daviferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deletar Teste</title>
    </head>
    <body>
        <h1>Livro Deletado</h1>
        <h2><% 
            String message = (String) request.getAttribute("message");
            out.println(message);
        %></h2>
    </body>
</html>
