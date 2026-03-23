package classes;

import java.util.Date;

/**
 *
 * @author bello
 */
public class Vacina {

    private int idVacina;
    private String vacinaNome;
    private String vacinaMarca;
    private Date vacinaAplicacao;
    private Date vacinaValidade;
    private Animal animal;


    public Vacina() {
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

    public Date getVacinaAplicacao() {
        return vacinaAplicacao;
    }

    public void setVacinaAplicacao(Date vacinaAplicacao) {
        this.vacinaAplicacao = vacinaAplicacao;
    }

    public Date getVacinaValidade() {
        return vacinaValidade;
    }

    public void setVacinaValidade(Date vacinaValidade) {
        this.vacinaValidade = vacinaValidade;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }




}
