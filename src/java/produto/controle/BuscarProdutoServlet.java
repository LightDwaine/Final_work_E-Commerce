/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package produto.controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import produto.modelo.Produto;
import produto.modelo.ProdutoDAO;

/**
 *
 * @author user
 */
public class BuscarProdutoServlet extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    String descricao = request.getParameter("descricao"); 
    
    
    ProdutoDAO produtoDAO = new ProdutoDAO();
    Produto produto = produtoDAO.buscar(descricao); 
    
    request.setAttribute("produtoEncontrado", produto); 
    
    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/produto/buscar.jsp");
    dispatcher.forward(request, response);
}

}
