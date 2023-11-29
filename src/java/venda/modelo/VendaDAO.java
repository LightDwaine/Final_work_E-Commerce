package venda.modelo;

import carrinhocompras.modelo.CarrinhoCompraItem;
import static config.Config.JDBC_DRIVER;
import static config.Config.JDBC_SENHA;
import static config.Config.JDBC_URL;
import static config.Config.JDBC_USUARIO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo Oliveira Moreira
 *
 * Classe que implementa o padrão DAO para a entidade venda
 */
public class VendaDAO {

    /**
     * Método utilizado para registrar uma nova venda
     *
     * @param usuarioId
     * @param itens
     * @return
     */
    public boolean inserir(int usuarioId, List<CarrinhoCompraItem> itens) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            c.setAutoCommit(false);
            PreparedStatement ps = c.prepareStatement("INSERT INTO venda (data, usuario_id) VALUES (NOW(), ?)", java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, usuarioId);
            if (ps.executeUpdate() != 1) {
                c.rollback();
                c.close();
                return false;
            }
            int vendaId = -1;
            try (java.sql.ResultSet keys = ps.getGeneratedKeys()) {
                keys.next();
                vendaId = keys.getInt(1);
            }
            ps.close();

            for (CarrinhoCompraItem item : itens) {
                PreparedStatement psInsert = c.prepareStatement("INSERT INTO venda_produto (venda_id, produto_id, quantidade) VALUES (?, ?, ?)");
                psInsert.setInt(1, vendaId);
                psInsert.setInt(2, item.getProduto().getId());
                psInsert.setInt(3, item.getQuantidade());
                if (psInsert.executeUpdate() != 1) {
                    c.rollback();
                    c.close();
                    return false;
                }
                psInsert.close();
                PreparedStatement psUpdate = c.prepareStatement("UPDATE produto SET quantidade = quantidade - ? WHERE id = ?");
                psUpdate.setInt(1, item.getQuantidade());
                psUpdate.setInt(2, item.getProduto().getId());
                if (psUpdate.executeUpdate() != 1) {
                    c.rollback();
                    c.close();
                    return false;
                }
                psUpdate.close();
            }
            c.commit();
            c.close();
            sucesso = true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        return sucesso;
    }
    
    public boolean excluir(int vendaId) {
    try {
        Class.forName(JDBC_DRIVER);
        Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
        
        PreparedStatement ps1 = c.prepareStatement("DELETE FROM venda_produto WHERE venda_id IN (SELECT id FROM venda WHERE id = ?)");
    ps1.setInt(1, vendaId); 
    int rowsAffected1 = ps1.executeUpdate();
    System.out.println("Linhas afetadas na tabela venda_produto: " + rowsAffected1);

    
    PreparedStatement ps2 = c.prepareStatement("DELETE FROM venda WHERE id = ?");
    ps2.setInt(1, vendaId); 
    int rowsAffected2 = ps2.executeUpdate();
    System.out.println("Linhas afetadas na tabela venda: " + rowsAffected2);

  
        
        ps1.close();
        ps2.close();
        c.close();

        // Verifica se houve linhas afetadas para determinar se a exclusão foi bem-sucedida
        return rowsAffected1 > 0 || rowsAffected2 > 0;
    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace(); 
        return false; 
    }
}

    
   public List<Venda> listar(int usuarioId) {
    List<Venda> vendas = new ArrayList<>();

    try {
        Class.forName(JDBC_DRIVER);
        Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
        PreparedStatement ps = c.prepareStatement("SELECT id, usuario_id FROM venda WHERE usuario_id = ?");
        ps.setInt(1, usuarioId);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Venda venda = new Venda();
            venda.setId(rs.getInt("id"));
            venda.setUsuarioId(rs.getInt("usuario_id"));

            // Aqui você pode adicionar a lógica para recuperar os itens vendidos (se necessário)

            vendas.add(venda);
        }

        rs.close();
        ps.close();
        c.close();
    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace(); // Melhorar o tratamento de exceção, isso é apenas um exemplo
        return new ArrayList<>(); // Retorna uma lista vazia em caso de erro
    }

    return vendas;
}
   
   public List<Venda> listarTodasAsVendas() {
    List<Venda> vendas = new ArrayList<>();

    try {
        Class.forName(JDBC_DRIVER);
        Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
        PreparedStatement ps = c.prepareStatement("SELECT id, usuario_id FROM venda");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Venda venda = new Venda();
            venda.setId(rs.getInt("id"));
            venda.setUsuarioId(rs.getInt("usuario_id"));

            

            vendas.add(venda);
        }

        rs.close();
        ps.close();
        c.close();
    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace(); // Melhorar o tratamento de exceção, isso é apenas um exemplo
        return new ArrayList<>(); // Retorna uma lista vazia em caso de erro
    }

    return vendas;
}

   
   public List<VendaProduto> listarProdutos(int id) {
        List<VendaProduto> vendaProdutos = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("SELECT produto_id, quantidade FROM venda_produto WHERE venda_id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                VendaProduto vendaProduto = new VendaProduto();
                vendaProduto.setProdutoId(rs.getInt("produto_id"));
                vendaProduto.setQuantidade(rs.getInt("quantidade"));
                vendaProdutos.add(vendaProduto);
            }

            rs.close();
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // Tratar adequadamente as exceções em um ambiente de produção
            return new ArrayList<>(); // Retorna uma lista vazia em caso de erro
        }

        return vendaProdutos;
    }
   
   
   public List<VendaComUsuario> recuperarTotalComprasPorCliente() {
        List<VendaComUsuario> vendasPorCliente = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
        Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);

            String query = "SELECT v.usuario_id AS cliente_id, COUNT(*) AS quantidade_compras, u.nome AS nome_cliente " +
                           "FROM venda v " +
                           "INNER JOIN usuario u ON v.usuario_id = u.id " +
                           "GROUP BY v.usuario_id, u.nome " +
                           "ORDER BY quantidade_compras DESC";

            PreparedStatement ps = c.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                VendaComUsuario vendaComUsuario = new VendaComUsuario();
                vendaComUsuario.setClienteId(rs.getInt("cliente_id"));
                vendaComUsuario.setQuantidadeCompras(rs.getInt("quantidade_compras"));
                vendaComUsuario.setNomeCliente(rs.getString("nome_cliente"));

                vendasPorCliente.add(vendaComUsuario);
            }

            rs.close();
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // Tratamento de exceção básico
            return new ArrayList<>(); // Retorna uma lista vazia em caso de erro
        }

        return vendasPorCliente;
    }
   
}
   


    


