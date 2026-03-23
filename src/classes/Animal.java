package classes;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author bello
 */
public class Animal {

   private int idAnimal;
    private String nome;
    private String raca;
    private String cor;
    private BigDecimal peso;
    private BigDecimal tamanho;
    private String caixaTransporte;
    private Date dataNascimento;
    
    private byte[] documentos;
    private byte[] imagens;

    private Cliente cliente;
    private OrigemDestino origemDestino;

    private List<Vacinas> vacinas;

    public Animal() {}

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

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getTamanho() {
        return tamanho;
    }

    public void setTamanho(BigDecimal tamanho) {
        this.tamanho = tamanho;
    }

    public String getCaixaTransporte() {
        return caixaTransporte;
    }

    public void setCaixaTransporte(String caixaTransporte) {
        this.caixaTransporte = caixaTransporte;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public List<Vacinas> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<Vacinas> vacinas) {
        this.vacinas = vacinas;
    }

    
    
}
