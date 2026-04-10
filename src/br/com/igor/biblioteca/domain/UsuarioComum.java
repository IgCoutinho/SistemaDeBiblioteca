package br.com.igor.biblioteca.domain;

public class UsuarioComum extends Usuario{

    public UsuarioComum(String nome) {
        super(nome);
        this.setLivrosEmprestados(new Livro[this.getLimiteLivros()]);
    }

    @Override
    public int getLimiteLivros() {
        return 3;
    }
}
