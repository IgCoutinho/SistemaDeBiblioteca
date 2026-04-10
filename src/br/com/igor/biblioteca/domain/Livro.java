package br.com.igor.biblioteca.domain;

public class Livro implements Emprestavel {

    private String titulo;
    private Autor autor;
    private Categoria categoria;
    private boolean isDisponivel;

    public Livro(String titulo, Autor autor, Categoria categoria, boolean isDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.isDisponivel = isDisponivel;
    }

    @Override
    public void emprestar() {
    }

    @Override
    public void devolver() {
    }

    @Override
    public boolean isDisponivel(boolean isDisponivel) {
        this.isDisponivel = isDisponivel;
        return isDisponivel;
    }

    public void imprime(){
        System.out.println(this.titulo);
        System.out.println(this.categoria);
        System.out.println(this.autor.getNome());
        if (this.isDisponivel){
            System.out.println("Disponivel");
        } else{
            System.out.println("Indisponivel");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean isGetDisponivel() {
        return isDisponivel;
    }
}
