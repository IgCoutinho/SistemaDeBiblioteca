package br.com.igor.biblioteca.domain;

public class UsuarioPremium extends Usuario{

    public UsuarioPremium(String nome, Livro[] livrosEmprestados, int quatidadeLivros) {
        super(nome, livrosEmprestados, quatidadeLivros);
    }

    @Override
    public void getLimiteLivros() {

    }

}
