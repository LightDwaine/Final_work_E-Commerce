<%-- 
    Document   : admin
    Created on : 27 de out de 2023, 15:15:33
    Author     : leoomoreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/template/cabecalho.jsp" %>

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
         
        <main class="main-admin">
            <a href="ListarProduto"><div class="manager-btn"><span class="text-center-div">Gerenciar Produtos</span></div></a> 
            <a href="ListarCategoria"><div class="manager-btn"><span class="text-center-div">Gerenciar Categorias</span></div></a>
            <a href="MostrarTodasVendas"><div class="manager-btn"><span class="text-center-div">Gerenciar Vendas</span></div></a>
            <a href="ListarRelatorio"><div class="manager-btn"><span class="text-center-div">Acessar Relatórios</span></div></a>
        </main>
      
                 
    </body>
</html>
