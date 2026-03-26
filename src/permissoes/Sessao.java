package permissoes;

import classes.Usuario;

public class Sessao {

    private static Usuario usuarioLogado;

    public static Usuario getUsuario() {
        return usuarioLogado;
    }

    public static void setUsuario(Usuario usuario) {
        usuarioLogado = usuario;
    }
}

