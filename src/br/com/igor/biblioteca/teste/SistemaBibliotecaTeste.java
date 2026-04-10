package br.com.igor.biblioteca.teste;

import br.com.igor.biblioteca.domain.*;

public class SistemaBibliotecaTeste {
    public static void main(String[] args) {

        Autor autor = new Autor("Paulo Coelho");
        Autor autor1 = new Autor("Musashi Myamoto");
        Livro livro = new Livro("O medo do abismo", autor, Categoria.HORROR);
        Livro livro1 = new Livro("Os cinco Aneis", autor1, Categoria.HISTORIA);
        Usuario usuario = new UsuarioComum("Igor");
        Usuario usuario1 = new UsuarioComum("Cassandra");

        System.out.println();
        usuario.pegarLivro(livro);
        System.out.println();
        usuario.pegarLivro(livro1);
        System.out.println();
        usuario.imprime();
        System.out.println();

        usuario1.pegarLivro(livro);
        System.out.println();
        usuario1.imprime();

    }
}
