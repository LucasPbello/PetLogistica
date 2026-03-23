package dao;

/**
 *
 * @author bello
 */
import classes.Animal;
import classes.Cliente;
import classes.OrigemDestino;
import conexao.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    // CREATE
    public void inserir(Animal animal) {
        String sql = "INSERT INTO Animal "
                + "(nome, Raca, Cor, Peso, Tamanho, CaixaTransporte, DataNascimento, Documentos, Imagens, idCliente, idOrigemDestino) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getRaca());
            stmt.setString(3, animal.getCor());
            stmt.setBigDecimal(4, animal.getPeso());
            stmt.setBigDecimal(5, animal.getTamanho());
            stmt.setString(6, animal.getCaixaTransporte());
            stmt.setDate(7, animal.getDataNascimento());

            stmt.setBytes(8, animal.getDocumentos());
            stmt.setBytes(9, animal.getImagens());

            stmt.setInt(10, animal.getCliente().getIdCliente());
            stmt.setInt(11, animal.getOrigemDestino().getIdOrigemDestino());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ (LISTAR TODOS)
    public List<Animal> listar() {
        List<Animal> lista = new ArrayList<>();
        String sql = "SELECT * FROM Animal";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Animal a = new Animal();

                a.setIdAnimal(rs.getInt("idAnimal"));
                a.setNome(rs.getString("nome"));
                a.setRaca(rs.getString("Raca"));
                a.setCor(rs.getString("Cor"));
                a.setPeso(rs.getBigDecimal("Peso"));
                a.setTamanho(rs.getBigDecimal("Tamanho"));
                a.setCaixaTransporte(rs.getString("CaixaTransporte"));
                a.setDataNascimento(rs.getDate("DataNascimento"));

                a.setDocumentos(rs.getBytes("Documentos"));
                a.setImagens(rs.getBytes("Imagens"));

                // Relacionamentos (somente ID)
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                a.setCliente(c);

                OrigemDestino od = new OrigemDestino();
                od.setIdOrigemDestino(rs.getInt("idOrigemDestino"));
                a.setOrigemDestino(od);

                lista.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // READ (BUSCAR POR ID)
    public Animal buscarPorId(int id) {
        String sql = "SELECT * FROM Animal WHERE idAnimal=?";
        Animal a = null;

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                a = new Animal();

                a.setIdAnimal(rs.getInt("idAnimal"));
                a.setNome(rs.getString("nome"));
                a.setRaca(rs.getString("Raca"));
                a.setCor(rs.getString("Cor"));
                a.setPeso(rs.getBigDecimal("Peso"));
                a.setTamanho(rs.getBigDecimal("Tamanho"));
                a.setCaixaTransporte(rs.getString("CaixaTransporte"));
                a.setDataNascimento(rs.getDate("DataNascimento"));

                a.setDocumentos(rs.getBytes("Documentos"));
                a.setImagens(rs.getBytes("Imagens"));

                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                a.setCliente(c);

                OrigemDestino od = new OrigemDestino();
                od.setIdOrigemDestino(rs.getInt("idOrigemDestino"));
                a.setOrigemDestino(od);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return a;
    }

    // UPDATE
    public void atualizar(Animal animal) {
        String sql = "UPDATE Animal SET nome=?, Raca=?, Cor=?, Peso=?, Tamanho=?, CaixaTransporte=?, "
                + "DataNascimento=?, Documentos=?, Imagens=?, idCliente=?, idOrigemDestino=? "
                + "WHERE idAnimal=?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getRaca());
            stmt.setString(3, animal.getCor());
            stmt.setBigDecimal(4, animal.getPeso());
            stmt.setBigDecimal(5, animal.getTamanho());
            stmt.setString(6, animal.getCaixaTransporte());
            stmt.setDate(7, animal.getDataNascimento());

            stmt.setBytes(8, animal.getDocumentos());
            stmt.setBytes(9, animal.getImagens());

            stmt.setInt(10, animal.getCliente().getIdCliente());
            stmt.setInt(11, animal.getOrigemDestino().getIdOrigemDestino());

            stmt.setInt(12, animal.getIdAnimal());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deletar(int id) {
        String sql = "DELETE FROM Animal WHERE idAnimal=?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
