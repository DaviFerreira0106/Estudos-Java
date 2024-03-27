<%-- 
    Document   : listarTodos
    Created on : 18/03/2024, 10:44:31
    Author     : alunos
--%>

<%@page import="java.util.List"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Todos</title>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <%
            List<Cliente> lcli = (List<Cliente>) request.getAttribute("lcli");
        %>

        <table border="1">
            <th>Id</th>
            <th>Nome</th>
            <th>Endereço</th>
            <th>Telefone</th>

            <%
                for (Cliente c : lcli) {
            %><tr><%
                %><td><%out.println(c.getId());%></td><%
                %><td><%out.println(c.getNome());%></td><%
                %><td><%out.println(c.getEndereco());%></td><%
                %><td><%out.println(c.getTelefone());%></td><%
            %></tr><%
                    }
            %>
        </table>

    </body>
</html>
