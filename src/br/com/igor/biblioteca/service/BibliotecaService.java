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
        for (Livro livro : livros) {
            if (livro.isGetDisponivel()) {
                System.out.println("- " + livro.getTitulo());
            }
        }
        System.out.println("== Livros Indisponiveis ==");
        for (Livro livro : livros) {
            if (!livro.isGetDisponivel()) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }

    public static void listarUsers(){
        System.out.println("== Usuarios Cadastrados ==");
        for (Usuario usuario : usuarios) {
            System.out.println("- " + usuario.getNome());
        }
    }

    public static void emprestarLivro(Usuario usuario, Livro livro){
        pegarLivro(usuario, livro);
    }

    public static void pegarLivro(Usuario usuario, Livro livro){
        if (usuario.getLimiteLivros() > usuario.getQuatidadeLivros()) {
            if (livro.isGetDisponivel()) {
                usuario.getLivrosEmprestados()[usuario.getQuatidadeLivros()] = livro;
                livro.emprestar(usuario);
                usuario.setQuantidadeLivros(usuario.getQuatidadeLivros()+1);
                System.out.println("Adicionando livro \"" + livro.getTitulo() + "\" na conta " + usuario.getNome() + " ...");
                System.out.println("Livro adicionado");
            } else {
                System.out.println("O livro nao esta disponivel");
            }
        } else {
            System.out.println("Nao é possivel adicionar livros");
        }
    }

    public static void devolverLivro(Usuario usuario, Livro livro) {
        if (livro.getUsuarioAtual() == null) {
            System.out.println("O livro já está disponível.");
        }
        if (livro.getUsuarioAtual() == usuario) {
            BibliotecaService.userDevolveLivro(usuario, livro);
            livro.setUsuarioAtual(null);
        } else {
            System.out.println("Nao é possivel realizar essa acao, pois o livro pertence a outra conta!");
        }
    }

    public static void userDevolveLivro(Usuario usuario, Livro livro){
        if (!livro.isGetDisponivel() ){
            usuario.setLivrosEmprestados(usuario.getLivrosEmprestados());
            livro.devolver(usuario);
            usuario.setQuantidadeLivros(usuario.getQuatidadeLivros()-1);
            System.out.println("Devolvendo livro...");
            System.out.println("Livro devolvido");
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
