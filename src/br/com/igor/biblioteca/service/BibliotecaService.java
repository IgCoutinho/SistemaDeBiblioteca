package br.com.igor.biblioteca.service;

import br.com.igor.biblioteca.domain.Livro;
import br.com.igor.biblioteca.domain.Usuario;

public class BibliotecaService {

    public static Livro[] livros = new Livro[0];
    public static Usuario[] usuarios = new Usuario[0];

    public static void cadastrarLivro(Livro livro) {
        Livro[] novo = new Livro[livros.length + 1];
        for (int i = 0; i < livros.length; i++) {
            novo[i] = livros[i];
        }
        novo[livros.length] = livro;
        livros = novo;
        System.out.println("Livro \"" + livro.getTitulo() + "\" adicionado com sucesso!");
    }

    public static void cadastrarUsuario(Usuario usuario){
        Usuario[] novosUsers = new Usuario[usuarios.length + 1];
        for (int i = 0; i <usuarios.length; i++) {
            novosUsers[i] = usuarios[i];
        }
        novosUsers[usuarios.length] = usuario;
        usuarios = novosUsers;
        System.out.println("Usuario \"" + usuario.getNome() + "\" adicionado com sucesso!");
    }


    public static void listarLivros(){
        System.out.println("== Livros Disponiveis ==");
        for (int i = 0; i < livros.length ; i++) {
            if (livros[i].isGetDisponivel()){
                System.out.println((i+1) + "- " + livros[i].getTitulo());
            }
        }
        System.out.println("== Livros Indisponiveis ==");
        for (int i = 0; i < livros.length ; i++) {
            if (!livros[i].isGetDisponivel()){
                System.out.println((i+1) + "- " + livros[i].getTitulo());
            }
        }
    }

    public static void emprestarLivro(Usuario usuario, Livro livro){
        usuario.pegarLivro(livro);
        livro.setUsuarioAtual(usuario);
    }

    public static void devolverLivro(Usuario usuario, Livro livro) {
        if (livro.getUsuarioAtual() == null) {
            System.out.println("O livro já está disponível.");
            return;
        }

        if (livro.getUsuarioAtual() == usuario) {
            usuario.devolverLivro(livro);
            livro.setUsuarioAtual(null);
        } else {
            System.out.println("Nao é possivel realizar essa acao, pois o livro nao pertence a essa conta!");
        }
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
