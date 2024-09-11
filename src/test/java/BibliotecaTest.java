import org.example.Biblioteca;
import org.example.Usuario;
import org.example.Livro;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class BibliotecaTest {
   private Biblioteca biblioteca;
   private Livro livro;
   private Usuario usuario;

   @Before
   public void setUp() {
      biblioteca = new Biblioteca();
      livro = new Livro("Java: Como Programar", "Paul Deitel");
      usuario = new Usuario("Usuario1");
      biblioteca.adicionarLivro(livro);
      biblioteca.adicionarUsuario(usuario);
   }

   @Test
   public void testeAdicionarLivro(){
      assertEquals(1, biblioteca.getCatalogoLivros().size());
      assertTrue(biblioteca.getCatalogoLivros().contains(livro));
   }

   @Test
   public void testeAdicionarUsuario(){
      assertEquals(1, biblioteca.getUsuarios().size());
      assertTrue(biblioteca.getUsuarios().contains(usuario));
   }

   @Test
   public void testeEmprestarLivro(){
      biblioteca.emprestarLivro("Java: Como Programar", "Usuario1");
      assertTrue(usuario.getLivrosEmprestados().contains(livro));
   }

   @Test
   public void testeDevolverLivro(){
      biblioteca.emprestarLivro("Java: Como Programar", "Usuario1");

      biblioteca.devolverLivro("Java: Como Programar", "Usuario1");
      assertFalse(usuario.getLivrosEmprestados().contains(livro));
      assertEquals(0, usuario.getLivrosEmprestados().size());
   }

}

