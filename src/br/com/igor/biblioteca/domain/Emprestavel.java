package br.com.igor.biblioteca.domain;

public interface Emprestavel {

    void emprestar(Usuario user);
    void devolver(Usuario user);

    default void isDisponivel(boolean isDisponivel) {
    }

}
