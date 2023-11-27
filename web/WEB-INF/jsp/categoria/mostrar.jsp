<%-- 
    Document   : novo
    Created on : 27 de out de 2023, 16:25:25
    Author     : leoomoreira
--%>

<%@page import="categoria.modelo.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/template/cabecalho_dados.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1 class="title">Atualizar categoria</h1>
        <div class="new-c-form">
            <% Categoria c = (Categoria) request.getAttribute("categoria"); %>
            <form action="AtualizarCategoria">
                <input type="hidden" name="id" value="<%= c.getId() %>" />
                Nome: <input class="new-c-input" type="text" name="nome" value="<%= c.getNome() %>" />
                <input type="submit" value="Salvar" />
            </form>
        </div>
        <a href="ListarProduto" class="a-btn"><div class="back-btn">Voltar</div></a>
    </body>
</html>
