<%-- 
    Document   : novo
    Created on : 27 de out de 2023, 16:25:25
    Author     : leoomoreira
--%>

<%@page import="java.util.List"%>
<%@page import="categoria.modelo.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/template/cabecalho_dados.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1 class="title">Novo produto</h1>
<div class="new-p-form">
    <form action="InserirProduto" method="post"> <!-- Use method="post" para enviar os dados no corpo da requisição -->
        Nome: <input class="new-p-input" type="text" name="descricao" />
        <br/>
        Preço: <input class="new-p-input" type="text" name="preco" />
        <br/>
        Quantidade: <input class="new-p-input" type="text" name="quantidade" />
        <br/>
        Categoria:
     <select name="categoria">
    <% List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
       if (categorias != null) {
           for (Categoria categoria : categorias) { %>
               <option value="<%= categoria.getId() %>" label="<%= categoria.getNome() %>"></option>
           <% }
       } else { %>
           <option value="" label="Nenhuma categoria encontrada">Nenhuma categoria encontrada</option>
       <% } %>
        </select>
        <br/>
        <input type="submit" value="Cadastrar" />
    </form>
</div>
<a href="ListarProduto" class="a-btn"><div class="back-btn">Voltar</div></a>

    </body>
</html>
