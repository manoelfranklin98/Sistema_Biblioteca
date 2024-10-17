package br.com.catolica.biblioteca.Model;

public class Usuario {
    String nome;
    int livrosEmPosse;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmPosse = 0;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Livros em posse: " + livrosEmPosse);
    }
}

