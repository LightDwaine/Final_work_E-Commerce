<%-- 
    Document   : novo
    Created on : 27 de out de 2023, 16:25:25
    Author     : leoomoreira
--%>

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
            <form action="InserirProduto">
                Nome: <input class="new-p-input" type="text" name="descricao" />
                <br/>
                Preco: <input class="new-p-input" type="text" name="preco" />
                <br/>
                Foto: <input class="new-p-input" type="text" name="foto" />
                <br/>
                Quantidade: <input class="new-p-input" type="text" name="quantidade" />
                <br/>
                <input type="submit" value="Cadastrar" />
            </form>
        </div>
        <a href="ListarProduto" class="a-btn"><div class="back-btn">Voltar</div></a>
    </body>
</html>
