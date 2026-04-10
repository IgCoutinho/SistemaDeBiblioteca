package br.com.igor.biblioteca.service;

import br.com.igor.biblioteca.domain.Livro;

public class BibliotecaService {

    public static void cadastrarLivro(Livro livro){
        System.out.println("== Adicionar Livro ==");
    }

    public static void listarLivros(Livro[] livros){
        System.out.println("== Livros Disponiveis ==");

    }

}
