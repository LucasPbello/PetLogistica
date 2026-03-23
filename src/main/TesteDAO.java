package main;

/**
 *
 * @author bello
 */
import classes.*;
import dao.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TesteDAO {

    public static void main(String[] args) {

        // ? TESTE CLIENTE
        Cliente cliente = new Cliente();
        cliente.setNome("Lucas");
        cliente.setCpf("12345678901");
        cliente.setEmail("lucas@email.com");
        cliente.setTelefone("11999999999");

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserir(cliente);

        // ? TESTE ORIGEM DESTINO
        OrigemDestino od = new OrigemDestino();
        od.setPaisOrigem("Brasil");
        od.setPaisDestino("Portugal");
        od.setEnderecoPaisOrigem("São Paulo");
        od.setEnderecoPaisDestino("Lisboa");
        od.setCompanhiaAerea("LATAM");

        OrigemDestinoDAO odDAO = new OrigemDestinoDAO();
        odDAO.inserir(od);

        // ? TESTE ANIMAL
        Animal animal = new Animal();
        animal.setNome("Rex");
        animal.setRaca("Labrador");
        animal.setCor("Preto");
        animal.setPeso(25.5);
        animal.setTamanho(60.0);
        animal.setCaixaTransporte("Grande");
        animal.setDataNascimento(LocalDate.of(2020, 5, 10));
        animal.setMicrochip("ABC123");

        // relacionamento
        cliente.setIdCliente(1);
        od.setIdOrigemDestino(1);

        animal.setCliente(cliente);
        animal.setOrigemDestino(od);

        AnimalDAO animalDAO = new AnimalDAO();
        animalDAO.inserir(animal);

        // ? TESTE VACINA
        Vacina vacina = new Vacina();
        vacina.setVacinaNome("Antirrábica");
        vacina.setVacinaMarca("Pfizer");
        vacina.setVacinaAplicacao(LocalDate.now());
        vacina.setVacinaValidade(LocalDate.now().plusYears(1));

        animal.setIdAnimal(1);
        vacina.setAnimal(animal);

        VacinaDAO vacinaDAO = new VacinaDAO();
        vacinaDAO.inserir(vacina);

        // ? TESTE FINANCEIRO
        Financeiro financeiro = new Financeiro();
        financeiro.setClienteTotal(new BigDecimal("1500.00"));
        financeiro.setClienteSinal(new BigDecimal("500.00"));
        financeiro.setGastoEmpresa(new BigDecimal("300.00"));
        financeiro.setPagamentoFuncionarios(new BigDecimal("400.00"));

        financeiro.setCliente(cliente);

        FinanceiroDAO financeiroDAO = new FinanceiroDAO();
        financeiroDAO.inserir(financeiro);

        System.out.println("? TESTES FINALIZADOS!");
    }
}
