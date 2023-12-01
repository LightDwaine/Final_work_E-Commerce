<%-- 
    Document   : uploadfoto
    Created on : 30 de nov. de 2023, 21:47:08
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/template/cabecalho_dados.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload da foto do produto</title>
    </head>
    <body>
        <%
            int id = (int)request.getAttribute("id");
        %>
        <h1>Upload de foto do produto</h1>
        <form method="post" enctype="multipart/form-data" action="UploadProdutoFoto">
           Id: <input type="text" name="id" value="<%= id %>" readonly /><br/>
            Foto: <input type="file" name="foto" accept="image/png" /><br/>
            <input type="submit" value="Enviar" />
        </form>
        <a href="ListarProduto" class="a-btn"><div class="back-btn">Voltar</div></a>
    </body>
</html>

