/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package produto.controle;

import produto.modelo.ProdutoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class InserirProdutoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String descricao = request.getParameter("descricao");
        String precoStr = request.getParameter("preco");
        String foto = request.getParameter("foto");
        String quantidadeStr = request.getParameter("quantidade");
        String categoriaStr = request.getParameter("categoria");
        
        double preco = Double.parseDouble(precoStr);
        int quantidade = Integer.parseInt(quantidadeStr);
        int categoria = Integer.parseInt(categoriaStr);


        ProdutoDAO produtoDAO = new ProdutoDAO();
        boolean sucesso = produtoDAO.inserir(descricao, preco, foto, quantidade, categoria);
        if (sucesso) {
            request.setAttribute("mensagem", "Produto inserido com sucesso");
        } else {
            request.setAttribute("mensagem", "Não foi possível inserir o produto");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("ListarProduto");
        dispatcher.forward(request, response);
    }

 

}
