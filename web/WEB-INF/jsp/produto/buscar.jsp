<%@page import="carrinhocompras.modelo.CarrinhoCompraItem"%>
<%@page import="carrinhocompras.modelo.CarrinhoCompras"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="produto.modelo.Produto"%>
<%@page import="java.util.List"%>
<%@include file="/template/cabecalho.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/index.css">
    <title>Busca de produto</title>
</head>
<body>
    
<% Produto produto = (Produto) request.getAttribute("produtoEncontrado");
   if (produto != null) {
%>
<div class="card">
    <img src="<%= produto.getFoto() %>" class="card-img-top" alt="...">
    <div class="card-body">
        <h5 class="card-title"><%= produto.getDescricao()%></h5>
        <p class="card-text">Preço: <%= produto.getPreco() %></p>
        <p class="card-text">Quantidade: <%= produto.getQuantidade() %></p>
        <!-- Adicione outras informações do produto conforme necessário -->
    </div>
    <div class="card-footer">
        <small class="text-muted"><a href="AdicionarProdutoCarrinho?produtoId=<%= produto.getId()%>" class="btn btn-primary">Comprar</a></small>
    </div>
</div>
<% } else { %>
<p>Nenhum produto encontrado para a descrição fornecida.</p>
<% } %>

    
   
<%@include file="/template/rodape.jsp" %>
</body>
</html>
