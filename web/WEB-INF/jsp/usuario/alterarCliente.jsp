

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%@include file="/template/cabecalho_dados.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Shopmon</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        
        <link href="style/cabecalho.css" rel="stylesheet" />
    </head>
    <div class="form-cadastro">
        <h1>Alterar seus dados</h1>
        <% Usuario usuario = (Usuario) session.getAttribute("usuario"); %>
        <form action="AlterarCliente" method="post">
            <input type="hidden" name="id" value="<%= usuario.getId() %>" />
            <div class="mb-3">
                <label for="inputNome" class="form-label">Nome completo</label>
                <input type="text" name="nome" class="form-control" id="inputNome" aria-describedby="nomeHelp" value="<%= usuario.getNome()%>">
                <div id="nomeHelp" class="form-text">Campo obrigatório.</div>
            </div>
            <div class="mb-3">
                <label for="inputEndereco" class="form-label">Endereço</label>
                <input type="text" name="endereco" class="form-control" id="inputEndereco" aria-describedby="enderecoHelp" value="<%= usuario.getEndereco()%>">
                <div id="enderecoHelp" class="form-text">Campo obrigatório.</div>
            </div>
            <div class="mb-3">
                <label for="inputEmail" class="form-label">E-mail</label>
                <input type="email" name="email" class="form-control" id="inputEmail" aria-describedby="emailHelp" value="<%= usuario.getEmail()%>">
                <div id="emailHelp" class="form-text">Campo obrigatório.</div>
            </div>

            
            <div class="mb-3">
                <label for="inputLogin" class="form-label">Login</label>
                <input type="text" name="login" class="form-control" id="inputLogin" aria-describedby="loginHelp" value="<%= usuario.getLogin()%>">
                <div id="loginHelp" class="form-text">Campo obrigatório.</div>
            </div>

            <div class="mb-3">
                <label for="inputSenha" class="form-label">Senha</label>
                <input type="text" name="senha" class="form-control" id="inputSenha" aria-describedby="senhaHelp" value="<%= usuario.getSenha()%>">
                <div id="senhaHelp" class="form-text">Campo obrigatório.</div>
            </div>
            <button type="submit" class="btn btn-dark ">Atualizar</button>
             <p >Não quer alterar? <a href="Inicio">Voltar</a></p>
        </form>
       </div>
        <br/>

</html>

