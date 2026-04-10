package br.com.igor.biblioteca.domain;

public class UsuarioPremium extends Usuario{

    public UsuarioPremium(String nome, Livro[] livrosEmprestados) {
        super(nome, livrosEmprestados);
    }

    @Override
    public void getLimiteLivros() {

    }

}
