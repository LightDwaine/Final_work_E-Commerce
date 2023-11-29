package relatorio;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import venda.modelo.ValorRecebidoPorDia;
import venda.modelo.VendaDAO;

public class RelTotalValorDiaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Recupera os parâmetros do formulário
        String dataInicialStr = request.getParameter("dataInicial");
        String dataFinalStr = request.getParameter("dataFinal");

        // Verifica se os parâmetros não são nulos ou vazios
        if (dataInicialStr != null && dataFinalStr != null && !dataInicialStr.isEmpty() && !dataFinalStr.isEmpty()) {
            try {
                // Converte as Strings de data para o formato Date
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date dataInicial = format.parse(dataInicialStr);
                Date dataFinal = format.parse(dataFinalStr);

                // Chama a função do VendaDAO para obter o relatório
                VendaDAO vendaDAO = new VendaDAO();
                List<ValorRecebidoPorDia> relatorio = vendaDAO.totalValorRecebidoPorDia(dataInicial, dataFinal);

                // Processa o relatório (exemplo: escrever no response)
                response.setContentType("text/plain;charset=UTF-8");
                response.setHeader("Content-Disposition", "attachment; filename=\"RelatorioValorPorDia.txt\"");
                PrintWriter out = response.getWriter();

                out.println("Relatório de Valor Recebido Por Dia:");
                out.println("Data     \tValor Recebido");

                for (ValorRecebidoPorDia valor : relatorio) {
                    out.println(valor.getData() + "\t" + valor.getValorTotal());
                }

                out.close();

            } catch (ParseException e) {
                e.printStackTrace(); // Tratar adequadamente o erro de parsing
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Erro ao processar as datas.");
            }
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Datas não fornecidas.");
        }
    }
}
