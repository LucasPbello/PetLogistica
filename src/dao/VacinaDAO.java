package dao;

import classes.Vacina;
import classes.Animal;
import conexao.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VacinaDAO {

    // ========================= INSERT =========================
    public void inserir(Vacina vacina) {

        String sql = "INSERT INTO Vacina "
                + "(microchip, microchipAplicacao, vacinaNome, lote, vacinaMarca, "
                + "vacinaAplicacao, vacinaValidade, carteirinha, idAnimal) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            vacina.validar();

            stmt.setString(1, vacina.getMicrochip());

            if (vacina.getMicrochipAplicacao() != null) {
                stmt.setDate(2, Date.valueOf(vacina.getMicrochipAplicacao()));
            } else {
                stmt.setNull(2, Types.DATE);
            }

            stmt.setString(3, vacina.getVacinaNome());
            stmt.setString(4, vacina.getLote());
            stmt.setString(5, vacina.getVacinaMarca());

            if (vacina.getVacinaAplicacao() != null) {
                stmt.setDate(6, Date.valueOf(vacina.getVacinaAplicacao()));
            } else {
                stmt.setNull(6, Types.DATE);
            }

            if (vacina.getVacinaValidade() != null) {
                stmt.setDate(7, Date.valueOf(vacina.getVacinaValidade()));
            } else {
                stmt.setNull(7, Types.DATE);
            }

            if (vacina.getCarteirinha() != null) {
                stmt.setBytes(8, vacina.getCarteirinha());
            } else {
                stmt.setNull(8, Types.BLOB);
            }

            if (vacina.getAnimal() != null) {
                stmt.setInt(9, vacina.getAnimal().getIdAnimal());
            } else {
                stmt.setNull(9, Types.INTEGER);
            }

            stmt.executeUpdate();
            System.out.println("Vacina inserida com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ========================= UPDATE =========================
    public void atualizar(Vacina vacina) {

        String sql = "UPDATE Vacina SET "
                + "microchip=?, microchipAplicacao=?, vacinaNome=?, lote=?, vacinaMarca=?, "
                + "vacinaAplicacao=?, vacinaValidade=?, carteirinha=?, idAnimal=? "
                + "WHERE idVacina=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            vacina.validar();

            stmt.setString(1, vacina.getMicrochip());

            if (vacina.getMicrochipAplicacao() != null) {
                stmt.setDate(2, Date.valueOf(vacina.getMicrochipAplicacao()));
            } else {
                stmt.setNull(2, Types.DATE);
            }

            stmt.setString(3, vacina.getVacinaNome());
            stmt.setString(4, vacina.getLote());
            stmt.setString(5, vacina.getVacinaMarca());

            if (vacina.getVacinaAplicacao() != null) {
                stmt.setDate(6, Date.valueOf(vacina.getVacinaAplicacao()));
            } else {
                stmt.setNull(6, Types.DATE);
            }

            if (vacina.getVacinaValidade() != null) {
                stmt.setDate(7, Date.valueOf(vacina.getVacinaValidade()));
            } else {
                stmt.setNull(7, Types.DATE);
            }

            if (vacina.getCarteirinha() != null) {
                stmt.setBytes(8, vacina.getCarteirinha());
            } else {
                stmt.setNull(8, Types.BLOB);
            }

            if (vacina.getAnimal() != null) {
                stmt.setInt(9, vacina.getAnimal().getIdAnimal());
            } else {
                stmt.setNull(9, Types.INTEGER);
            }

            stmt.setInt(10, vacina.getIdVacina());

            stmt.executeUpdate();
            System.out.println("Vacina atualizada com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ========================= DELETE =========================
    public void deletar(int idVacina) {

        String sql = "DELETE FROM Vacina WHERE idVacina=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idVacina);
            stmt.executeUpdate();

            System.out.println("Vacina deletada com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ========================= BUSCAR POR ID =========================
    public Vacina buscarPorId(int id) {

        String sql = "SELECT v.*, a.nome AS nomeAnimal "
                + "FROM Vacina v "
                + "LEFT JOIN Animal a ON v.idAnimal = a.idAnimal "
                + "WHERE v.idVacina=?";

        Vacina vacina = null;

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                vacina = new Vacina();

                vacina.setIdVacina(rs.getInt("idVacina"));
                vacina.setMicrochip(rs.getString("microchip"));

                Date microchipData = rs.getDate("microchipAplicacao");
                if (microchipData != null) {
                    vacina.setMicrochipAplicacao(microchipData.toLocalDate());
                }

                vacina.setVacinaNome(rs.getString("vacinaNome"));
                vacina.setLote(rs.getString("lote"));
                vacina.setVacinaMarca(rs.getString("vacinaMarca"));

                Date aplicacao = rs.getDate("vacinaAplicacao");
                if (aplicacao != null) {
                    vacina.setVacinaAplicacao(aplicacao.toLocalDate());
                }

                Date validade = rs.getDate("vacinaValidade");
                if (validade != null) {
                    vacina.setVacinaValidade(validade.toLocalDate());
                }

                vacina.setCarteirinha(rs.getBytes("carteirinha"));

                // ANIMAL
                Animal animal = new Animal();
                animal.setIdAnimal(rs.getInt("idAnimal"));
                animal.setNome(rs.getString("nomeAnimal"));

                vacina.setAnimal(animal);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return vacina;
    }

    // ========================= LISTAR =========================
    public List<Vacina> listar() {

        String sql = "SELECT v.*, a.nome AS nomeAnimal "
                + "FROM Vacina v "
                + "LEFT JOIN Animal a ON v.idAnimal = a.idAnimal";

        List<Vacina> lista = new ArrayList<>();

        try (Connection conn = Conexao.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                Vacina vacina = new Vacina();

                vacina.setIdVacina(rs.getInt("idVacina"));
                vacina.setMicrochip(rs.getString("microchip"));

                Date microchipData = rs.getDate("microchipAplicacao");
                if (microchipData != null) {
                    vacina.setMicrochipAplicacao(microchipData.toLocalDate());
                }

                vacina.setVacinaNome(rs.getString("vacinaNome"));
                vacina.setLote(rs.getString("lote"));
                vacina.setVacinaMarca(rs.getString("vacinaMarca"));

                Date aplicacao = rs.getDate("vacinaAplicacao");
                if (aplicacao != null) {
                    vacina.setVacinaAplicacao(aplicacao.toLocalDate());
                }

                Date validade = rs.getDate("vacinaValidade");
                if (validade != null) {
                    vacina.setVacinaValidade(validade.toLocalDate());
                }

                vacina.setCarteirinha(rs.getBytes("carteirinha"));

                // ANIMAL
                Animal animal = new Animal();
                animal.setIdAnimal(rs.getInt("idAnimal"));
                animal.setNome(rs.getString("nomeAnimal"));

                vacina.setAnimal(animal);

                lista.add(vacina);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    // ========================= BUSCAR POR ANIMAL =========================
    public List<Vacina> buscarPorAnimal(int idAnimal) {

        String sql = "SELECT v.*, a.nome AS nomeAnimal "
                + "FROM Vacina v "
                + "LEFT JOIN Animal a ON v.idAnimal = a.idAnimal "
                + "WHERE v.idAnimal=?";

        List<Vacina> lista = new ArrayList<>();

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idAnimal);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Vacina vacina = new Vacina();

                vacina.setIdVacina(rs.getInt("idVacina"));
                vacina.setMicrochip(rs.getString("microchip"));

                Date microchipData = rs.getDate("microchipAplicacao");
                if (microchipData != null) {
                    vacina.setMicrochipAplicacao(microchipData.toLocalDate());
                }

                vacina.setVacinaNome(rs.getString("vacinaNome"));
                vacina.setLote(rs.getString("lote"));
                vacina.setVacinaMarca(rs.getString("vacinaMarca"));

                Date aplicacao = rs.getDate("vacinaAplicacao");
                if (aplicacao != null) {
                    vacina.setVacinaAplicacao(aplicacao.toLocalDate());
                }

                Date validade = rs.getDate("vacinaValidade");
                if (validade != null) {
                    vacina.setVacinaValidade(validade.toLocalDate());
                }

                vacina.setCarteirinha(rs.getBytes("carteirinha"));

                // ANIMAL
                Animal animal = new Animal();
                animal.setIdAnimal(rs.getInt("idAnimal"));
                animal.setNome(rs.getString("nomeAnimal"));

                vacina.setAnimal(animal);

                lista.add(vacina);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
