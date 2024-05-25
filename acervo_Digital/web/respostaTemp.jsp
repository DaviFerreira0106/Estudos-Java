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
        <title>JSP Page</title>
        <script>
            window.alert(message);
        </script>
    </head>
    <body>
        <h1>Resultado Cadastro!</h1>
        <h2>
            <%
                String message = (String) request.getAttribute("message");
                out.println(message);
            %>
            
        </h2>
        
    </body>
</html>
