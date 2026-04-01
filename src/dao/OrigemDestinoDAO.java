package dao;

/**
 *
 * @author bello
 */
import classes.Animal;
import classes.OrigemDestino;
import conexao.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrigemDestinoDAO {

    // INSERT
    public void inserir(OrigemDestino od) {
        String sql = "INSERT INTO OrigemDestino (paisOrigem, paisDestino, enderecoPaisOrigem, enderecoPaisDestino, companhiaAerea, idAnimal) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, od.getPaisOrigem());
            stmt.setString(2, od.getPaisDestino());
            stmt.setString(3, od.getEnderecoPaisOrigem());
            stmt.setString(4, od.getEnderecoPaisDestino());
            stmt.setString(5, od.getCompanhiaAerea());
            stmt.setInt(6, od.getAnimal().getIdAnimal());

            stmt.executeUpdate();
            System.out.println("OrigemDestino inserido!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir OrigemDestino: " + e.getMessage());
        }
    }

    // UPDATE
    public void atualizar(OrigemDestino od) {
        String sql = "UPDATE OrigemDestino SET paisOrigem=?, paisDestino=?, enderecoPaisOrigem=?, enderecoPaisDestino=?, companhiaAerea=?, idAnimal=? WHERE idOrigemDestino=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, od.getPaisOrigem());
            stmt.setString(2, od.getPaisDestino());
            stmt.setString(3, od.getEnderecoPaisOrigem());
            stmt.setString(4, od.getEnderecoPaisDestino());
            stmt.setString(5, od.getCompanhiaAerea());
            stmt.setInt(6, od.getAnimal().getIdAnimal());
            stmt.setInt(7, od.getIdOrigemDestino());

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

                Animal a = new Animal();
                a.setIdAnimal(rs.getInt("idAnimal"));
                od.setAnimal(a);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar OrigemDestino: " + e.getMessage());
        }

        return od;
    }

    // LISTAR TODOS
    public List<OrigemDestino> listar() {
        List<OrigemDestino> lista = new ArrayList<>();

        String sql = "SELECT od.*, a.idAnimal, a.nome AS nomeAnimal "
                + "FROM OrigemDestino od "
                + "LEFT JOIN Animal a ON od.idAnimal = a.idAnimal";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                OrigemDestino o = new OrigemDestino();

                o.setIdOrigemDestino(rs.getInt("idOrigemDestino"));
                o.setPaisOrigem(rs.getString("paisOrigem"));
                o.setPaisDestino(rs.getString("paisDestino"));
                o.setEnderecoPaisOrigem(rs.getString("enderecoPaisOrigem"));
                o.setEnderecoPaisDestino(rs.getString("enderecoPaisDestino"));
                o.setCompanhiaAerea(rs.getString("companhiaAerea"));

                // ? ANIMAL
                int idAnimal = rs.getInt("idAnimal");

                if (idAnimal > 0) {
                    Animal a = new Animal();
                    a.setIdAnimal(idAnimal);
                    a.setNome(rs.getString("nomeAnimal"));

                    o.setAnimal(a);
                }

                lista.add(o);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
