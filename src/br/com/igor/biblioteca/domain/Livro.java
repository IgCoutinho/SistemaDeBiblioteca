package br.com.igor.biblioteca.domain;

public class Livro implements Emprestavel {

    private String titulo;
    private Autor autor;
    private Categoria categoria;
    private Usuario usuarioAtual;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
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

    public Usuario getUsuarioAtual() {
        return usuarioAtual;
    }

    public void setUsuarioAtual(Usuario usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }

}
