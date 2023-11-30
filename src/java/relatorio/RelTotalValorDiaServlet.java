package relatorio;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
       
        String dataInicialStr = request.getParameter("dataInicial");
        String dataFinalStr = request.getParameter("dataFinal");

        if (dataInicialStr != null && dataFinalStr != null && !dataInicialStr.isEmpty() && !dataFinalStr.isEmpty()) {
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date dataInicial = format.parse(dataInicialStr);
                Date dataFinal = format.parse(dataFinalStr);

                VendaDAO vendaDAO = new VendaDAO();
                List<ValorRecebidoPorDia> relatorio = vendaDAO.totalValorRecebidoPorDia(dataInicial, dataFinal);

                Map<Date, BigDecimal> valoresPorData = new LinkedHashMap<>(); 

                
                for (ValorRecebidoPorDia valor : relatorio) {
                    Date data = valor.getData();
                    BigDecimal valorTotal = valor.getValorTotal();

                    
                    if (valoresPorData.containsKey(data)) {
                        BigDecimal valorExistente = valoresPorData.get(data);
                        valoresPorData.put(data, valorExistente.add(valorTotal));
                    } else { 
                        valoresPorData.put(data, valorTotal);
                    }
                }

                response.setContentType("text/plain;charset=UTF-8");
                response.setHeader("Content-Disposition", "attachment; filename=\"RelatorioValorPorDia.txt\"");
                PrintWriter out = response.getWriter();

                out.println("Valores Recebidos por dia:");
                out.println("Data     \tValor Recebido");

                
                for (Map.Entry<Date, BigDecimal> entry : valoresPorData.entrySet()) {
                    Date data = entry.getKey();
                    BigDecimal valorTotal = entry.getValue();

                    out.println(data + "\t" + valorTotal);
                }

                out.close();

            } catch (ParseException e) {
               
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Erro ao processar as datas.");
            }
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Datas não fornecidas.");
        }
    }
}
