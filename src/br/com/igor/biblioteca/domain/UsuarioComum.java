package br.com.igor.biblioteca.domain;

public class UsuarioComum extends Usuario{

    public UsuarioComum(String nome, Livro[] livrosEmprestados, int quatidadeLivros) {
        super(nome, livrosEmprestados, quatidadeLivros);
    }

    @Override
    public void getLimiteLivros() {

    }
}
