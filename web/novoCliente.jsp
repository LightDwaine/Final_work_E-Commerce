<%@include file="./template/cabecalho_dados.jsp" %>
    <div class="form-cadastro">
        <h1>Cadastrar um Novo Cliente</h1>
        <form action="InserirCliente" method="post">
            <div class="mb-3">
                <label for="inputNome" class="form-label">Nome completo</label>
                <input type="text" name="nome" class="form-control" id="inputNome" aria-describedby="nomeHelp">
                <div id="nomeHelp" class="form-text">Campo obrigatótio.</div>
            </div>
            <div class="mb-3">
                <label for="inputEndereco" class="form-label">Endereço</label>
                <input type="text" name="endereco" class="form-control" id="inputEndereco" aria-describedby="enderecoHelp">
                <div id="enderecoHelp" class="form-text">Campo obrigatótio.</div>
            </div>
            <div class="mb-3">
                <label for="inputEmail" class="form-label">E-mail</label>
                <input type="email" name="email" class="form-control" id="inputEmail" aria-describedby="emailHelp">
                <div id="emailHelp" class="form-text">Campo obrigatótio.</div>
            </div>

            
            <div class="mb-3">
                <label for="inputLogin" class="form-label">Login</label>
                <input type="text" name="login" class="form-control" id="inputLogin" aria-describedby="loginHelp">
                <div id="loginHelp" class="form-text">Campo obrigatótio.</div>
            </div>

            <div class="mb-3">
                <label for="inputSenha" class="form-label">Senha</label>
                <input type="password" name="senha" class="form-control" id="inputSenha" aria-describedby="senhaHelp">
                <div id="senhaHelp" class="form-text">Campo obrigatótio.</div>
            </div>
            <button type="submit" class="btn btn-dark ">Cadastrar</button>
        </form>
        <p class="back">Já está cadastrado? <a href="login.jsp">Faça o login</a></p>
       </div>
        <br/>
      
<%@include file="./template/rodape.jsp" %>