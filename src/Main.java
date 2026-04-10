import br.com.igor.biblioteca.domain.Livro;
import br.com.igor.biblioteca.domain.Usuario;
import br.com.igor.biblioteca.domain.UsuarioComum;

import br.com.igor.biblioteca.domain.*;
import br.com.igor.biblioteca.service.BibliotecaService;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Machado de Assis");

        Livro livro1 = new Livro("Dom Casmurro", autor, Categoria.ROMANCE);
        Livro livro2 = new Livro("Memórias Póstumas", autor, Categoria.FICCAO);

        Usuario user = new UsuarioComum("Igor");
        Usuario user2 = new UsuarioPremium("Coutinho");

        System.out.println("=== CADASTRO ===");
        BibliotecaService.cadastrarLivro(livro1);
        BibliotecaService.cadastrarLivro(livro2);
        BibliotecaService.cadastrarUsuario(user);
        BibliotecaService.cadastrarUsuario(user2);

        System.out.println("\n=== EMPRÉSTIMO ===");
        BibliotecaService.emprestarLivro(user, livro1);

        System.out.println("\n=== TENTATIVA ERRADA ===");
        BibliotecaService.devolverLivro(user2, livro1); // deveria falhar

        System.out.println("\n=== DEVOLUÇÃO CORRETA ===");
        BibliotecaService.devolverLivro(user, livro1);

        System.out.println("\n=== ESTADO FINAL ===");
        BibliotecaService.listarLivros();
    }
}