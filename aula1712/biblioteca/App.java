package aula1712.biblioteca;

public class App {
    public static void main(String[] args) {
        Publicacao livro = new Livro("Percy Jackson", "Rick Riordan", "Aventura/Fantasia", "Editora X", 2005, 10, "edição x", "123456-888");

        Publicacao filme = new Filme("Coraline", "Neil Gaiman", "Mistério", "Editora Y", 2015, 5, "Henry Selick", "Dakota Fanning", "Uma menina descobre um mundo paralelo", "1h 40min");

        Publicacao[] publicacoes = new Publicacao[2];

        //Isso é possível porque Livro e Filme herdam da classe Publicacao. Em Java, uma variável do tipo da classe "mãe" pode referenciar objetos das classes "filhas"
        publicacoes[0] = livro;
        publicacoes[1] = filme;

        for (int i = 0; i < publicacoes.length; i++) {
            
            //O método "imprimirDados()"" é abstrato na classe Publicacao, mas nas subclasses ele é implementado. Quando o loop chama esse método, o Java executa a versão correspondente ao tipo real do objeto, usando polimorfismo.
            publicacoes[i].imprimirDados();
        }
    }
}
