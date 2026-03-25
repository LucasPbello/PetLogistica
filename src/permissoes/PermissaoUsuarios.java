
package permissoes;


    
 public class PermissaoUsuarios {

    public static Permissao getPermissao(String tipo) {

        switch (tipo) {

            case "Gerente":
                return new Permissao(true, true, true, true, true, true, true);

            case "Atendente":
                return new Permissao(true, true, true, false, true, true, true);

            case "Financeiro":
                return new Permissao(false, true, false, true, false, false, false);

            case "Transportador":
                return new Permissao(false, false, false, false, false, true, false);

            default:
                return new Permissao(false, false, false, false, false, false, false);
        }
    }
}
