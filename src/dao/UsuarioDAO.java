package dao;

import classes.Usuario;
import java.sql.*;

public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() {
        try {
            // Ajuste o host, usuário e senha do seu MySQL
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/petlogistica", "root", "root"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Usuario validarLogin(String login, String senha) {
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, login);
            pst.setString(2, senha);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String usuarioLogin = rs.getString("login");
                String usuarioSenha = rs.getString("senha");
                String tipoStr = rs.getString("tipo").toUpperCase();

                return new Usuario(usuarioLogin, usuarioSenha, tipoStr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // login ou senha incorretos
    }

    public void desconectar() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
