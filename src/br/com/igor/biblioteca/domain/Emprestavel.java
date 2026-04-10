package br.com.igor.biblioteca.domain;

public interface Emprestavel {

    void emprestar();
    void devolver();

    default void isDisponivel(boolean isDisponivel) {
    }

}
