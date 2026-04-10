package br.com.igor.biblioteca.domain;

public interface Emprestavel {

    void emprestar();
    void devolver();
    boolean isDisponivel(boolean isDisponivel);

}
