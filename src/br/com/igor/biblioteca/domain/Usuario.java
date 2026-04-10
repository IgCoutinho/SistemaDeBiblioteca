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
        return quantidadeLivros;
    }

    public void setLivrosEmprestados(Livro[] livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
