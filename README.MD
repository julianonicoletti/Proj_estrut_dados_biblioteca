# 📚 Biblioteca - Sistema de Gerenciamento

Este projeto é um aplicativo simples de gerenciamento de uma biblioteca, desenvolvido em **Java** com o uso do **Maven**
para gerenciamento de dependências e **JUnit** para testes automatizados.

![Biblioteca](https://png.pngtree.com/thumb_back/fh260/background/20230425/pngtree-an-old-library-has-wooden-step-leading-to-stairs-image_2513238.jpg)

---



## ⚙️ Tecnologias Utilizadas
- **Java** <img src="https://img.icons8.com/color/48/000000/java-coffee-cup-logo.png" width="32" height="32"/>
- **Maven** <img src="https://e7.pngegg.com/pngimages/917/651/png-clipart-apache-maven-feathers-tech-companies.png" width="32" height="32"/>
- **JUnit** <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyLYyQGHd9YZRqtiZsBXpsr51mf_35fQ7-9A&s" width="32" height="32"/>

---

## 📁 Estrutura do Projeto

O projeto está organizado da seguinte forma:

```bash
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               ├── Biblioteca.java
│   │               ├── Livro.java
│   │               ├── Main.java
│   │               ├── Usuario.java
│   │               └── Emprestimo.java    
│   └── test
│       └── java
│           └── com
│               └── example
│                   ├── BibliotecaTest.java
│                   ├── LivroTest.java
│                   ├── UsuarioTest.java
│                   └── EmprestimoTest.java  # Testes para a classe Emprestimo
├── pom.xml
└── README.md


```
---

## 🚀Funcionalidades

- Adicionar livros e usuários: Permite adicionar novos livros e usuários ao sistema.
- Emprestar e devolver livros: Usuários podem emprestar e devolver livros da biblioteca.
- Gerenciamento de fila de espera: Caso o livro esteja emprestado, o usuário é adicionado à fila de espera.
- Listar livros e usuários: Exibe o catálogo de livros e os usuários cadastrados.
---

## 📦 Como Executar o Projeto
### 1. Clonar o repositório
```bash
git clone https://github.com/seuusuario/biblioteca.git
cd biblioteca
```
### 2. Instalar as dependências
Este projeto usa Maven para gerenciar dependências. Execute o seguinte comando para baixar todas as dependências:

```bash
mvn clean install
```
### 3. Executar o projeto

Após a instalação das dependências, você pode rodar o projeto com:

```bash
mvn exec:java -Dexec.mainClass="com.example.Main"
```
### 4. Executar os testes

Este projeto usa JUnit para testes unitários. Para rodar os testes, use o comando:

```bash
mvn test
```
---
## 🛠️ Dependências

Certifique-se de que seu arquivo pom.xml contém as seguintes dependências:

```xml
Copiar código
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
---
## 📖 Contribuição
1. Faça um fork do projeto.
2. Crie uma branch (git checkout -b feature/nova-funcionalidade).
3. Commit suas mudanças (git commit -am 'Adiciona nova funcionalidade').
4. Faça o push para a branch (git push origin feature/nova-funcionalidade).
5. Crie um Pull Request.
---
## 📝 Licença
Este projeto é distribuído sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.


