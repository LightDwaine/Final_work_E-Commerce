<%-- 
    Document   : admin
    Created on : 27 de out de 2023, 15:15:33
    Author     : leoomoreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="/template/cabecalho_dados.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopmon ADMIN</title>
    </head>
    <body>
        <header>
            <h1 class="title">Pagina de modificações do administrador</h1>
        </header>
        <main>
            <a href="ListarProduto"><div class="manager-btn"><span class="text-center-div">Cadastro de Produtos</span></div></a> 
            <a href="ListarCategoria"><div class="manager-btn"><span class="text-center-div">Cadastro de Categorias</span></div></a>
        </main>
    </body>
</html>
