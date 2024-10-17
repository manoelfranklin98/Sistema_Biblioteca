package br.com.catolica.biblioteca.Model;

public class Livro {
    String titulo;
    String autor;
    int quantidadeEmEstoque;

    public Livro(String titulo, String autor, int quantidadeEmEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}

