/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package relatorio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
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
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (PrintWriter relatorio = new PrintWriter(byteArrayOutputStream)) {
            VendaDAO vendaDAO = new VendaDAO(); 

            List<VendaComUsuario> vendasPorCliente = vendaDAO.recuperarTotalComprasPorCliente();

            for (VendaComUsuario vendaComUsuario : vendasPorCliente) {
                relatorio.print("ID do cliente: " + vendaComUsuario.getClienteId() +
                                " - Nome: " + vendaComUsuario.getNomeCliente() +
                                " - Quantidade de Compras: " + vendaComUsuario.getQuantidadeCompras() + "\n");
            }
            relatorio.flush();
        }
        response.setContentType("text/plain;charset=UTF-8");
        response.setContentLength((int) byteArrayOutputStream.size());
        String key = "Content-Disposition";
        String value = String.format("attachment; filename=\"%s\"", "RelatorioVendasPorCliente.txt");
        response.setHeader(key, value);
        OutputStream out = response.getOutputStream();
        out.write(byteArrayOutputStream.toByteArray());
        out.close();
    }
}
