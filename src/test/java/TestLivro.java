import org.example.Livro;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class TestLivro {

   private Livro livro;

   @Before
   public void setup(){
      livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
   }

   @Test
   public void testeEmprestarLivroDisponivel(){
      livro.emprestar("Usuário 1");
      assertTrue(livro.verificaEmprestimo());
   }

   @Test
   public void testeEmprestarLivroNaoDisponivel(){
      livro.emprestar("Usuario 1");

      livro.emprestar("Usuário 2");

      assertEquals(1, livro.getFilaDeEspera().size());
      assertEquals("Usuário 2", livro.getFilaDeEspera().get(0));
   }

   @Test
   public void testeDevolverLivro(){
      livro.emprestar("Usuario 2");
      livro.devolver();
      assertFalse(livro.verificaEmprestimo());
   }
}