package categoria.controle;

import categoria.modelo.Categoria;
import categoria.modelo.CategoriaDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leonardo Oliveira Moreira
 *
 * Classe que representa a ação de mostrar uma categoria existente
 */
public class MostrarCategoriaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        Categoria c = categoriaDAO.listar(id);
        request.setAttribute("categoria", c);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/categoria/mostrar.jsp");
        dispatcher.forward(request, response);
    }

}
