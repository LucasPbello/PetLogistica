package classes;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author bello
 */
public class Animal {

    private int idAnimal;
    private String nome;
    private String raca;
    private String cor;
    private double peso;
    private double tamanho;
    private int caixaTransporte;
    private LocalDate dataNascimento;
    private String microchip;

    private byte[] carteirinha;
    private byte[] documentos;
    private byte[] imagens;

    private Cliente cliente;
    private OrigemDestino origemDestino;

    public Animal() {
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getCaixaTransporte() {
        return caixaTransporte;
    }

    public void setCaixaTransporte(int caixaTransporte) {
        this.caixaTransporte = caixaTransporte;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public byte[] getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(byte[] carteirinha) {
        this.carteirinha = carteirinha;
    }

    public byte[] getDocumentos() {
        return documentos;
    }

    public void setDocumentos(byte[] documentos) {
        this.documentos = documentos;
    }

    public byte[] getImagens() {
        return imagens;
    }

    public void setImagens(byte[] imagens) {
        this.imagens = imagens;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public OrigemDestino getOrigemDestino() {
        return origemDestino;
    }

    public void setOrigemDestino(OrigemDestino origemDestino) {
        this.origemDestino = origemDestino;
    }

}
