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
            stmt.setInt(3, t.getCliente().getIdCliente());
            stmt.executeUpdate();
            System.out.println("Taxi inserido!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Taxi: " + e.getMessage());
        }
    }

    public List<Taxi> listar() {
        List<Taxi> lista = new ArrayList<>();
        String sql = "SELECT * FROM Taxi";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Taxi t = new Taxi();
                t.setIdTaxi(rs.getInt("idTaxi"));
                t.setEnderecoColeta(rs.getString("EnderecoColeta"));
                t.setEnderecoEntrega(rs.getString("EnderecoEntrega"));

                // ? CRIAR OBJETO CLIENTE
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));

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
            stmt.setInt(3, t.getCliente().getIdCliente());
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
}
