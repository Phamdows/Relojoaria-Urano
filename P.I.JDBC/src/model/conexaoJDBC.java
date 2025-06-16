package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoJDBC {

    private Connection conexao;

    public Connection getConexao() {
        return conexao;
    }

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/pi", "root", "Adryano_2205");
            System.out.println("SUCESSO");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao conectar com o banco " + ex);
        } catch (SQLException se) {
            System.out.println("Erro: " + se);
        }
    }

    public void desconectar() {
        try {
            if (conexao != null & !conexao.isClosed()) {
                conexao.close();
                System.out.println("Desconecto com sucess");
            }
        } catch (SQLException se) {
            System.out.println("Problema ao desconectar o banco: " + se);
        }
    }
}
