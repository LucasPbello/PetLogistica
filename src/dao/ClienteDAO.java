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

        } catch (SQLException e) {
            e.printStackTrace();
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
            stmt.setInt(4, cliente.getIdCliente());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ? DELETE
    public void deletar(int idCliente) {
        String sql = "DELETE FROM Cliente WHERE idCliente=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

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

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEmail(rs.getString("telefone"));


           

              
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

        try (Connection conn = Conexao.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEmail(rs.getString("telefone"));



                lista.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}

