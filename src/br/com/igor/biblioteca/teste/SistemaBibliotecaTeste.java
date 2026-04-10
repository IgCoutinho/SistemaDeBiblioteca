package br.com.igor.biblioteca.teste;

import br.com.igor.biblioteca.domain.*;
import br.com.igor.biblioteca.service.BibliotecaService;

public class SistemaBibliotecaTeste {
    public static void main(String[] args) {

        Autor autor = new Autor("Frascisco Camoes");
        Livro livro = new Livro("Noite de Lua", autor, Categoria.FICCAO);
        Livro livro1 = new Livro("KungFu", autor, Categoria.FICCAO);
        Livro livro2 = new Livro("Salve a Patria", autor, Categoria.FICCAO);
        Livro livro3 = new Livro("Que a vida reine", autor, Categoria.FICCAO);
        Livro livro4 = new Livro("Brasil vs Inglaterra", autor, Categoria.FICCAO);
        Livro livro5 = new Livro("Feijao vs Arroz", autor, Categoria.FICCAO);
        Usuario user = new UsuarioComum("Igor");
        Usuario user1 = new UsuarioPremium("Francisco");

        System.out.println("\n== Teste Cadastro Livro ==");
        BibliotecaService.cadastrarLivro(livro);
        BibliotecaService.cadastrarLivro(livro1);
        BibliotecaService.cadastrarLivro(livro2);
        BibliotecaService.cadastrarLivro(livro3);
        BibliotecaService.cadastrarLivro(livro4);
        BibliotecaService.cadastrarLivro(livro5);
        System.out.println("\n== Teste Cadastro User ==");
        BibliotecaService.cadastrarUsuario(user);

        System.out.println("\n== Teste Emprestimo Livro ==");
        BibliotecaService.emprestarLivro(user,livro);
        BibliotecaService.emprestarLivro(user,livro1);
        BibliotecaService.emprestarLivro(user,livro2);
        BibliotecaService.emprestarLivro(user,livro3);
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
