
package classes;


public class Usuario {
    
   
    private String login;
    private String senha;
    private String tipo; // 1=admin, 2=operador, 3=usuario

    public Usuario(String login, String senha, String tipo) {
        
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

   public Usuario(String login, String tipo) {
        this.login = login;
        this.tipo = tipo;
   }

    public Usuario() {
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   
}
