import br.com.igor.biblioteca.domain.Livro;
import br.com.igor.biblioteca.domain.Usuario;
import br.com.igor.biblioteca.domain.UsuarioComum;

import br.com.igor.biblioteca.domain.*;
import br.com.igor.biblioteca.service.BibliotecaService;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Machado de Assis");
        Autor autor1 = new Autor("Myamoto");

        Livro livro1 = new Livro("Dom Casmurro", autor, Categoria.ROMANCE);
        Livro livro2 = new Livro("Memórias Póstumas", autor, Categoria.FICCAO);
        Livro livro3 = new Livro("Os Cinco Aneis", autor1, Categoria.HISTORIA);

        Usuario user = new UsuarioComum("Igor");
        Usuario user2 = new UsuarioPremium("Francisco");

        System.out.println("=== CADASTRO ===");
        BibliotecaService.cadastrarLivro(livro1);
        BibliotecaService.cadastrarLivro(livro2);
        BibliotecaService.cadastrarLivro(livro3);
        BibliotecaService.cadastrarUsuario(user);
        BibliotecaService.cadastrarUsuario(user2);

        System.out.println("\n=== EMPRÉSTIMO ===");
        BibliotecaService.emprestarLivro(user, livro1);
        BibliotecaService.emprestarLivro(user2, livro3);

        System.out.println("\n=== TENTATIVA ERRADA ===");
        BibliotecaService.devolverLivro(user2, livro1); // deve falhar

        System.out.println("\n=== DEVOLUÇÃO CORRETA ===");
        BibliotecaService.devolverLivro(user, livro1);

        System.out.println("\n=== ESTADO FINAL ===");
        BibliotecaService.listarLivros();
    }
}