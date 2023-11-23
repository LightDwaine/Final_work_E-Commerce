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
 * @author Leonardo Oliveira Moreira
 *
 * Classe que representa a ação de atualizar uma categoria existente
 */
public class AtualizarProdutoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String descricao = request.getParameter("descricao");
        ProdutoDAO produtoDAO = new ProdutoDAO();
        boolean sucesso = produtoDAO.atualizar(descricao, id);
        if (sucesso) {
            request.setAttribute("mensagem", "Produto atualizado com sucesso");
        } else {
            request.setAttribute("mensagem", "Não foi possível atualizar o produto");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("ListarProduto");
        dispatcher.forward(request, response);
    }

}
