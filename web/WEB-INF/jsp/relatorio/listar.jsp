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
            <h1 class="title">Relatórios do Sistema</h1>
        </header>
         
        <main class="main-admin">
            <a href=""><div class="manager-btn"><span class="text-center-div">Total de Vendas por Cliente</span></div></a> 
            <a href="RelProdutosFaltando"><div class="manager-btn"><span class="text-center-div">Produtos em falta</span></div></a>
            <a href=""><div class="manager-btn"><span class="text-center-div">Total do valor de vendas por dia</span></div></a>
           
        </main>
      
                 
    </body>
</html>
