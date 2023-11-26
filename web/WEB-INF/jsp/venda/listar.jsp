<%-- 
    Document   : listar
    Created on : 27 de out de 2023, 15:26:57
    Author     : leoomoreira
--%>

<%@page import="venda.modelo.Venda"%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/template/cabecalho_dados.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Minhas Vendas</title>
    </head>
    <body>
        <h1 class="title">Minhas Vendas</h1>
        <main class="main-ctg">
            <%
                if (request.getAttribute("mensagem") != null) {
            %>
            <div><%= request.getAttribute("mensagem") %></div>
            <%
                }
            %>
            <% 
                List<Venda> vendas = (List<Venda>) request.getAttribute("vendas");
                if (vendas == null || vendas.isEmpty()) {
            %>
            <div>Não há vendas a serem listadas.</div>
            <%
                } else {
            %>
            <table class="custom-table">
                <tr class="first-row">
                    <td>ID</td>
                    <td class="last-col">&nbsp;</td>
                </tr>
                <% 
                    for (Venda c : vendas) {
                %>
                <tr>
                    <td><%= c.getId() %></td>
                    <td>
                        <a href="MostrarCategoria?id=<%= c.getId() %>">Mostrar</a>
                        <a href="ExcluirCategoria?id=<%= c.getId() %>">Excluir</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
            <%
                }
            %>
            <a href="NovaCategoria">Nova categoria</a>
        </main>
    </body>
</html>
