<%-- 
    Document   : cabecalho
    Created on : 6 de out de 2023, 16:35:15
    Author     : Leonardo Oliveira Moreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Shopmon</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        
        <link href="style/cabecalho.css" rel="stylesheet" />
    </head>
    <body>
        <nav class="navbar navbar-expand-lg fixed-top navbar-light bg-light border-bottom ">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.jsp">
                    <img src="img/perfil-icon.png" alt="" width="60" height="30" class="d-inline-block align-text-top">
                    Shopmon
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarToggler01" aria-controls="navbarToggler01" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                 <form class="search-bar">
                    <input class="search" type="search" placeholder="Digimon.." aria-label="Search">
                    <button class="search-btn" type="submit"><img src="img/lupa.png" class="search-img"></button>
                </form>
   
                <div class="collapse navbar-collapse" id="navbarToggler01">
                    <div class="login">
                        <a class="login-button" href="login.jsp"><img class="login-img" src="img/user.png" alt="CART"><span class="block">Login</span></a>
                    </div>

                    <div class="cart-market">
                        <a class="cart-button" href="carrinho.jsp"><img class="cart-img" src="img/cart.png" alt="CART"><span class="block">Carrinho</span></a>
                    </div>
                </div>
                </div>
            </div>
        </nav>
        <div class="container">