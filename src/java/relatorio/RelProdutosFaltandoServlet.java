package relatorio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import produto.modelo.Produto;
import produto.modelo.ProdutoDAO;


public class RelProdutosFaltandoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (PrintWriter relatorio = new PrintWriter(byteArrayOutputStream)) {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            List<Produto> produtos = produtoDAO.listarProdutosFaltando();
            
            relatorio.println("Lista de produtos em falta no estoque ");
            relatorio.println(); 
                
            for (Produto p : produtos) {
                relatorio.print("ID do produto: " + p.getId() + "\t"
                        + "Nome: " + p.getDescricao() + "\t" + "Preço: " + p.getPreco() + "\n");
            }
            relatorio.flush();
        }
        response.setContentType("text/plain;charset=UTF-8");
        response.setContentLength((int) byteArrayOutputStream.size());
        String key = "Content-Disposition";
        String value = String.format("attachment; filename=\"%s\"",
                "RelProdutosFaltando.txt");
        response.setHeader(key, value);
        OutputStream out = response.getOutputStream();
        out.write(byteArrayOutputStream.toByteArray());
        out.close();
    }

}
