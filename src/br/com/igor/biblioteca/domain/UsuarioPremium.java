package br.com.igor.biblioteca.domain;

public class UsuarioPremium extends Usuario{

    public UsuarioPremium(String nome) {
        super(nome);
        this.setLivrosEmprestados(new Livro[this.getLimiteLivros()]);
    }

    @Override
    public int getLimiteLivros() {
        return 5;
    }

}
