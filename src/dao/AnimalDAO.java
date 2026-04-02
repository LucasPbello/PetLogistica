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
                + "(nome, especie, raca, sexo, cor, peso, tamanho, caixaTransporte, dataNascimento, documentos, imagens, idCliente) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setString(3, animal.getRaca());
            stmt.setString(4, animal.getSexo());
            stmt.setString(5, animal.getCor());
            stmt.setDouble(6, animal.getPeso());
            stmt.setDouble(7, animal.getTamanho());
            stmt.setInt(8, animal.getCaixaTransporte());
            stmt.setDate(9, Date.valueOf(animal.getDataNascimento()));

            if (animal.getDocumentos() != null) {
                stmt.setBytes(10, animal.getDocumentos());
            } else {
                stmt.setNull(10, java.sql.Types.BLOB);
            }

           // IMAGENS
            if (animal.getImagens() != null) {
                stmt.setBytes(11, animal.getImagens());
            } else {
                stmt.setNull(11, java.sql.Types.BLOB);
            }

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
                a.setEspecie(rs.getString("especie"));
                a.setRaca(rs.getString("raca"));
                a.setSexo(rs.getString("sexo"));
                a.setCor(rs.getString("cor"));
                a.setPeso(rs.getDouble("peso"));
                if (rs.getDate("dataNascimento") != null) {
                    a.setDataNascimento(rs.getDate("dataNascimento").toLocalDate());
                }

                a.setTamanho(rs.getDouble("tamanho"));
                a.setCaixaTransporte(rs.getInt("caixaTransporte"));

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

    public List<Animal> buscarPorNome(String nome) {
        List<Animal> lista = new ArrayList<>();

        String sql = "SELECT a.*, c.nome AS nomeCliente "
                + "FROM Animal a "
                + "LEFT JOIN Cliente c ON a.idCliente = c.idCliente "
                + "WHERE a.nome LIKE ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Animal a = new Animal();

                a.setIdAnimal(rs.getInt("idAnimal"));
                a.setNome(rs.getString("nome"));
                a.setEspecie(rs.getString("especie"));
                a.setRaca(rs.getString("raca"));
                a.setSexo(rs.getString("sexo"));
                a.setPeso(rs.getDouble("peso"));
                a.setCor(rs.getString("cor"));

                if (rs.getDate("dataNascimento") != null) {
                    a.setDataNascimento(rs.getDate("dataNascimento").toLocalDate());
                }

                a.setTamanho(rs.getDouble("tamanho"));
                a.setCaixaTransporte(rs.getInt("caixaTransporte"));

                // ? CORREÇÃO IMPORTANTE (cliente)
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nomeCliente"));
                a.setCliente(c);

                lista.add(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
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
                a.setEspecie(rs.getString("especie"));
                a.setRaca(rs.getString("raca"));
                a.setSexo(rs.getString("sexo"));
                a.setCor(rs.getString("cor"));
                a.setPeso(rs.getDouble("peso"));
                if (rs.getDate("dataNascimento") != null) {
                    a.setDataNascimento(rs.getDate("dataNascimento").toLocalDate());
                }

                a.setTamanho(rs.getDouble("tamanho"));
                a.setCaixaTransporte(rs.getInt("caixaTransporte"));
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
        String sql = "UPDATE Animal SET nome=?, especie=?, raca=?, sexo=?, cor=?, peso=?, tamanho=?, caixaTransporte=?, "
                + "dataNascimento=?, documentos=?, imagens=?, idCliente=? "
                + "WHERE idAnimal=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setString(3, animal.getRaca());
            stmt.setString(4, animal.getSexo());
            stmt.setString(5, animal.getCor());
            stmt.setDouble(6, animal.getPeso());
            stmt.setDouble(7, animal.getTamanho());
            stmt.setInt(8, animal.getCaixaTransporte());
            stmt.setDate(9, Date.valueOf(animal.getDataNascimento()));

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
