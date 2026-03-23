
package main;

/**
 *
 * @author bello
 */
import classes.Cliente;
import conexao.Conexao;
import dao.ClienteDAO;
import java.sql.Connection;

public class TesteDAO {
    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();

        // ? Criar cliente
        Cliente c = new Cliente();
        c.setNome("Lucas");
        c.setCpf("12345678900");
        c.setTelefone("11999999999");
        c.setEmail("lucas@email.com");

        dao.inserir(c);

        // ? Listar
        for (Cliente cli : dao.listar()) {
            System.out.println(cli.getNome());
        }
    }
}