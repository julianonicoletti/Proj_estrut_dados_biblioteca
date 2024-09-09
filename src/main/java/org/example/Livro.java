package org.example;

import java.util.LinkedList;

public class Livro {
   private String titulo;
   private String autor;
   private boolean emprestado;
   private LinkedList<String> filaDeEspera;

   public Livro(String titulo, String autor) {
      this.titulo = titulo;
      this.autor = autor;
      this.emprestado = false;
      this.filaDeEspera = new LinkedList<>();
   }
   public String getTitulo() {
      return titulo;
   }
   public String getAutor(){
      return autor;
   }
   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public boolean verificaEmprestimo() {
      return emprestado;
   }

   public void emprestar(String nomeUsuario) {
      if(!emprestado) {
         emprestado = true;
         System.out.println(nomeUsuario + " Emprestou o livro: " + titulo);

         if (filaDeEspera.contains(nomeUsuario)) { //remove o usuário se ele estiver na fila de espera
            filaDeEspera.remove(nomeUsuario);
         }
      } else {
         filaDeEspera.add(nomeUsuario);
         System.out.println(nomeUsuario + " foi adicionado a fila de espera para o livro:  " + titulo);
      }
   }

   public void devolver() {
      if (emprestado) {
         emprestado = false;
         System.out.println("O Livro " + titulo + " foi devolvido.");
         if(!filaDeEspera.isEmpty()) { //mostra o próximo da lista de espera.
            String proximoUsuario = filaDeEspera.getFirst();
            System.out.println("O próximo usuário da fila de espera é: " + proximoUsuario);
         }
      } else {
         System.out.println("O livro já está disponível.");
      }
   }
}

