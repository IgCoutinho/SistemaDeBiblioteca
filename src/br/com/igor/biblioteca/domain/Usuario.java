package br.com.igor.biblioteca.domain;

public abstract class Usuario {

    private String nome;
    private Livro[] livrosEmprestados;
    private int quatidadeLivros;

    public Usuario(String nome, Livro[] livrosEmprestados, int quatidadeLivros) {
        this.nome = nome;
        this.livrosEmprestados = livrosEmprestados;
        this.quatidadeLivros = quatidadeLivros;
    }

    public abstract void getLimiteLivros();

    public void pegarLivro(Livro[] livrosEmprestados){
        for (int i = 0; i < livrosEmprestados.length ; i++) {
            this.livrosEmprestados[i] = livrosEmprestados[i];
            livrosEmprestados[i].isDisponivel(false);
        }
    }

    public void devolverLivro(){
        for (int i = 0; i < livrosEmprestados.length ; i++) {
            this.livrosEmprestados[i] = livrosEmprestados[i];
        }
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
