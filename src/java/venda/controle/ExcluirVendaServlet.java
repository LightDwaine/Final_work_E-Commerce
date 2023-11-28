package venda.controle;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venda.modelo.VendaDAO;

/**
 *
 * @author Leonardo Oliveira Moreira
 * 
 * Classe que implementa a ação de efetivar um venda
 */
public class ExcluirVendaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int vendaId = Integer.parseInt(request.getParameter("id"));
        
        VendaDAO vendaDAO = new VendaDAO();
       
        boolean sucesso = vendaDAO.excluir(vendaId);
        if (sucesso) {
            request.setAttribute("mensagem", "Venda excluida com sucesso");
        } else {
            request.setAttribute("mensagem", "Não foi possível excluir esta venda");
        }
        
        request.getRequestDispatcher("WEB-INF/jsp/admin.jsp").forward(request, response);
    }

}
