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
}