<%-- 
    Document   : novo
    Created on : 27 de out de 2023, 16:25:25
    Author     : leoomoreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar produto</title>
    </head>
    <body>
        <h1>Novo produto</h1>
        <form action="InserirProduto">
            Nome: <input type="text" name="descricao" />
            <br/>
            Preco: <input type="text" name="preco" />
            <br/>
            Foto: <input type="text" name="foto" />
            <br/>
            Quantidade: <input type="text" name="quantidade" />
            <br/>
            <input type="submit" value="Cadastrar" />
        </form>
    </body>
</html>