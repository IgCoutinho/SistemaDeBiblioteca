package br.com.igor.biblioteca.domain;

public abstract class Usuario {

    private String nome;
    private Livro[] livrosEmprestados;
    private int quatidadeLivros;

    public abstract void getLimiteLivros();

    public void pegarLivro(){
    }

    public void devolverLivro(){
    }

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
        return quatidadeLivros;
    }
}
