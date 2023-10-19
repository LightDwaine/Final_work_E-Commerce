<%-- 
    Document   : login
    Created on : 19 de out. de 2023, 12:57:51
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="login.css">
    <title>Login</title>
</head>
<body>
    <div class="container">
        <header class="header">
            <nav>
                <div class="logo">
                    <a class="home-button" href="index.jsp"><img src="logo.png" alt="LOGO"></a>
                </div>
            </nav>

        </header>
        <main>
            <section class="form-header">
                <h1 id="title" class="text-center"><img class="perfil-icon" src="img/perfil-icon.png" alt="perfil-icon"> login do cliente</h1>
                <p id="description" class="description text-center">Acompanhe seus pedidos!<br/>Ele pode chegar antes que você perceba :)</p>
            </section>

            <form action="" id="login-form">
                <div class="form-group">
                    <label id="email-label" for="email-form"><span class="required">*</span>e-mail</label>
                    <input type="text" name="email-form" id="email-form" class="form-control" required />
                </div>

                <div class="form-group">
                    <label id="password-label" for="password-form"><span class="required">*</span>senha</label>
                    <input type="password" name="password-form" id="paspassword-formsword" class="form-control" required />
                </div>

                <div class="form-group">
                    <button type="submit" id="submit" class="submit-button">
                        Continuar
                    </button>
                </div>

                <div class="form-group">
                  <p class="cadastro">Não têm cadastro? <a href="novoCliente.jsp">Cadastre-se</a></p>
                </div>
            </form>
        </main>
    </div>
</body>
</html>
