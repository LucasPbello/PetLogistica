package classes;

import java.util.Date;

/**
 *
 * @author bello
 */
public class Vacinas {

    private int idVacinas;
    private String microchip;
    private String vacinaNome;
    private String vacinaMarca;
    private Date vacinaAplicacao;
    private Date vacinaValidade;
    private byte[] carteirinha;

    private Animal animal;

    public Vacinas() {
    }

    public int getIdVacinas() {
        return idVacinas;
    }

    public void setIdVacinas(int idVacinas) {
        this.idVacinas = idVacinas;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
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

}
