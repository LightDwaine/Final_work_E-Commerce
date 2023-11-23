<%-- 
    Document   : novo
    Created on : 27 de out de 2023, 16:25:25
    Author     : leoomoreira
--%>

<%@page import="produto.modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar dados do Produto</title>
    </head>
    <body>
        <h1>Atualizar produto</h1>
        <% Produto c = (Produto) request.getAttribute("produto"); %>
        <form action="AtualizarProduto">
            <input type="hidden" name="id" value="<%= c.getId() %>" />
            Nome: <input type="text" name="descricao" value="<%= c.getDescricao() %>" />
            <br/>
            <input type="submit" value="Salvar" />
        </form>
    </body>
</html>
