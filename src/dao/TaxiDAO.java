package dao;

import classes.Cliente;
import classes.Taxi;
import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bello
 */
public class TaxiDAO {

    public void inserir(Taxi t) {
        String sql = "INSERT INTO Taxi (EnderecoColeta, EnderecoEntrega, idCliente) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, t.getEnderecoColeta());
            stmt.setString(2, t.getEnderecoEntrega());
            if (t.getCliente() != null) {
                stmt.setInt(3, t.getCliente().getIdCliente());
            } else {
                stmt.setNull(3, Types.INTEGER);
            }
            stmt.executeUpdate();
            System.out.println("Taxi inserido!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Taxi: " + e.getMessage());
        }
    }

    public List<Taxi> listar() {
        List<Taxi> lista = new ArrayList<>();
        String sql = "SELECT t.*, c.nome "
                + "FROM Taxi t "
                + "LEFT JOIN Cliente c ON t.idCliente = c.idCliente";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Taxi t = new Taxi();
                t.setIdTaxi(rs.getInt("idTaxi"));
                t.setEnderecoColeta(rs.getString("enderecoColeta"));
                t.setEnderecoEntrega(rs.getString("enderecoEntrega"));

                // ? CRIAR OBJETO CLIENTE
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));

                t.setCliente(c);
                lista.add(t);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Taxi: " + e.getMessage());
        }

        return lista;

    }

    public void atualizar(Taxi t) {
        String sql = "UPDATE Taxi SET EnderecoColeta=?, EnderecoEntrega=?, idCliente=? WHERE idTaxi=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, t.getEnderecoColeta());
            stmt.setString(2, t.getEnderecoEntrega());
            if (t.getCliente() != null) {
                stmt.setInt(3, t.getCliente().getIdCliente());
            } else {
                stmt.setNull(3, Types.INTEGER);
            }
            stmt.setInt(4, t.getIdTaxi());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Taxi: " + e.getMessage());
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM Taxi WHERE idTaxi=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao deletar Taxi: " + e.getMessage());
        }
    }

    // ? SELECT POR ID
    public Taxi buscarPorId(int id) {
        Taxi t = null;

        String sql = "SELECT t.*, c.idCliente, c.nome "
                + "FROM Taxi t "
                + "JOIN Cliente c ON t.idCliente = c.idCliente "
                + "WHERE t.idTaxi = ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                t = new Taxi();
                t.setIdTaxi(rs.getInt("idTaxi"));
                t.setEnderecoColeta(rs.getString("enderecoColeta"));
                t.setEnderecoEntrega(rs.getString("enderecoEntrega"));

                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));

                t.setCliente(c);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return t;
    }

    public List<Taxi> pesquisarPorCliente(String nome) {
        List<Taxi> lista = new ArrayList<>();

        String sql = "SELECT t.*, c.idCliente, c.nome "
                + "FROM Taxi t "
                + "JOIN Cliente c ON t.idCliente = c.idCliente "
                + "WHERE c.nome LIKE ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                // Criando endereço
                Taxi t = new Taxi();
                t.setIdTaxi(rs.getInt("idTaxi"));
                t.setEnderecoColeta(rs.getString("enderecoColeta"));
                t.setEnderecoEntrega(rs.getString("enderecoEntrega"));

                // Criando cliente
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));

                // Associando
                t.setCliente(c);

                lista.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
