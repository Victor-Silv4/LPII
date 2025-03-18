package atividade_1803;

import java.util.ArrayList;
import java.util.List;

public class Colecao {
    List <Livro> lista = new ArrayList<Livro>();

    public void adicionarLivro(Livro novoLivro) {
        if(lista.contains(novoLivro) == false) {
            lista.add(novoLivro);
            System.out.println("Livro adicionado");
            return;
        }

        System.out.println("O livro ja existe");
        }

    public void removerLivro(Livro livroRemovido) {
        lista.remove(livroRemovido);
    }

    public void imprimirLista() {
        for (Livro livros : lista) {
            imprimirLivro(livros);
        }
    }

    public void imprimirLivro(Livro livro) {
        System.out.println(livro.isbn);
        System.out.println(livro.autor);
        System.out.println(livro.editora);
        System.out.println(livro.titulo);
    }

    public void obterLivro(Livro livro) {
         for(Livro livros : lista) {
            if(livro.titulo == livros.titulo) {
                System.out.println("Livro parecido: ");
                imprimirLivro(livro);

                
            }
         }
    }

    public void verificarListaVazia() {
        if(lista.isEmpty() == true) {
            System.out.println("Lista vazia");
            return;
        }
        System.out.println("A lista possui elementos");
    }
}
