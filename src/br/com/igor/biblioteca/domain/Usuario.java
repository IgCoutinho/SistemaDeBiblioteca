package br.com.igor.biblioteca.domain;

public abstract class Usuario {

    private String nome;
    private Livro[] livrosEmprestados = new Livro[0];
    private int quantidadeLivros;

    public Usuario(String nome) {
        this.nome = nome;

    }

    public abstract void getLimiteLivros();

    public void pegarLivro(Livro livro){
            if (livrosEmprestados.length > quantidadeLivros) {
                if (livro.isGetDisponivel()) {
                    this.livrosEmprestados[quantidadeLivros] = livro;
                    livro.emprestar();
                    this.quantidadeLivros += 1;
                    System.out.println("Adicionando livro \"" + livro.getTitulo() + "\" na conta " + getNome() + " ...");
                    System.out.println("Livro adicionado");
                } else {
                    System.out.println("O livro nao esta disponivel");
                }
            } else {
                System.out.println("Nao é possivel adicionar livros");
            }
    }

    public void devolverLivro(Livro livro){
        if (!livro.isGetDisponivel()){
            this.livrosEmprestados = new Livro[]{};
            livro.devolver();
            this.quantidadeLivros -= 1;
            System.out.println("Devolvendo livro...");
            System.out.println("Livro devolvido");
        } else {
            System.out.println("O livro nao esta disponivel");
        }
    }

    public void imprime(){
        System.out.println("----------------------");
        System.out.println("Usuario: " + this.nome);
        System.out.println("----------------------");
        if (this.quantidadeLivros > 0) {
            System.out.println("-- SEUS LIVROS --");
            for (int i = 0; i < quantidadeLivros; i++) {
                System.out.println((i+1) + "- " + livrosEmprestados[i].getTitulo());
            }
        } else {
            System.out.println("-- SEUS LIVROS --");
            System.out.println("Nao há livros cadastrados");
        }
        System.out.println("----------------------");
        System.out.println("Quatidade de livros: " + this.quantidadeLivros);
        System.out.println("----------------------");
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
        return quantidadeLivros;
    }

    public void setLivrosEmprestados(Livro[] livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
