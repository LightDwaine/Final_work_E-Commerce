/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package venda.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import venda.modelo.Venda;
import venda.modelo.VendaDAO;
import venda.modelo.VendaProduto;

/**
 *
 * @author user
 */
public class MostrarVendaServlet extends HttpServlet {

     @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int id = Integer.parseInt(request.getParameter("id"));
        VendaDAO vendaDAO = new VendaDAO();
        List<VendaProduto> vendaprodutos = vendaDAO.listarProdutos(id);
        request.setAttribute("vendaprodutos", vendaprodutos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/venda/mostrar.jsp");
        dispatcher.forward(request, response);
    }


}
