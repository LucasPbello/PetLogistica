package dao;

/**
 *
 * @author bello
 */
import classes.Animal;
import classes.Cliente;

import conexao.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    // CREATE
    public void inserir(Animal animal) {
        String sql = "INSERT INTO Animal "
                + "(nome, raca, cor, peso, tamanho, caixaTransporte, dataNascimento, microchip, carteirinha, documentos, imagens, idCliente) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getRaca());
            stmt.setString(3, animal.getCor());
            stmt.setDouble(4, animal.getPeso());
            stmt.setInt(5, animal.getTamanho());
            stmt.setInt(6, animal.getCaixaTransporte());
            stmt.setDate(7, Date.valueOf(animal.getDataNascimento()));
            stmt.setString(8, animal.getMicrochip());

            stmt.setBytes(9, animal.getCarteirinha());
            stmt.setBytes(10, animal.getDocumentos());
            stmt.setBytes(11, animal.getImagens());

            stmt.setInt(12, animal.getCliente().getIdCliente());

            stmt.executeUpdate();
            System.out.println("Animal inserido!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Animal: " + e.getMessage());
        }
    }

    // READ (LISTAR TODOS)
    public List<Animal> listar() {
        List<Animal> lista = new ArrayList<>();
        String sql = "SELECT a.*, c.nome AS nomeCliente "
                + "FROM Animal a "
                + "LEFT JOIN Cliente c ON a.idCliente = c.idCliente";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Animal a = new Animal();

                a.setIdAnimal(rs.getInt("idAnimal"));
                a.setNome(rs.getString("nome"));
                a.setRaca(rs.getString("raca"));
                a.setCor(rs.getString("cor"));
                a.setPeso(rs.getDouble("peso"));
                a.setTamanho(rs.getInt("tamanho"));
                a.setCaixaTransporte(rs.getInt("caixaTransporte"));
                a.setDataNascimento(rs.getDate("dataNascimento").toLocalDate());
                a.setMicrochip(rs.getString("microchip"));

                a.setCarteirinha(rs.getBytes("carteirinha"));
                a.setDocumentos(rs.getBytes("documentos"));
                a.setImagens(rs.getBytes("imagens"));

                // Relacionamentos (somente ID)
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nomeCliente"));
                a.setCliente(c);

                lista.add(a);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Animal: " + e.getMessage());
        }

        return lista;
    }

    // READ (BUSCAR POR ID)
    public Animal buscarPorId(int id) {
        String sql = "SELECT * FROM Animal WHERE idAnimal=?";
        Animal a = null;

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                a = new Animal();

                a.setIdAnimal(rs.getInt("idAnimal"));
                a.setNome(rs.getString("nome"));
                a.setRaca(rs.getString("raca"));
                a.setCor(rs.getString("cor"));
                a.setPeso(rs.getDouble("peso"));
                a.setTamanho(rs.getInt("tamanho"));
                a.setCaixaTransporte(rs.getInt("caixaTransporte"));
                a.setDataNascimento(rs.getDate("dataNascimento").toLocalDate());
                a.setMicrochip(rs.getString("microchip"));

                a.setCarteirinha(rs.getBytes("carteirinha"));
                a.setDocumentos(rs.getBytes("documentos"));
                a.setImagens(rs.getBytes("imagens"));

                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                a.setCliente(c);

            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Animal: " + e.getMessage());
        }

        return a;
    }

    // UPDATE
    public void atualizar(Animal animal) {
        String sql = "UPDATE Animal SET nome=?, raca=?, cor=?, peso=?, tamanho=?, caixaTransporte=?, "
                + "dataNascimento=?, microchip=?, carteirinha=?, documentos=?, imagens=?, idCliente=? "
                + "WHERE idAnimal=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getRaca());
            stmt.setString(3, animal.getCor());
            stmt.setDouble(4, animal.getPeso());
            stmt.setInt(5, animal.getTamanho());
            stmt.setInt(6, animal.getCaixaTransporte());
            stmt.setDate(7, Date.valueOf(animal.getDataNascimento()));
            stmt.setString(8, animal.getMicrochip());

            stmt.setBytes(9, animal.getCarteirinha());
            stmt.setBytes(10, animal.getDocumentos());
            stmt.setBytes(11, animal.getImagens());

            stmt.setInt(12, animal.getCliente().getIdCliente());

            stmt.setInt(13, animal.getIdAnimal());

            stmt.executeUpdate();
            System.out.println("Animal atualizado!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Animal: " + e.getMessage());
        }
    }

    // DELETE
    public void deletar(int id) {
        String sql = "DELETE FROM Animal WHERE idAnimal=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("Animal deletado!");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar Animal: " + e.getMessage());
        }
    }
}
