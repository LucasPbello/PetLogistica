package dao;

import classes.Cliente;
import classes.Financeiro;
import classes.Taxi;
import conexao.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bello
 */
public class ClienteDAO {
    // ? INSERT

    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO Cliente (nome, cpf, email, idTaxi, idFinanceiro) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setInt(4, cliente.getTaxi().getIdTaxi());
            stmt.setInt(5, cliente.getFinanceiro().getIdFinanceiro());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ? UPDATE
    public void atualizar(Cliente cliente) {
        String sql = "UPDATE Cliente SET nome=?, cpf=?, email=?, idTaxi=?, idFinanceiro=? WHERE idCliente=?";

        try (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setInt(4, cliente.getTaxi().getIdTaxi());
            stmt.setInt(5, cliente.getFinanceiro().getIdFinanceiro());
            stmt.setInt(6, cliente.getIdCliente());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ? DELETE
    public void deletar(int idCliente) {
        String sql = "DELETE FROM Cliente WHERE idCliente=?";

        try (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idCliente);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ? SELECT POR ID
    public Cliente buscarPorId(int id) {
        String sql = "SELECT * FROM Cliente WHERE idCliente=?";
        Cliente cliente = null;

        try (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));

                Taxi taxi = new Taxi();
                taxi.setIdTaxi(rs.getInt("idTaxi"));
                cliente.setTaxi(taxi);

                Financeiro financeiro = new Financeiro();
                financeiro.setIdFinanceiro(rs.getInt("idFinanceiro"));
                cliente.setFinanceiro(financeiro);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }

    // ? SELECT TODOS
    public List<Cliente> listar() {
        String sql = "SELECT * FROM Cliente";
        List<Cliente> lista = new ArrayList<>();

        try (Connection conn = Conexao.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));

                Taxi taxi = new Taxi();
                taxi.setIdTaxi(rs.getInt("idTaxi"));
                cliente.setTaxi(taxi);

                Financeiro financeiro = new Financeiro();
                financeiro.setIdFinanceiro(rs.getInt("idFinanceiro"));
                cliente.setFinanceiro(financeiro);

                lista.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}

