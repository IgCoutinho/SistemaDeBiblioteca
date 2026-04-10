package br.com.igor.biblioteca.domain;

public abstract class Usuario {

    private String nome;
    private Livro[] livrosEmprestados = new Livro[0];
    private int quantidadeLivros;

    public Usuario(String nome) {
        this.nome = nome;

    }

    public abstract int getLimiteLivros();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public int getQuatidadeLivros() {
        return quantidadeLivros;
    }

    public void setLivrosEmprestados(Livro[] livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }
}
