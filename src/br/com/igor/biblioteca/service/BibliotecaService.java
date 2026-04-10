package br.com.igor.biblioteca.service;

import br.com.igor.biblioteca.domain.Livro;
import br.com.igor.biblioteca.domain.Usuario;

public class BibliotecaService {

    public static void listarLivros(Livro[] livros){
        System.out.println("== Livros Disponiveis ==");
        for (int i = 0; i < livros.length ; i++) {
            if (livros[i].isGetDisponivel()){
                System.out.println((i+1) + "- " + livros[i].getTitulo());
            } else{
                return;
            }
        }
        System.out.println("== Livros Indisponiveis ==");
        for (int i = 0; i < livros.length ; i++) {
            if (!livros[i].isGetDisponivel()){
                System.out.println((i+1) + "- " + livros[i].getTitulo());
            } else{
                return;
            }
        }
    }

    public static void cadastrarLivro(Livro livro){
        System.out.println("Adicionando Livro...");
        System.out.println("Livro " + livro.getTitulo() + " adcionado com sucesso!");
    }

    public static void cadastrarUsuario(Usuario usuario){
        System.out.println("Adicionando Usuario...");
        System.out.println("Usuario " + usuario.getNome() + " adcionado com sucesso!");
    }

    public static void emprestarLivro(Usuario usuario, Livro livro){
        usuario.pegarLivro(livro);
    }

    public static void devolverLivro(Usuario usuario, Livro livro){
        usuario.devolverLivro(livro);
    }

    public static void imprimeUsuario(Usuario usuario){
        System.out.println("----------------------");
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("----------------------");
        if (usuario.getQuatidadeLivros() > 0) {
            System.out.println("-- SEUS LIVROS --");
            for (int i = 0; i < usuario.getQuatidadeLivros(); i++) {
                System.out.println((i+1) + "- " + usuario.getLivrosEmprestados()[i].getTitulo());
            }
        } else {
            System.out.println("-- SEUS LIVROS --");
            System.out.println("Nao há livros cadastrados");
        }
        System.out.println("----------------------");
        System.out.println("Quatidade de livros: " + usuario.getQuatidadeLivros());
        System.out.println("----------------------");
    }

    public static void imprimeLivro(Livro livro){
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Categoria: " + livro.getCategoria());
        System.out.println("Autor" + livro.getAutor().getNome());
        if (livro.isGetDisponivel()){
            System.out.println("Situacao: Disponivel");
        } else{
            System.out.println("Situacao: Indisponivel");
        }
    }

}
