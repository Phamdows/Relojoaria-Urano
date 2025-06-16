package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OsDAO {

    public static boolean cadastrarOS(OrdemServico os) {
        conexaoJDBC conn = new conexaoJDBC();
        conn.conectar();

        //Variaveis do Produto
        String nomeCliente = os.getNomeCliente();
        String telefone = os.getTelefone();
        String servico = os.getServico();
        double preco = os.getPreco();
        String dataRecepcao = os.getDataRecepcao();
        String formaPagamento = os.getFormaPagamento();
        String jaPago = os.getJaPago();
        String status = os.getStatus();

        String[] partesData = dataRecepcao.split(" ");
        String data2 = partesData[0];
        String[] partesData2 = data2.split("/");
        dataRecepcao = partesData2[2] + "-" + partesData2[1] + "-" + partesData2[0] + " " + partesData[1];

        //Comandos SQL
        String sql = "INSERT INTO ordemServico (nomeCliente, telefone, servico, preco, dataRecepcao, formaPagamento, jaPago, status) VALUES (?, ? ,?, ?, ? ,?, ?, ?);";

        try {
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.setString(1, nomeCliente);
            ps.setString(2, telefone);
            ps.setString(3, servico);
            ps.setString(4, String.valueOf(preco));
            ps.setString(5, dataRecepcao);
            ps.setString(6, formaPagamento);
            ps.setString(7, jaPago);
            ps.setString(8, status);

            ps.executeUpdate();
            conn.desconectar();
            return true;
        } catch (SQLException se) {
            System.out.println("Erro ao registrar O.S: " + se.getMessage());
            return false;
        }
    }

    public static boolean excluirOS(int id) {
        try {
            //CONEXAO COM O BANCO
            conexaoJDBC conn = new conexaoJDBC();
            conn.conectar();

            //Comando SQL
            String sql = "DELETE FROM ordemServico WHERE id = ?";

            //Preparando o comando
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);

            //COMANDO FUNCIONANDO
            ps.setInt(1, id);
            ps.executeUpdate();

            conn.desconectar();
            return true;
        } catch (SQLException se) {
            System.out.println("Erro ao Deletar O.S: " + se);
            return false;
        }
    }

    public static ArrayList<OrdemServico> listarOS() {
        ArrayList<OrdemServico> lista = new ArrayList<>();

        try {
            //Conexão com o banco de dados
            conexaoJDBC conn = new conexaoJDBC();
            conn.conectar();

            //Query SQL
            String sql = "SELECT * FROM ordemServico;";

            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                OrdemServico os = new OrdemServico();

                os.setId(rs.getInt("id"));
                os.setNomeCliente(rs.getString("nomeCliente"));
                os.setTelefone(rs.getString("telefone"));
                os.setServico(rs.getString("servico"));
                os.setPreco(rs.getDouble("preco"));
                os.setDataRecepcao(rs.getString("dataRecepcao"));
                os.setDataRetirada(rs.getString("dataRetirada"));
                os.setFormaPagamento(rs.getString("formaPagamento"));
                os.setJaPago(rs.getString("jaPago"));
                os.setStatus(rs.getString("status"));

                lista.add(os);
            }
            conn.desconectar();
        } catch (SQLException se) {
            System.out.println("Erro ao listar O.S: " + se);
        }
        return lista;
    }

    public static ArrayList<OrdemServico> listarOSEmServico() {
        ArrayList<OrdemServico> lista = new ArrayList<>();

        try {
            //Conexão com o banco de dados
            conexaoJDBC conn = new conexaoJDBC();
            conn.conectar();

            //Query SQL
            String sql = "SELECT * FROM ordemServico WHERE status = \"Em serviço\";";

            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                OrdemServico os = new OrdemServico();

                os.setId(rs.getInt("id"));
                os.setNomeCliente(rs.getString("nomeCliente"));
                os.setTelefone(rs.getString("telefone"));
                os.setServico(rs.getString("servico"));
                os.setPreco(rs.getDouble("preco"));
                os.setDataRecepcao(rs.getString("dataRecepcao"));
                os.setDataRetirada(rs.getString("dataRetirada"));
                os.setFormaPagamento(rs.getString("formaPagamento"));
                os.setJaPago(rs.getString("jaPago"));
                os.setStatus(rs.getString("status"));

                lista.add(os);
            }
            conn.desconectar();
        } catch (SQLException se) {
            System.out.println("Erro ao listar O.S: " + se);
        }
        return lista;
    }

    public static ArrayList<OrdemServico> listarOSEntregue() {
        ArrayList<OrdemServico> lista = new ArrayList<>();

        try {
            //Conexão com o banco de dados
            conexaoJDBC conn = new conexaoJDBC();
            conn.conectar();

            //Query SQL
            String sql = "SELECT * FROM ordemServico WHERE status = \"Entregue\";";

            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                OrdemServico os = new OrdemServico();

                os.setId(rs.getInt("id"));
                os.setNomeCliente(rs.getString("nomeCliente"));
                os.setTelefone(rs.getString("telefone"));
                os.setServico(rs.getString("servico"));
                os.setPreco(rs.getDouble("preco"));
                os.setDataRecepcao(rs.getString("dataRecepcao"));
                os.setDataRetirada(rs.getString("dataRetirada"));
                os.setFormaPagamento(rs.getString("formaPagamento"));
                os.setJaPago(rs.getString("jaPago"));
                os.setStatus(rs.getString("status"));

                lista.add(os);
            }
            conn.desconectar();
        } catch (SQLException se) {
            System.out.println("Erro ao listar O.S: " + se);
        }
        return lista;
    }

    public static boolean entregarOS(int id, String formaPagamento, String jaPago, String dataRetirada) {
        try {
            //CONEXAO COM O BANCO
            conexaoJDBC conn = new conexaoJDBC();
            conn.conectar();

            //Comando SQL
            String sql = "UPDATE ordemServico SET status = ?, formaPagamento = ?, jaPago = ?, dataRetirada = ? WHERE id = ?;";

            //Preparando o comando
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);

            //COMANDO FUNCIONANDO
            ps.setString(1, "Entregue");
            ps.setString(2, formaPagamento);
            ps.setString(3, jaPago);
            ps.setString(4, dataRetirada);
            ps.setInt(5, id);
            ps.executeUpdate();

            conn.desconectar();
            return true;
        } catch (SQLException se) {
            System.out.println("Erro ao Fechar O.S: " + se);
            return false;
        }
    }
}
