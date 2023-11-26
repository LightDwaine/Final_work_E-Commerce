<%@page import="carrinhocompras.modelo.CarrinhoCompraItem"%>
<%@page import="carrinhocompras.modelo.CarrinhoCompras"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="produto.modelo.Produto"%>
<%@page import="java.util.List"%>
<%@include file="template/cabecalho.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/index.css">
    <title>PÃ¡gina Inicial</title>
</head>
<body>
    <div id="carouselExampleIndicators" class="carousel slide">
        <div class="carousel-indicators">
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fimages.alphacoders.com%2F781%2Fthumb-1920-781254.png&f=1&nofb=1&ipt=a671d40d9263cf7cee853d7b734e9a4526367d1a5ea6c61f9c02c6c867a309f7&ipo=images" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img src="https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fgetwallpapers.com%2Fwallpaper%2Ffull%2Fe%2F7%2F4%2F402846.jpg&f=1&nofb=1&ipt=9cc02dc2dcfc5400f399b34baf0f6045113ef1598b1bed2b0c629f7edfc64453&ipo=images" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img src="https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.hdwallpaper.nu%2Fwp-content%2Fuploads%2F2016%2F09%2FDigimon_wallpaper_042.jpg&f=1&nofb=1&ipt=b4a6ca02f4c3ee2b2574e26f38358c5282cd4c1deb42ce6efb75fe9393346094&ipo=images" class="d-block w-100" alt="...">
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
    </div>
<%    List<Produto> produtos = (List<Produto>) request.getAttribute("produtosEmEstoque");
    if (produtos != null && !produtos.isEmpty()) {
%>
<div class="row row-cols-1 row-cols-md-3 g-4">
    <%
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
    %>
    <div class="col">
        <div class="card h-100">
            <img src="ExibirProdutoFoto?id=<%= p.getId()%>" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title"><%= p.getDescricao()%></h5>
                <p class="card-text"><%= p.getDescricao()%></p>
            </div>
            <div class="card-footer">
                <small class="text-muted"><a href="AdicionarProdutoCarrinho?produtoId=<%= p.getId()%>" class="btn btn-primary">Comprar</a></small>
            </div>
        </div>
    </div>
    <%
        }
    %>
</div>
<%
    }
%>
<%
    Cookie cookie = null;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("smdecommerce.carrinho")) {
                cookie = c;
                break;
            }
        }
    }
    if (cookie != null && cookie.getValue().length() > 0) {
%>
<hr/>
<h1>Carrinho de Compras</h1>
<table class="table table-striped">
    <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Produto</th>
            <th scope="col">Quantidade</th>
            <th scope="col">Preço R$</th>
            <th scope="col">Total R$</th>
            <th scope="col"></th>
        </tr>
    </thead>
    <tbody>
<%
        DecimalFormat realFormat = new DecimalFormat("#,##0.00");
        List<CarrinhoCompraItem> itens = (List<CarrinhoCompraItem>) CarrinhoCompras.obterCarrinho(cookie.getValue());
        double total = 0;
        if (itens != null && !itens.isEmpty()) {
            for (int i = 0; i < itens.size(); i++) {
            %>
        <tr>
            <th scope="row"><%= i + 1 %></th>
            <td><%= itens.get(i).getProduto().getDescricao() %></td>
            <td><%= itens.get(i).getQuantidade() %></td>
            <td><%= realFormat.format(itens.get(i).getProduto().getPreco()) %></td>
            <td><%= realFormat.format(itens.get(i).getProduto().getPreco() * itens.get(i).getQuantidade()) %></td>
            <td><a href="RemoverProdutoCarrinho?produtoId=<%= itens.get(i).getProduto().getId() %>" class="btn btn-primary" role="button" aria-disabled="true">Remover</a></td>
        </tr>
            <%
                total += itens.get(i).getProduto().getPreco() * itens.get(i).getQuantidade();
            }
        }  
%>
    </tbody>
</table>
<h4>Total R$: <%= realFormat.format(total) %></h4>
<% 
        if (usuario != null && usuario instanceof Usuario && !usuario.isAdministrador()) {
%>
<a href="VendaInserir" class="btn btn-primary" role="button" aria-disabled="true">Finalizar Compra</a>
<%
        }    
    } else {
%>
<div class="alert alert-info alert-dismissible fade show mt-4" role="alert">
    Sem produtos no carrinho de compras
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%
    }
%>
<%@include file="/template/rodape.jsp" %>
</body>
</html>
