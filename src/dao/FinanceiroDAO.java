
package dao;

import classes.Cliente;
import classes.Financeiro;
import conexao.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FinanceiroDAO {

    // INSERT
    public void inserir(Financeiro financeiro) {
        String sql = "INSERT INTO Financeiro (clienteTotal, clienteSinal, gastoEmpresa, pagamentoFuncionarios,  idCliente) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setBigDecimal(1, financeiro.getClienteTotal());
            stmt.setBigDecimal(2, financeiro.getClienteSinal());
            stmt.setBigDecimal(3, financeiro.getGastoEmpresa());
            stmt.setBigDecimal(4, financeiro.getPagamentoFuncionarios());
           
            stmt.setInt(5, financeiro.getCliente().getIdCliente());

            stmt.executeUpdate();
            System.out.println("Financeiro inserido!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Financeiro: " + e.getMessage());
        }
    }

    // UPDATE
    public void atualizar(Financeiro financeiro) {
        String sql = "UPDATE Financeiro SET clienteTotal=?, clienteSinal=?, gastoEmpresa=?, pagamentoFuncionarios=?, idCliente=? WHERE idFinanceiro=?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setBigDecimal(1, financeiro.getClienteTotal());
            stmt.setBigDecimal(2, financeiro.getClienteSinal());
            stmt.setBigDecimal(3, financeiro.getGastoEmpresa());
            stmt.setBigDecimal(4, financeiro.getPagamentoFuncionarios());
            
            stmt.setInt(5, financeiro.getCliente().getIdCliente());
            stmt.setInt(6, financeiro.getIdFinanceiro());

            stmt.executeUpdate();
            System.out.println("Financeiro atualizado!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Financeiro: " + e.getMessage());
        }
    }

    // DELETE
    public void deletar(int idFinanceiro) {
        String sql = "DELETE FROM Financeiro WHERE idFinanceiro=?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idFinanceiro);
            stmt.executeUpdate();
            System.out.println("Financeiro deletado!");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar Financeiro: " + e.getMessage());
        }
    }

    // BUSCAR POR ID
    public Financeiro buscarPorId(int id) {
        String sql = "SELECT * FROM Financeiro WHERE idFinanceiro=?";
        Financeiro financeiro = null;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                financeiro = new Financeiro();

                financeiro.setIdFinanceiro(rs.getInt("idFinanceiro"));
                financeiro.setClienteTotal(rs.getBigDecimal("clienteTotal"));
                financeiro.setClienteSinal(rs.getBigDecimal("clienteSinal"));
                financeiro.setGastoEmpresa(rs.getBigDecimal("gastoEmpresa"));
                financeiro.setPagamentoFuncionarios(rs.getBigDecimal("pagamentoFuncionarios"));
                
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                financeiro.setCliente(c);
                
                financeiro.setLucroTotal(financeiro.calcularLucro());
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar Financeiro: " + e.getMessage());
        }

        return financeiro;
    }

    // LISTAR TODOS
    public List<Financeiro> listar() {
        String sql = "SELECT * FROM Financeiro";
        List<Financeiro> lista = new ArrayList<>();

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Financeiro financeiro = new Financeiro();

                financeiro.setIdFinanceiro(rs.getInt("idFinanceiro"));
                financeiro.setClienteTotal(rs.getBigDecimal("clienteTotal"));
                financeiro.setClienteSinal(rs.getBigDecimal("clienteSinal"));
                financeiro.setGastoEmpresa(rs.getBigDecimal("gastoEmpresa"));
                financeiro.setPagamentoFuncionarios(rs.getBigDecimal("pagamentoFuncionarios"));
                
                
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                financeiro.setCliente(c);
                
                financeiro.setLucroTotal(financeiro.calcularLucro());

                lista.add(financeiro);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar Financeiro: " + e.getMessage());
        }

        return lista;
    }
}
