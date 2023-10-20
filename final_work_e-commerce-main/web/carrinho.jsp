<%-- 
    Document   : carrinho
    Created on : 19 de out. de 2023, 12:59:37
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style/carrinho.css">
    <title>Login</title>
</head>
<body>
    <div class="container">
        <header class="header">
            <div class="logo">
                <a href="index.jsp"><img src="logo.png" alt="LOGO"></a>

            </div>
            <div class="header-buttons">
                <button class="button-login">Login</button>
                <button class="button-cart">Cart</button>
            </div>
        </header>
        <main>
            <main class="main-content">
                <table class="product-table">
                    <thead>
                        <tr>
                            <th>Produto</th>
                            <th>Quantidade</th>
                            <th>Preço</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Produto 1</td>
                            <td>2</td>
                            <td>R$ 50.00</td>
                        </tr>
                        <tr>
                            <td>Produto 2</td>
                            <td>1</td>
                            <td>R$ 30.00</td>
                        </tr>
                    </tbody>
                </table>
                <div class="total-box">
                    <p>Total: R$ 130.00</p>
                </div>

            <div class="checkout-button">
                <button>Finalizar Compra</button>
            </div>
        </main>
    </div>
</body>
</html>

