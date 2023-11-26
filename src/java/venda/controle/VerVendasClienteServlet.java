package venda.controle;

import venda.modelo.Venda;
import venda.modelo.VendaDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leoomoreira
 */
public class VerVendasClienteServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int id = Integer.parseInt(request.getParameter("id"));
        VendaDAO vendaDAO = new VendaDAO();
        List<Venda> vendas = vendaDAO.listar(id);
        request.setAttribute("vendas", vendas);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/venda/listar.jsp");
        dispatcher.forward(request, response);
    }
    
}
