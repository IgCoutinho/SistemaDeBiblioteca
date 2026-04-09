package br.com.igor.biblioteca.domain;

public class Livro implements Emprestavel {

    private String titulo;
    private Autor autor;
    private Categoria categoria;
    private boolean isDisponivel;

    @Override
    public void emprestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public boolean isDisponivel() {
        return false;
    }
}
