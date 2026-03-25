
package permissoes;


public class Permissao {

    private boolean animal;
    private boolean cliente;
    private boolean endereco;
    private boolean financeiro;
    private boolean origem;
    private boolean taxi;
    private boolean vacina;

    public Permissao(boolean animal, boolean cliente, boolean endereco,
                     boolean financeiro, boolean origem, boolean taxi, boolean vacina) {

        this.animal = animal;
        this.cliente = cliente;
        this.endereco = endereco;
        this.financeiro = financeiro;
        this.origem = origem;
        this.taxi = taxi;
        this.vacina = vacina;
    }

    public boolean podeAnimal() { return animal; }
    public boolean podeCliente() { return cliente; }
    public boolean podeEndereco() { return endereco; }
    public boolean podeFinanceiro() { return financeiro; }
    public boolean podeOrigem() { return origem; }
    public boolean podeTaxi() { return taxi; }
    public boolean podeVacina() { return vacina; }
}