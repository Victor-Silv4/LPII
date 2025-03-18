package atividade_1803;

public class Main {
    public static void main(String[] args) {
        Colecao c = new Colecao();
    
        c.adicionarLivro(new Livro(123, "Ariani Castelo", "Rocco", "O abismo de celina"));
        c.adicionarLivro(new Livro(234, "Rick Riordan", "Rocco", "Percy Jackson"));
        c.adicionarLivro(new Livro(123, "ariani Castelo", "Rocco", "O Abismo de celina"));
        c.imprimirLista();
        c.obterLivro(new Livro(123, "Ariani Castelo", "Rocco", "O abismo de celina"));
    }
    }

