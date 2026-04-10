package br.com.igor.biblioteca.domain;

public class UsuarioComum extends Usuario{

    public UsuarioComum(String nome, Livro[] livrosEmprestados) {
        super(nome, livrosEmprestados);
    }

    @Override
    public void getLimiteLivros() {

    }
}
