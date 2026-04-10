package br.com.igor.biblioteca.teste;

import br.com.igor.biblioteca.domain.*;

public class SistemaBibliotecaTeste {
    public static void main(String[] args) {

        Autor autor = new Autor("Paulo Coelho");
        Livro livro = new Livro("O medo do abismo", autor, Categoria.HORROR, true);
        Livro[] livros = {livro};
        Usuario usuario = new UsuarioComum("Igor");
        Usuario usuario1 = new UsuarioComum("Cassandra");

        usuario.pegarLivro(livro);
        usuario.imprime();
        System.out.println();

        usuario.devolverLivro(livro);
        System.out.println();
        usuario.imprime();

        usuario1.pegarLivro(livro);
        System.out.println();
        usuario1.imprime();

    }
}
