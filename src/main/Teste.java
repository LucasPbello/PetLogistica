package main;

import classes.Cliente;
import classes.Financeiro;
import classes.Taxi;
import dao.ClienteDAO;

/**
 *
 * @author bello
 */
public class Teste {

    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();

        Cliente c = new Cliente();
        c.setNome("João");
        c.setCpf("12345678900");
        c.setEmail("joao@email.com");

        Taxi t = new Taxi();
        t.setIdTaxi(1);

        Financeiro f = new Financeiro();
        f.setIdFinanceiro(1);

        c.setTaxi(t);
        c.setFinanceiro(f);

        dao.inserir(c);

        System.out.println("Cliente inserido!");
    }
}
