package dao;

import classes.Cliente;
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
        String sql = "INSERT INTO Cliente (nome, cpf, email, telefone) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefone());

            stmt.executeUpdate();
            System.out.println("Cliente inserido!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Cliente: " + e.getMessage());
        }
    }

    // ? UPDATE
    public void atualizar(Cliente cliente) {
        String sql = "UPDATE Cliente SET nome=?, cpf=?, email=?, telefone=? WHERE idCliente=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefone());
            stmt.setInt(5, cliente.getIdCliente());

            stmt.executeUpdate();
            System.out.println("Cliente atualizado!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Cliente: " + e.getMessage());
        }
    }

    // ? DELETE
    public void deletar(int idCliente) {
        String sql = "DELETE FROM Cliente WHERE idCliente=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idCliente);
            stmt.executeUpdate();
            System.out.println("Cliente deletado!");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar Cliente: " + e.getMessage());
        }
    }

    // ? SELECT POR ID
    public Cliente buscarPorId(int id) {
        String sql = "SELECT * FROM Cliente WHERE idCliente=?";
        Cliente cliente = null;

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));

            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Cliente: " + e.getMessage());
        }

        return cliente;
    }

    // ? SELECT TODOS
    public List<Cliente> listar() {
        String sql = "SELECT * FROM Cliente";
        List<Cliente> lista = new ArrayList<>();

        try (Connection conn = Conexao.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));

                lista.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Cliente: " + e.getMessage());
        }

        return lista;
    }

    public List<Cliente> pesquisarPorNome(String nome) {
        List<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM Cliente WHERE nome LIKE ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));

                lista.add(c);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro na pesquisa: " + e.getMessage());
        }

        return lista;
    }
}
