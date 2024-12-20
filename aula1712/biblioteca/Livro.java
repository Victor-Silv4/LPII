package aula1712.biblioteca;

public class Livro extends Publicacao {
    private String edicao, isbn;;

    public Livro(String titulo, String autor, String genero, String editora, int anoPublicacao, int quantDisponivel, String edicao, String isbn) {
        super(titulo, autor, genero, editora, anoPublicacao, quantDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    protected void imprimirDados() {
        super.imprimirDados();
        System.out.println("Edição: " + this.edicao);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("---------------------------------");
    }
}
