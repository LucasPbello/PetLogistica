package classes;

import java.time.LocalDate;

/**
 *
 * @author bello
 */
public class Vacina {

    private int idVacina;
    private String vacinaNome;
    private String vacinaMarca;
    private LocalDate vacinaAplicacao;
    private LocalDate vacinaValidade;
    private Animal animal;

    public Vacina() {
    }

    public void validar() {
        if (vacinaAplicacao != null && vacinaValidade == null) {
            throw new IllegalArgumentException("Se a data de aplicação for informada, a validade também é obrigatória.");
        }
    }

    public int getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(int idVacina) {
        this.idVacina = idVacina;
    }

    public String getVacinaNome() {
        return vacinaNome;
    }

    public void setVacinaNome(String vacinaNome) {
        this.vacinaNome = vacinaNome;
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

}
