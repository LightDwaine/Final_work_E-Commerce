package produto.modelo;

import static config.Config.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo Oliveira Moreira
 *
 * Classe que implementa o padrão DAO para a entidade produto
 */
public class ProdutoDAO {

    /**
     * Método utilizado para inserir um novo produto
     *
     * @param descricao
     * @param preco
     * @param foto
     * @param quantidade
     * @param categoria
     * @return
     */
    public boolean inserir(String descricao, double preco, String foto, int quantidade, int categoria) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("INSERT INTO produto (descricao, preco, foto, quantidade, categoria_id) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, descricao);
            ps.setDouble(2, preco);
            ps.setString(3, foto);
            ps.setInt(4, quantidade);
            ps.setInt(5, categoria);
            sucesso = (ps.executeUpdate() == 1);
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
            return false;
        }
        return sucesso;
    }
    
    /**
     * Método utilizado para listar todos os produtos em estoque
     *
     * @return
     */
    public List<Produto> listarProdutosEmEstoque() {
        List<Produto> produtos = new ArrayList();
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("SELECT id, descricao, preco, foto, quantidade FROM produto WHERE quantidade >= 0");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco(rs.getDouble("preco"));
                p.setQuantidade(rs.getInt("quantidade"));
                produtos.add(p);
            }
            rs.close();
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return new ArrayList();
        }
        return produtos;
    }
    
    
    public boolean excluir(int id) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("DELETE FROM produto WHERE id = ?");
            ps.setInt(1, id);
            sucesso = (ps.executeUpdate() == 1);
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        return sucesso;
    }
    
     public Produto listar(int id) {
        Produto p = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("SELECT id, descricao FROM produto WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p = new Produto();
                p.setId(rs.getInt("id"));
                p.setDescricao(rs.getString("descricao"));
            }
            rs.close();
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
        return p;
    }
     
     public boolean atualizar(String descricao, int preco, int quantidade, int id) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("UPDATE produto SET descricao = ?, preco = ?, quantidade = ? WHERE id = ?");
            ps.setString(1, descricao);
            ps.setInt(2, preco);
            ps.setInt(3, quantidade);
            ps.setInt(4, id);
            sucesso = (ps.executeUpdate() == 1);
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);   
            return false;
        }
        return sucesso;
    }
     
     /**
     * Método utilizado para recuperar um produto pelo id
     * 
     * @param id
     * @return 
     */
    public Produto obter(int id) {
        Produto produto = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("SELECT id, descricao, preco, quantidade FROM produto WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
            }
            rs.close();
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
        return produto;
    }
    
    /**
     * Método utilizado para listar todos os produtos que estão faltando
     *
     * @return
     */
    public List<Produto> listarProdutosFaltando() {
        List<Produto> produtos = new ArrayList();
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("SELECT id, descricao, preco, quantidade FROM produto WHERE quantidade = 0 ORDER BY descricao ASC");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco(rs.getDouble("preco"));
                p.setQuantidade(rs.getInt("quantidade"));
                produtos.add(p);
            }
            rs.close();
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return new ArrayList();
        }
        return produtos;
    }
    
     public Produto buscar(String descricao) {
    Produto p = null;
    try {
        Class.forName(JDBC_DRIVER);
        Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
        PreparedStatement ps = c.prepareStatement("SELECT * FROM produto WHERE descricao = ?");
        ps.setString(1, descricao);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new Produto();
            p.setId(rs.getInt("id"));
            p.setDescricao(rs.getString("descricao"));
            p.setPreco(rs.getDouble("preco"));
            p.setFoto(rs.getString("foto"));
            p.setQuantidade(rs.getInt("quantidade"));
            
        }
        rs.close();
        ps.close();
        c.close();
    } catch (ClassNotFoundException | SQLException ex) {
        System.out.println(ex);
        return null;
    }
    return p;
}

}
