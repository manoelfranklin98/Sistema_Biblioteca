package br.com.catolica.biblioteca.main;

import br.com.catolica.biblioteca.Model.Biblioteca;
import br.com.catolica.biblioteca.Model.Livro;
import br.com.catolica.biblioteca.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro(
                "O Menino do Pijama Listrado",
                "Franklin",
                3
        );

        System.out.println("BEM-VINDO AO SISTEMA BIBLIOTECÁRIO CATÓLICA PB!!!");

        Usuario usuario1 = new Usuario("FRANKLIN3");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro(livro1);

        biblioteca.emprestar(livro1, usuario1);
        usuario1.exibirInfo();
        livro1.exibirInfo();

        biblioteca.devolver(livro1, usuario1);
        usuario1.exibirInfo();
        livro1.exibirInfo();
    }
}
