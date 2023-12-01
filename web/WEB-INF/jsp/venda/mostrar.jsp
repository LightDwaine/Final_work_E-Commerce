<%-- 
    Document   : novo
    Created on : 27 de out de 2023, 16:25:25
    Author     : leoomoreira
--%>

<%@page import="venda.modelo.VendaProduto"%>
<%@page import="venda.modelo.Venda"%>


<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/template/cabecalho_dados.jsp" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalhes da compra</title>
    </head>
    <body>
        <h1 class="title">Detalhes da compra</h1>
        <main class="main-ctg">
            
            <% 
               List<VendaProduto> vendaprodutos = (List<VendaProduto>) request.getAttribute("vendaprodutos");
                if (vendaprodutos == null || vendaprodutos.isEmpty()) {
            %>
            <div>Venda sem produtos (bug)</div>
            <%
                } else {
            %>
            <table class="custom-table">
                <tr class="first-row">
                    <td>Código do Produto:</td>
                    <td>Descrição do Produto:</td>
                    <td>Quantidade comprada:</td>
                </tr>
                <% 
                    for (VendaProduto c : vendaprodutos) {
                %>
                <tr>
                    
                    <td><%= c.getProdutoId() %></td>
                    <td><%= c.getDescricao() %></td>
                    <td><%= c.getQuantidade() %></td>
                </tr>
                <%
                    }
                %>
            </table>
            <%
                }
            %>
            
        </main>
    </body>
</html>
