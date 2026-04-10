package br.com.igor.biblioteca.domain;

public abstract class Usuario {

    private String nome;
    private Livro[] livrosEmprestados = {};
    private int quatidadeLivros;

    public Usuario(String nome, Livro[] livrosEmprestados) {
        this.nome = nome;
        this.livrosEmprestados = livrosEmprestados;
    }

    public abstract void getLimiteLivros();

    public void pegarLivro(Livro[] livros){
        for (int i = 0; i < livros.length ; i++) {
            if (livros[i].isDisponivel(true)){
                this.livrosEmprestados[i] = livros[i];
                livros[i].isDisponivel(false);
            }
            System.out.println("O livro nao esta disponivel");
        }
    }

    public void devolverLivro(Livro[] livros){
        for (int i = 0; i < livros.length ; i++) {
            livros[i] = this.livrosEmprestados[i];
            livros[i].isDisponivel(true);
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

    public void imprime(){
        System.out.println("----------------------");
        System.out.println("Usuario: " + this.nome);
        System.out.println("----------------------");
        for (Livro livros : livrosEmprestados) {
            System.out.println("-- SEUS LIVROS --");
            System.out.println("- " + livros.getTitulo());
        }
        System.out.println("----------------------");
        System.out.println("Limite disponivel: " + this.quatidadeLivros);
    }
}
