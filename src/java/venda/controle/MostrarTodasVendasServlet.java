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
public class MostrarTodasVendasServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        VendaDAO vendaDAO = new VendaDAO();
        List<Venda> vendasT = vendaDAO.listarTodasAsVendas();
        request.setAttribute("vendasT", vendasT);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/venda/listarTodas.jsp");
        dispatcher.forward(request, response);
    }
    
}
