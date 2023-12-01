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
            <a href="RelTotalVendasData"><div class="manager-btn"><span class="text-center-div">Total de Compras por Cliente</span></div></a> 
            <a href="RelProdutosFaltando"><div class="manager-btn"><span class="text-center-div">Produtos em falta no estoque</span></div></a>
            <a href="RelTotalValorData"><div class="manager-btn"><span class="text-center-div">Total do valor de Vendas por dia</span></div></a>
            <a href="ConfigurarAdmin" class="a-btn"><div class="back-btn">Voltar</div></a>
        </main>
      
                 
    </body>
</html>
