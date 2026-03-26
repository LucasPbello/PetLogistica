package classes;

/**
 *
 * @author bello
 */
public class OrigemDestino {

    private int idOrigemDestino;
    private String paisOrigem;
    private String paisDestino;
    private String enderecoPaisOrigem;
    private String enderecoPaisDestino;
    private String companhiaAerea;

    public OrigemDestino() {
    }

    public int getIdOrigemDestino() {
        return idOrigemDestino;
    }

    public void setIdOrigemDestino(int idOrigemDestino) {
        this.idOrigemDestino = idOrigemDestino;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getEnderecoPaisOrigem() {
        return enderecoPaisOrigem;
    }

    public void setEnderecoPaisOrigem(String enderecoPaisOrigem) {
        this.enderecoPaisOrigem = enderecoPaisOrigem;
    }

    public String getEnderecoPaisDestino() {
        return enderecoPaisDestino;
    }

    public void setEnderecoPaisDestino(String enderecoPaisDestino) {
        this.enderecoPaisDestino = enderecoPaisDestino;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    @Override
    public String toString() {
        return paisOrigem + " ? " + paisDestino;
    }
}
