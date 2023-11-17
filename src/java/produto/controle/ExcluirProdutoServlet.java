/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package produto.controle;

import produto.modelo.ProdutoDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class ExcluirProdutoServlet extends HttpServlet {

      
       protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        ProdutoDAO produtoDAO = new ProdutoDAO();
        boolean sucesso = produtoDAO.excluir(id);
        if (sucesso) {
            request.setAttribute("mensagem", "Produto excluído com sucesso");
        } else {
            request.setAttribute("mensagem", "Não foi possível excluir o produto");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("ListarProduto");
        dispatcher.forward(request, response);
    }


}
