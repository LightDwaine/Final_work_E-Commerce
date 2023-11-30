
package produto.controle;

import categoria.modelo.Categoria;
import categoria.modelo.CategoriaDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NovoProdutoServlet extends HttpServlet {


     @Override
     protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         CategoriaDAO categoriaDAO = new CategoriaDAO();
         List<Categoria> categorias = categoriaDAO.obterIdENomeCategorias();


        request.setAttribute("categorias", categorias);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/produto/novo.jsp");
        dispatcher.forward(request, response);
    }


}
