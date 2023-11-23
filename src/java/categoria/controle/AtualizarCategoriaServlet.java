package categoria.controle;

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
 * Classe que representa a ação de atualizar uma categoria existente
 */
public class AtualizarCategoriaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        boolean sucesso = categoriaDAO.atualizar(nome, id);
        if (sucesso) {
            request.setAttribute("mensagem", "Categoria atualizada com sucesso");
        } else {
            request.setAttribute("mensagem", "Não foi possível atualizar a categoria");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("ListarCategoria");
        dispatcher.forward(request, response);
    }

}
