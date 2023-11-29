/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package relatorio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import venda.modelo.VendaComUsuario;
import venda.modelo.VendaDAO;


/**
 *
 * @author user
 */
public class RelTotalVendasClienteServlet extends HttpServlet {

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
                List<VendaComUsuario> vendasPorCliente = vendaDAO.recuperarTotalComprasPorCliente(dataInicial, dataFinal);

                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintWriter relatorio = new PrintWriter(byteArrayOutputStream);

                
                relatorio.println("Vendas realizadas no período de " + dataInicialStr + " a " + dataFinalStr);
                relatorio.println(); 
                
                for (VendaComUsuario vendaComUsuario : vendasPorCliente) {
                    relatorio.print("ID do cliente: " + vendaComUsuario.getClienteId() +
                                    " - Nome: " + vendaComUsuario.getNomeCliente() +
                                    " - Quantidade de Compras: " + vendaComUsuario.getQuantidadeCompras() + "\n");
                }

                relatorio.flush();
                response.setContentType("text/plain;charset=UTF-8");
                response.setContentLength((int) byteArrayOutputStream.size());
                String key = "Content-Disposition";
                String value = String.format("attachment; filename=\"%s\"", "RelatorioVendasPorCliente.txt");
                response.setHeader(key, value);
                OutputStream out = response.getOutputStream();
                out.write(byteArrayOutputStream.toByteArray());
                out.close();

            } catch (ParseException e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Erro ao processar as datas.");
            }
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Datas não fornecidas.");
        }
    }
}

