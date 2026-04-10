package br.com.igor.biblioteca.domain;

public class UsuarioPremium extends Usuario{

    public UsuarioPremium(String nome) {
        super(nome);
        this.setLivrosEmprestados(new Livro[7]);
    }

    @Override
    public void getLimiteLivros() {
    }

}
