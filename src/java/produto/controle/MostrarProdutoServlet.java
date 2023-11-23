package produto.controle;

import produto.modelo.Produto;
import produto.modelo.ProdutoDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MostrarProdutoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto c = produtoDAO.listar(id);
        request.setAttribute("produto", c);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/produto/mostrar.jsp");
        dispatcher.forward(request, response);
    }

}
