package br.com.catolica.biblioteca.Model;

public class Biblioteca {
    Livro[] livros = new Livro[100];
    int totalLivros = 0;

    public void cadastrarLivro(Livro livro) {
        if (totalLivros < 100) {
            livros[totalLivros] = livro;
            totalLivros++;
        } else {
            System.out.println("Biblioteca cheia.");
        }
    }

    public void emprestar(Livro livro, Usuario usuario) {
        if (livro.quantidadeEmEstoque > 0 && usuario.livrosEmPosse < 5) {
            livro.quantidadeEmEstoque--;
            usuario.livrosEmPosse++;
            System.out.println("Empréstimo realizado.");
        } else {
            System.out.println("Empréstimo não pode ser realizado.");
        }
    }

    public void devolver(Livro livro, Usuario usuario) {
        livro.quantidadeEmEstoque++;
        usuario.livrosEmPosse--;
        System.out.println("Livro devolvido.");
    }
}
