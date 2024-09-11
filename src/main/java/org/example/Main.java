package org.example;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Biblioteca biblioteca = new Biblioteca();
      int escolha = -1;

      biblioteca.adicionarUsuario(new Usuario("Juliano"));
      biblioteca.adicionarUsuario(new Usuario("Cinthia"));

      biblioteca.adicionarLivro(new Livro ("O Senhor dos Anéis", "J.R.R. Tolkien"));
      biblioteca.adicionarLivro(new Livro ("1984", "George Orwell"));


      Scanner entrada = new Scanner(System.in);

      while(escolha != 0) {
         System.out.println("--------------------------------------------");
         System.out.println("-------MENU BIBLIOTECA - VER. 1.02----------");
         System.out.println("******** ESCOLHA UMA OPÇÃO ABAIXO: *********");
         System.out.println("""
                                1. Cadastrar Livro.\
               
                                2. Cadastrar Usuário.\
               
                                3. Emprestar Livro \
               
                                4. Devolver Livro.\
               
                                5. Listar Livros Disponíveis.\
                                
                                6. Listar Usuários Cadastrados. \
                                
                                7. Listar Livros Emprestados. \
               
                                0. Sair""");
         System.out.println("********************************************");
         System.out.print(     "Digite sua Escolha: ");
         escolha = entrada.nextInt();
         entrada.nextLine();

         switch (escolha) {
            case 1:
               System.out.println("Digite o título do livro");
               String titulo = entrada.nextLine();
               System.out.println("Digite o autor do livro");
               String autor = entrada.nextLine();
               biblioteca.adicionarLivro(new Livro(titulo, autor));
               break;

            case 2:
               System.out.println("Digite o nome do Usuário: ");
               String nome = entrada.nextLine();
               biblioteca.adicionarUsuario(new Usuario(nome));
               break;

            case 3:
               System.out.println("Digite o nome do Livro para empréstimo: ");
               String tituloEmprestimo = entrada.nextLine();
               System.out.println("Digite o nome do Usuário: ");
               String nomeEmprestimo = entrada.nextLine();
               biblioteca.emprestarLivro(tituloEmprestimo, nomeEmprestimo);
               break;

            case 4:
               System.out.println("Digite o nome do Livro para devolução: ");
               String tituloDevolucao = entrada.nextLine();
               System.out.println("Digite o nome do Usuário: ");
               String nomeDevolucao = entrada.nextLine();
               biblioteca.devolverLivro(tituloDevolucao, nomeDevolucao);
               break;

            case 5:
               System.out.println("************* LIVROS CADASTRADOS *****************");
               biblioteca.listarCatalogoCadastrado();
               System.out.println();
               System.out.println("Pressione Enter para continuar!");
               entrada.nextLine();
               break;

            case 6:
               System.out.println("************* USUARIOS CADASTRADOS ****************");
               biblioteca.listarUsuariosCadastrado();
               System.out.println();
               System.out.println("Pressione Enter para continuar!");
               entrada.nextLine();

            case 7:
               System.out.println("************* LIVROS EMPRESTADOS ****************");
               biblioteca.listarLivrosEmprestados();
               System.out.println();
               System.out.println("Pressione Enter para continuar!");
               entrada.nextLine();
         }
      }
   }
}