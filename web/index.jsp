
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style/index.css">
        <title>Página Inicial</title>
    </head>
    <body>
        <%@include file="./template/cabecalho.jsp" %>
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
        
        <section class="catalogo">
            <div class="item">
                <a href="#">
                    <img src="img/item1.jpg" alt="Produto 1">
                    <p class="preco">R$ 50,00</p>
                    <p class="estoque">Em estoque: 10 unidades</p>
                </a>
            </div>

            <div class="item">
                <a href="#">
                    <img src="img/item2.jpg" alt="Produto 2">
                    <p class="preco">R$ 35,00</p>
                    <p class="estoque">Em estoque: 5 unidades</p>
                </a>
            </div>

            <div class="item">
                <a href="#">
                    <img src="img/item3.png" alt="Produto 3">
                    <p class="preco">R$ 75,00</p>
                    <p class="estoque">Em estoque: 15 unidades</p>
                </a>
            </div>
        </section>
        <%@include file="./template/rodape.jsp" %>
    </body>
</html>

