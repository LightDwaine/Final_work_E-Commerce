package admin.controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import usuario.modelo.UsuarioDAO;

/**
 *
 * @author Leonardo Oliveira Moreira
 *
 * Classe que representa a ação de inserir um novo cliente
 */
public class AlterarAdminServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        boolean sucesso = usuarioDAO.atualizarAdmin(nome, endereco, email, login, senha);

         if (sucesso) {
            request.setAttribute("mensagem", "Seus dados de admin foram atualizados com sucesso");
        } else {
            request.setAttribute("mensagem", "Não foi possível atualizar seus dados de admin");
        }
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/admin.jsp");
        dispatcher.forward(request, response);
    }

}
