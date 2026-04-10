package br.com.igor.biblioteca.teste;

import br.com.igor.biblioteca.domain.*;
import br.com.igor.biblioteca.service.BibliotecaService;

public class SistemaBibliotecaTeste {
    public static void main(String[] args) {

        Autor autor = new Autor("Frascisco Camoes");
        Livro livro = new Livro("A furia da noite", autor, Categoria.FICCAO);
        Usuario user = new UsuarioComum("Igor");
        Usuario user1 = new UsuarioPremium("Coutinho");

        BibliotecaService.cadastrarLivro(livro);
        BibliotecaService.cadastrarUsuario(user);
        BibliotecaService.emprestarLivro(user,livro);
        BibliotecaService.listarLivros();
        System.out.println();
        BibliotecaService.devolverLivro(user1, livro);
        BibliotecaService.listarLivros();

    }
}
