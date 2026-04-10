package br.com.igor.biblioteca.domain;

public class UsuarioComum extends Usuario{

    public UsuarioComum(String nome) {
        super(nome);
    }

    @Override
    public int getLimiteLivros() {
        return 0;
    }
}
