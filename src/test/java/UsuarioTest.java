import org.example.Usuario;
import org.example.Livro;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class UsuarioTest {

   private Usuario usuario;
   private Livro livro;

   @Before
   public void setup(){
      usuario = new Usuario("Usuario 1");
      livro = new Livro("Rapido e Devagar", "Daniel Kanehmann");
   }

   @Test
   public void testePegarLivro(){
      usuario.pegarLivro(livro);
      assertEquals("Rapido e Devagar", livro.getTitulo());

   }

   @Test
   public void testeDevolverLivro(){
      usuario.pegarLivro(livro);

      assertEquals(1, usuario.getLivrosEmprestados().size());
      usuario.devolverLivro(livro);

      assertEquals(0, usuario.getLivrosEmprestados().size());

   }


}
