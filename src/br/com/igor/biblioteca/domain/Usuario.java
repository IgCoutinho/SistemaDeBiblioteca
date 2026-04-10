package br.com.igor.biblioteca.domain;

public abstract class Usuario {

    private String nome;
    private Livro[] livrosEmprestados = new Livro[1];
    private int quatidadeLivros;

    public Usuario(String nome) {
        this.nome = nome;

    }

    public abstract void getLimiteLivros();

    public void pegarLivro(Livro[] livros){
        for (int i = 0; i < livros.length ; i++) {
            if (livros[i].isGetDisponivel()){
                this.livrosEmprestados[i] = livros[i];
                livros[i].isDisponivel(false);
                this.quatidadeLivros += 1;
            } else {
                System.out.println("O livro nao esta disponivel");
            }
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
        if (livrosEmprestados != null){
            System.out.println("-- SEUS LIVROS --");
            for (Livro livros : livrosEmprestados) {
                System.out.println("- " + livros.getTitulo());
            }
        } else{
            System.out.println("-- SEUS LIVROS --");
            System.out.println("Nao há livros cadastrados");
        }
        System.out.println("----------------------");
        System.out.println("Quatidade de livros: " + this.quatidadeLivros);
        System.out.println("----------------------");
    }
}
