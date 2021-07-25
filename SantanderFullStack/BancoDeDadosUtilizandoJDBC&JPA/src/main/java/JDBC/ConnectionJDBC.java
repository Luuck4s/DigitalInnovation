package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) {

        // drive:conexao:endereco/banco
        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        try (Connection conn = DriverManager.getConnection(urlConnection, "root", "mysql")) {
            System.out.println("Sucesso");
        } catch (SQLException throwables) {
            System.out.println("Falha");
            throwables.printStackTrace();
        }

    }
}
