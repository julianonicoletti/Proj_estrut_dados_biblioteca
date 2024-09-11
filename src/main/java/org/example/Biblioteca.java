package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
   private List<Livro> catalogoLivros;
   private List<Usuario> usuarios;
   private List<Emprestimo> emprestimos;

   public Biblioteca() {
      this.catalogoLivros = new ArrayList<>();
      this.usuarios = new ArrayList<>();
      this.emprestimos = new ArrayList<>();
   }

   public List<Livro> getCatalogoLivros() {
      return catalogoLivros;
   }

   public List<Usuario> getUsuarios() {
      return usuarios;
   }

   public void adicionarLivro(Livro livro) {
      catalogoLivros.add(livro);
      System.out.println("Livro adicionado: " + livro.getTitulo() + "\nAutor:" + livro.getAutor());
      System.out.println("*****************************************");
   }

   public void adicionarUsuario(Usuario usuario) {
      usuarios.add(usuario);
      System.out.println("Usuario adicionado: " + usuario.getNome());
      System.out.println("****************************************");
   }

    public Usuario buscarUsuarioPorNome(String nomeUsuario) {
      for (Usuario usuario : usuarios) {
         if (usuario.getNome().equalsIgnoreCase(nomeUsuario)) {
            return usuario;
         }
      }
      System.out.println("Usuario nao encontrado: " + nomeUsuario);
      return null;
   }

   public Livro buscaLivroPorTitulo(String tituloLivro) {
      for (Livro livro : catalogoLivros) {
         if (livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
            return livro;
         }
      }
      System.out.println("Livro não encontrado: " + tituloLivro);
      return null;
   }

   public void emprestarLivro(String tituloLivro, String nomeUsuario) {
      Livro livro = buscaLivroPorTitulo(tituloLivro);
      Usuario usuario = buscarUsuarioPorNome(nomeUsuario);
      if (livro != null && usuario !=null){
         livro.emprestar(nomeUsuario);
         usuario.pegarLivro(livro);
         Emprestimo emprestimo = new Emprestimo(livro, usuario);
         emprestimos.add(emprestimo);
      }
   }

   public void devolverLivro (String tituloLivro, String nomeUsuario) {
      Livro livro = buscaLivroPorTitulo(tituloLivro);
      Usuario usuario = buscarUsuarioPorNome(nomeUsuario);
      if (livro != null && usuario !=null){
         livro.devolver();
         usuario.devolverLivro(livro);
         emprestimos.removeIf(e -> e.getLivro().equals(livro) && e.getUsuario().equals(usuario));
      }
   }

   public void listarCatalogoCadastrado() {
      for (Livro livro : catalogoLivros) {
         System.out.println("Livro: " + livro.getTitulo() + "\nAutor: " + livro.getAutor());
         System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
      }
   }

   public void listarUsuariosCadastrado() {
      for (Usuario usuario : usuarios) {
         System.out.println("Nome: " + usuario.getNome());
         System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
      }
   }

   public void listarLivrosEmprestados() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum livro está emprestado no momento.");
        } else {
            for (Emprestimo emprestimo : emprestimos) {
                System.out.println(emprestimo);
            }
        }
   }
}
