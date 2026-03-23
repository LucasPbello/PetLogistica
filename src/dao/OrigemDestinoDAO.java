package dao;

/**
 *
 * @author bello
 */
import classes.OrigemDestino;
import conexao.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrigemDestinoDAO {

    // INSERT
    public void inserir(OrigemDestino od) {
        String sql = "INSERT INTO OrigemDestino (paisOrigem, paisDestino, enderecoPaisOrigem, enderecoPaisDestino, companhiaAerea) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, od.getPaisOrigem());
            stmt.setString(2, od.getPaisDestino());
            stmt.setString(3, od.getEnderecoPaisOrigem());
            stmt.setString(4, od.getEnderecoPaisDestino());
            stmt.setString(5, od.getCompanhiaAerea());

            stmt.executeUpdate();
            System.out.println("OrigemDestino inserido!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir OrigemDestino: " + e.getMessage());
        }
    }

    // UPDATE
    public void atualizar(OrigemDestino od) {
        String sql = "UPDATE OrigemDestino SET paisOrigem=?, paisDestino=?, enderecoPaisOrigem=?, enderecoPaisDestino=?, companhiaAerea=? WHERE idOrigemDestino=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, od.getPaisOrigem());
            stmt.setString(2, od.getPaisDestino());
            stmt.setString(3, od.getEnderecoPaisOrigem());
            stmt.setString(4, od.getEnderecoPaisDestino());
            stmt.setString(5, od.getCompanhiaAerea());
            stmt.setInt(6, od.getIdOrigemDestino());

            stmt.executeUpdate();
            System.out.println("OrigemDestino atualizado!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar OrigemDestino: " + e.getMessage());
        }
    }

    // DELETE
    public void deletar(int idOrigemDestino) {
        String sql = "DELETE FROM OrigemDestino WHERE idOrigemDestino=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idOrigemDestino);
            stmt.executeUpdate();
            System.out.println("OrigemDestino deletado!");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar OrigemDestino: " + e.getMessage());
        }
    }

    // BUSCAR POR ID
    public OrigemDestino buscarPorId(int id) {
        String sql = "SELECT * FROM OrigemDestino WHERE idOrigemDestino=?";
        OrigemDestino od = null;

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                od = new OrigemDestino();

                od.setIdOrigemDestino(rs.getInt("idOrigemDestino"));
                od.setPaisOrigem(rs.getString("paisOrigem"));
                od.setPaisDestino(rs.getString("paisDestino"));
                od.setEnderecoPaisOrigem(rs.getString("enderecoPaisOrigem"));
                od.setEnderecoPaisDestino(rs.getString("enderecoPaisDestino"));
                od.setCompanhiaAerea(rs.getString("companhiaAerea"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar OrigemDestino: " + e.getMessage());
        }

        return od;
    }

    // LISTAR TODOS
    public List<OrigemDestino> listar() {
        String sql = "SELECT * FROM OrigemDestino";
        List<OrigemDestino> lista = new ArrayList<>();

        try (Connection conn = Conexao.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                OrigemDestino od = new OrigemDestino();

                od.setIdOrigemDestino(rs.getInt("idOrigemDestino"));
                od.setPaisOrigem(rs.getString("paisOrigem"));
                od.setPaisDestino(rs.getString("paisDestino"));
                od.setEnderecoPaisOrigem(rs.getString("enderecoPaisOrigem"));
                od.setEnderecoPaisDestino(rs.getString("enderecoPaisDestino"));
                od.setCompanhiaAerea(rs.getString("companhiaAerea"));

                lista.add(od);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar OrigemDestino: " + e.getMessage());
        }

        return lista;
    }
}
