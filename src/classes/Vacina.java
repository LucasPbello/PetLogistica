package classes;

import java.time.LocalDate;

/**
 *
 * @author bello
 */
public class Vacina {

    private int idVacina;
    private String microchip;
    private LocalDate microchipAplicacao;
    private String vacinaNome;
    private String lote;
    private String vacinaMarca;
    private LocalDate vacinaAplicacao;
    private LocalDate vacinaValidade;

    private byte[] carteirinha;
    private Animal animal;

    public Vacina() {
    }

    public void validar() {

        // Nome obrigatório
        if (vacinaNome == null || vacinaNome.isEmpty()) {
            throw new IllegalArgumentException("Nome da vacina é obrigatório.");
        }

        // Aplicação e validade juntas
        if (vacinaAplicacao != null && vacinaValidade == null) {
            throw new IllegalArgumentException("Se informar a aplicação, informe a validade.");
        }

        // Validade não pode ser antes da aplicação
        if (vacinaAplicacao != null && vacinaValidade != null) {
            if (vacinaValidade.isBefore(vacinaAplicacao)) {
                throw new IllegalArgumentException("Validade não pode ser antes da aplicação.");
            }
        }

        // Animal obrigatório
        if (animal == null) {
            throw new IllegalArgumentException("Vacina deve estar vinculada a um animal.");
        }
    }

    public int getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(int idVacina) {
        this.idVacina = idVacina;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public LocalDate getMicrochipAplicacao() {
        return microchipAplicacao;
    }

    public void setMicrochipAplicacao(LocalDate microchipAplicacao) {
        this.microchipAplicacao = microchipAplicacao;
    }

    public String getVacinaNome() {
        return vacinaNome;
    }

    public void setVacinaNome(String vacinaNome) {
        this.vacinaNome = vacinaNome;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getVacinaMarca() {
        return vacinaMarca;
    }

    public void setVacinaMarca(String vacinaMarca) {
        this.vacinaMarca = vacinaMarca;
    }

    public LocalDate getVacinaAplicacao() {
        return vacinaAplicacao;
    }

    public void setVacinaAplicacao(LocalDate vacinaAplicacao) {
        this.vacinaAplicacao = vacinaAplicacao;
    }

    public LocalDate getVacinaValidade() {
        return vacinaValidade;
    }

    public void setVacinaValidade(LocalDate vacinaValidade) {
        this.vacinaValidade = vacinaValidade;
    }

    public byte[] getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(byte[] carteirinha) {
        this.carteirinha = carteirinha;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return vacinaNome + " - " + vacinaMarca;
    }
}
