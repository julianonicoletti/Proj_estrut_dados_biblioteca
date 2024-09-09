package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
   private String nome;
   private List<Livro> livrosEmprestados;

   public Usuario(String nome) {
      this.nome = nome;
      this.livrosEmprestados = new ArrayList<>();
   }
   public String getNome() {
      return nome;
   }

   public void pegarLivro(Livro livro) {
      livrosEmprestados.add(livro);
   }

   public void devolverLivro(Livro livro) {
      livrosEmprestados.remove(livro);
   }
}


