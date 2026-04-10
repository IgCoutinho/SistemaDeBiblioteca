package br.com.igor.biblioteca.domain;

public class Livro implements Emprestavel {

    private String titulo;
    private Autor autor;
    private Categoria categoria;
    private boolean isDisponivel;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.isDisponivel = true;
    }

    @Override
    public void emprestar() {
        isDisponivel(false);
    }

    @Override
    public void devolver() {
        isDisponivel(true);
    }

    @Override
    public void isDisponivel(boolean isDisponivel) {
        this.isDisponivel = isDisponivel;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
