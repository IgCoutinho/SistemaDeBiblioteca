package br.com.igor.biblioteca.teste;

import br.com.igor.biblioteca.domain.*;
import br.com.igor.biblioteca.service.BibliotecaService;

public class SistemaBibliotecaTeste {
    public static void main(String[] args) {

        Autor autor = new Autor("Frascisco Camoes");
        Livro livro = new Livro("A furia da noite", autor, Categoria.FICCAO);
        Usuario user = new UsuarioComum("Igor");
        Usuario user1 = new UsuarioPremium("Coutinho");

        System.out.println("\n== Teste Cadastro Livro ==");
        BibliotecaService.cadastrarLivro(livro);
        System.out.println("\n== Teste Cadastro User ==");
        BibliotecaService.cadastrarUsuario(user);

        System.out.println("\n== Teste Emprestimo Livro ==");
        BibliotecaService.emprestarLivro(user,livro);
        System.out.println("\n== Teste Listar Livro ==");
        BibliotecaService.listarLivros();

        System.out.println("\n== Teste Devolver Livro =="); // Sistema nega acao
        BibliotecaService.devolverLivro(user1, livro);

        System.out.println("\n== Teste Listar Livro ==");
        BibliotecaService.listarLivros();

        System.out.println("\n== Teste Status User ==");
        BibliotecaService.imprimeUsuario(user);

        System.out.println("\n== Teste Status User1 ==");
        BibliotecaService.imprimeUsuario(user1);

        System.out.println("\n== Teste Status Livro ==");
        BibliotecaService.imprimeLivro(livro);

    }
}
