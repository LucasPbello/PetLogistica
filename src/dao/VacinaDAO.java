package dao;

/**
 *
 * @author bello
 */
import classes.Vacina;
import classes.Animal;
import conexao.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class VacinaDAO {

    // INSERT
    public void inserir(Vacina vacina) {
        String sql = "INSERT INTO Vacina (vacinaNome, vacinaMarca, vacinaAplicacao, vacinaValidade, idAnimal) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // ? Validar vacina
            vacina.validar();

            stmt.setString(1, vacina.getVacinaNome());
            stmt.setString(2, vacina.getVacinaMarca());
            
            if (vacina.getVacinaAplicacao() != null) {
                stmt.setDate(3, Date.valueOf(vacina.getVacinaAplicacao()));
            } else {
                stmt.setNull(3, Types.DATE);
            }

            if (vacina.getVacinaValidade() != null) {
                stmt.setDate(4, Date.valueOf(vacina.getVacinaValidade()));
            } else {
                stmt.setNull(4, Types.DATE);
            }
            
            stmt.setInt(5, vacina.getAnimal().getIdAnimal());

            stmt.executeUpdate();
            System.out.println("Vacina inserida!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Vacina: " + e.getMessage());
        }
    }

    // UPDATE
    public void atualizar(Vacina vacina) {
        String sql = "UPDATE Vacina SET vacinaNome=?, vacinaMarca=?, vacinaAplicacao=?, vacinaValidade=?, idAnimal=? WHERE idVacina=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, vacina.getVacinaNome());
            stmt.setString(2, vacina.getVacinaMarca());
            stmt.setDate(3, Date.valueOf(vacina.getVacinaAplicacao()));
            stmt.setDate(4, Date.valueOf(vacina.getVacinaValidade()));
            stmt.setInt(5, vacina.getAnimal().getIdAnimal());
            stmt.setInt(6, vacina.getIdVacina());

            stmt.executeUpdate();
            System.out.println("Vacina atualizada!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Vacina: " + e.getMessage());
        }
    }

    // DELETE
    public void deletar(int idVacina) {
        String sql = "DELETE FROM Vacina WHERE idVacina=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idVacina);
            stmt.executeUpdate();
            System.out.println("Vacina deletada!");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar Vacina: " + e.getMessage());
        }
    }

    // BUSCAR POR ID
    public Vacina buscarPorId(int id) {
        String sql = "SELECT * FROM Vacina WHERE idVacina=?";
        Vacina vacina = null;

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                vacina = new Vacina();

                vacina.setIdVacina(rs.getInt("idVacina"));
                vacina.setVacinaNome(rs.getString("vacinaNome"));
                vacina.setVacinaMarca(rs.getString("vacinaMarca"));
                vacina.setVacinaAplicacao(rs.getDate("vacinaAplicacao").toLocalDate());
                vacina.setVacinaValidade(rs.getDate("vacinaValidade").toLocalDate());

                Animal animal = new Animal();
                animal.setIdAnimal(rs.getInt("idAnimal"));
                vacina.setAnimal(animal);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar Vacina: " + e.getMessage());
        }

        return vacina;
    }

    // LISTAR TODOS
    public List<Vacina> listar() {
        String sql = "SELECT * FROM Vacina";
        List<Vacina> lista = new ArrayList<>();

        try (Connection conn = Conexao.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Vacina vacina = new Vacina();

                vacina.setIdVacina(rs.getInt("idVacina"));
                vacina.setVacinaNome(rs.getString("vacinaNome"));
                vacina.setVacinaMarca(rs.getString("vacinaMarca"));
                vacina.setVacinaAplicacao(rs.getDate("vacinaAplicacao").toLocalDate());
                vacina.setVacinaValidade(rs.getDate("vacinaValidade").toLocalDate());

                Animal animal = new Animal();
                animal.setIdAnimal(rs.getInt("idAnimal"));
                vacina.setAnimal(animal);

                lista.add(vacina);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Vacina: " + e.getMessage());
        }

        return lista;
    }
}
