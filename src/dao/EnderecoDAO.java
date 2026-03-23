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
        String sql = "UPDATE Cliente SET nome=?, cpf=?, email=?, telefone=? WHERE idCliente=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, endereco.getRua());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCep());
            stmt.setString(5, endereco.getCidade());
            stmt.setString(6, endereco.getEstado());
            stmt.setInt(7, endereco.getCliente().getIdCliente());

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
        String sql = "SELECT * FROM Endereco WHERE idEndereco=?";
        Endereco endereco = null;

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                endereco = new Endereco();
                endereco.setIdEndereco(rs.getInt("idEndereco"));
                endereco.setRua(rs.getString("rua"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setCep(rs.getString("cep"));
                endereco.setCidade(rs.getString("cidade"));
                endereco.setEstado(rs.getString("estado"));

                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                endereco.setCliente(c);

            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Cliente: " + e.getMessage());
        }

        return endereco;
    }

    // ? SELECT TODOS
    public List<Endereco> listar() {
        String sql = "SELECT * FROM Endereco";
        List<Endereco> lista = new ArrayList<>();

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
                endereco.setCliente(c);

                lista.add(endereco);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Cliente: " + e.getMessage());
        }

        return lista;
    }
}
