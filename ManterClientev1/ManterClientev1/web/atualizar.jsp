<%-- 
    Document   : atualizar
    Created on : 18/03/2024, 10:38:48
    Author     : alunos
--%>

<%@page import="model.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar</title>
    </head>
    <body>
        <h1>Atualizar</h1>
        <%
            List<Cliente> lcli = (List<Cliente>) request.getAttribute("lcli");
        %>
        <table>
            <th>ID</th>
            <th>Nome</th>
            <th>Telefone</th>
            <th>Endereço</th>
            <th>Editar</th>
            <th>Excluir</th>
            
        </table>
    </body>
</html>
