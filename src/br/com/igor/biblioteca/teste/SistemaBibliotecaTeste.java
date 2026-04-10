package br.com.igor.biblioteca.teste;

import br.com.igor.biblioteca.domain.Autor;
import br.com.igor.biblioteca.domain.Categoria;
import br.com.igor.biblioteca.domain.Livro;

public class SistemaBibliotecaTeste {
    public static void main(String[] args) {

        Autor autor = new Autor("Paulo Coelho");
        Livro livro = new Livro("O medo do abismo", autor, Categoria.HORROR, true);

        livro.imprime();

    }
}
