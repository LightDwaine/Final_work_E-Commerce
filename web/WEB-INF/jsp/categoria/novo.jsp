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
        <h1 class="title">Nova categoria</h1>
        <div class="new-c-form">
            <form action="InserirCategoria" >
                Nome: <input class="new-c-input" type="text" name="nome" />
                <input type="submit" value="Cadastrar" />
            </form>
        </div>
        <a href="ListarCategoria" class="a-btn"><div class="back-btn">Voltar</div></a>
    </body>
</html>
