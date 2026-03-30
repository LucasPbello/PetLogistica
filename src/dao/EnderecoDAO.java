package dao;

import classes.Cliente;
import classes.Endereco;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author bello
 */
public class EnderecoDAO {

    public void inserir(Endereco endereco) {
        String sql = "INSERT INTO Endereco (rua, numero, bairro, cep, cidade, estado, idCliente) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, endereco.getRua());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCep());
            stmt.setString(5, endereco.getCidade());
            stmt.setString(6, endereco.getEstado());
            stmt.setInt(7, endereco.getCliente().getIdCliente());
            

            stmt.executeUpdate();
            System.out.println("Endereço inserido!");

        } catch (SQLException e) {
            System.out.println("Erro ao endereço Cliente: " + e.getMessage());
        }
    }

    // ? UPDATE
    public void atualizar(Endereco endereco) {
        String sql =  "UPDATE Endereco SET rua=?, numero=?, bairro=?, cep=?, cidade=?, estado=?, idCliente=?  WHERE idEndereco=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, endereco.getRua());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCep());
            stmt.setString(5, endereco.getCidade());
            stmt.setString(6, endereco.getEstado());
            stmt.setInt(7, endereco.getCliente().getIdCliente());
            stmt.setInt(8, endereco.getIdEndereco());

            stmt.executeUpdate();
            System.out.println("Endereço atualizado!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Endereço: " + e.getMessage());
        }
    }

    // ? DELETE
    public void deletar(int idEndereco) {
        String sql = "DELETE FROM Endereco WHERE idEndereco=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idEndereco);
            stmt.executeUpdate();
            System.out.println("Endereço deletado!");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar Endereço: " + e.getMessage());
        }
    }

    // ? SELECT POR ID
    public Endereco buscarPorId(int id) {
        Endereco e = null;

        String sql = "SELECT e.*, c.idCliente, c.nome "
                + "FROM Endereco e "
                + "JOIN Cliente c ON e.idCliente = c.idCliente "
                + "WHERE e.idEndereco = ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                e = new Endereco();

                e.setIdEndereco(rs.getInt("idEndereco"));
                e.setRua(rs.getString("rua"));
                e.setNumero(rs.getString("numero"));
                e.setBairro(rs.getString("bairro"));
                e.setCep(rs.getString("cep"));
                e.setCidade(rs.getString("cidade"));
                e.setEstado(rs.getString("estado"));

                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));

                e.setCliente(c);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return e;
    }

    // ? SELECT TODOS
    public List<Endereco> listar() {

        List<Endereco> lista = new ArrayList<>();

        String sql = "SELECT e.*, c.idCliente, c.nome "
                + "FROM Endereco e "
                + "JOIN Cliente c ON e.idCliente = c.idCliente";

        try (Connection conn = Conexao.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Endereco endereco = new Endereco();

                endereco.setIdEndereco(rs.getInt("idEndereco"));
                endereco.setRua(rs.getString("rua"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setCep(rs.getString("cep"));
                endereco.setCidade(rs.getString("cidade"));
                endereco.setEstado(rs.getString("estado"));

                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));
                endereco.setCliente(c);

                lista.add(endereco);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Cliente: " + e.getMessage());
        }

        return lista;
    }

    public List<Endereco> pesquisarPorCliente(String nome) {
        List<Endereco> lista = new ArrayList<>();

        String sql = "SELECT e.*, c.idCliente, c.nome "
                + "FROM Endereco e "
                + "JOIN Cliente c ON e.idCliente = c.idCliente "
                + "WHERE c.nome LIKE ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                // Criando endereço
                Endereco e = new Endereco();
                e.setIdEndereco(rs.getInt("idEndereco"));
                e.setRua(rs.getString("rua"));
                e.setNumero(rs.getString("numero"));
                e.setBairro(rs.getString("bairro"));
                e.setCep(rs.getString("cep"));
                e.setCidade(rs.getString("cidade"));
                e.setEstado(rs.getString("estado"));

                // Criando cliente
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));

                // Associando
                e.setCliente(c);

                lista.add(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
