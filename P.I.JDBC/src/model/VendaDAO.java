package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VendaDAO {

    public static boolean cadastrarVenda(Venda venda) {
        conexaoJDBC conn = new conexaoJDBC();
        conn.conectar();

        //Variaveis do Produto
        String produtos = venda.getProdutos();
        String descricao = venda.getDescricao();
        String data = venda.getData();
        double valor = venda.getValorTotal();
        double desconto = venda.getDesconto();
        String formaPagamento = venda.getFormaPagamento();
        System.out.println("1º data: " + data);

        String[] partesData = data.split(" ");
        String data2 = partesData[0];
        String[] partesData2 = data2.split("/");
        data = partesData2[2] + "-" + partesData2[1] + "-" + partesData2[0] + " " + partesData[1];
        System.out.println("2º data: " + data);
        //Comandos SQL
        String sql = "INSERT INTO vendas (produtos, descricao, data, valorTotal, desconto, formaPagamento) VALUES (?, ? ,?, ?, ? ,?);";

        try {
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.setString(1, produtos);
            ps.setString(2, descricao);
            ps.setString(3, data);
            ps.setString(4, String.valueOf(valor));
            ps.setString(5, String.valueOf(desconto));
            ps.setString(6, formaPagamento);

            ps.executeUpdate();
            conn.desconectar();
            return true;
        } catch (SQLException se) {
            System.out.println("Erro ao registrar venda: " + se.getMessage());
            return false;
        }
    }

    public static ArrayList<Venda> listarVendas() {
        ArrayList<Venda> lista = new ArrayList<>();

        try {
            //Conexão com o banco de dados
            conexaoJDBC conn = new conexaoJDBC();
            conn.conectar();

            //Query SQL
            String sql = "SELECT * FROM vendas;";

            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venda v = new Venda();

                v.setId(rs.getInt("id"));
                v.setProdutos(rs.getString("produtos"));
                v.setDescricao(rs.getString("descricao"));
                v.setData(rs.getString("data"));
                v.setValorTotal(rs.getDouble("valorTotal"));
                v.setDesconto(rs.getDouble("desconto"));
                v.setFormaPagamento(rs.getString("formaPagamento"));

                lista.add(v);
            }
            conn.desconectar();
        } catch (SQLException se) {
            System.out.println("Erro ao listar vendas: " + se);
        }
        return lista;
    }

    public static boolean excluirVenda(int id) {
        try {
            //CONEXAO COM O BANCO
            conexaoJDBC conn = new conexaoJDBC();
            conn.conectar();

            //Comando SQL
            String sql = "DELETE FROM vendas WHERE id = ?";

            //Preparando o comando
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);

            //COMANDO FUNCIONANDO
            ps.setInt(1, id);
            ps.executeUpdate();

            conn.desconectar();
            return true;
        } catch (SQLException se) {
            System.out.println("Erro ao Deletar o venda: " + se);
            return false;
        }
    }
}
