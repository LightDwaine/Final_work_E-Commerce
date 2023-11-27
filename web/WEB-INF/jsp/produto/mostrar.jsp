<%-- 
    Document   : novo
    Created on : 27 de out de 2023, 16:25:25
    Author     : leoomoreira
--%>

<%@page import="produto.modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/template/cabecalho_dados.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1 class="title">Atualizar produto</h1>
        <div class="new-p-form">
            <% Produto c = (Produto) request.getAttribute("produto"); %>
            <form action="AtualizarProduto">
                <input type="hidden" name="id" value="<%= c.getId() %>" />
                Descrição: <input class="new-p-input" type="text" name="descricao" value="<%= c.getDescricao() %>" />
                <br/>
                Preço: <input class="new-p-input" type="text" name="preco" value="<%= c.getPreco() %>" />
                <br/>
                 Quantidade: <input class="new-p-input" type="text" name="quantidade" value="<%= c.getQuantidade() %>" />
                <br/>
                <input type="submit" value="Salvar" />
            </form>
        </div>
        <a href="ListarProduto" class="a-btn"><div class="back-btn">Voltar</div></a>
    </body>
</html>
