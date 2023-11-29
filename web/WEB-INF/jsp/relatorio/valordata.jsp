<%@include file="/template/cabecalho_dados.jsp" %>
<div class="form-cadastro">
    <h1>Digite o per�odo</h1>
    <form action="RelTotalValorDia" method="post">
        <div class="mb-3">
            <label for="inputDataInicial" class="form-label">Data inicial</label>
            <input type="date" name="dataInicial" class="form-control" id="inputDataInicial" required>
            <div id="dataInicialHelp" class="form-text">Campo obrigat�rio.</div>
        </div>
        <div class="mb-3">
            <label for="inputDataFinal" class="form-label">Data final</label>
            <input type="date" name="dataFinal" class="form-control" id="inputDataFinal" required>
            <div id="dataFinalHelp" class="form-text">Campo obrigat�rio.</div>
        </div>
        <button type="submit" class="btn btn-dark">Buscar</button>
    </form>
</div>
<%@include file="/template/rodape.jsp" %>
