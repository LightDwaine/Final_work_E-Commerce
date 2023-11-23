<%-- 
    Document   : novo
    Created on : 27 de out de 2023, 16:25:25
    Author     : leoomoreira
--%>

<%@page import="categoria.modelo.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar dados da Categoria</title>
    </head>
    <body>
        <h1>Atualizar categoria</h1>
        <% Categoria c = (Categoria) request.getAttribute("categoria"); %>
        <form action="AtualizarCategoria">
            <input type="hidden" name="id" value="<%= c.getId() %>" />
            Nome: <input type="text" name="nome" value="<%= c.getNome() %>" />
            <br/>
            <input type="submit" value="Salvar" />
        </form>
    </body>
</html>
