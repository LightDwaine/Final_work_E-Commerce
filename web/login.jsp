

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="style/login.css">
    <title>Login</title>
</head>
<body>
    <%@include file="cabecalho_dados.jsp" %>
    <div class="container-login">
        
            <section class="form-header">
                
                <img class="perfil-icon" src="img/user.png">
                <p id="description" class="description text-center">Acompanhe seus pedidos!<br/>Ele pode chegar antes que você perceba :)</p>
            </section>

            <form action="Login" id="login-form" method="post">
                <div class="form-group">
                    <label id="email-label" for="email-form"><span class="required">*</span>usuário</label>
                    <input type="text" name="login" id="login" class="form-control" required />
                </div>

                <div class="form-group">
                    <label id="password-label" for="password-form"><span class="required">*</span>senha</label>
                    <input type="password" name="senha" id="senha" class="form-control" required />
                </div>

                <div class="form-group">
                    <button type="submit" id="submit" class="submit-button">
                        Continuar
                    </button>
                </div>

                <div class="form-group">
                  <p class="link-cadastro">Não têm cadastro? <a href="novoCliente.jsp">Cadastre-se</a></p>
                </div>
            </form>

    </div>
        <%@include file="rodape.jsp" %>
</body>
</html>
