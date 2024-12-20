package aula1712.biblioteca;

public class Publicacao {
    private String titulo, autor, genero, editora;
    private int anoPublicacao, quantDisponivel;

    public Publicacao(String titulo, String autor, String genero, String editora, int anoPublicacao, int quantDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.quantDisponivel = quantDisponivel;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getEditora() {
        return this.editora;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public int getQuantDisponivel() {
        return this.quantDisponivel;
    }

    protected void imprimirDados() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
        System.out.println("Quantidade disponível: " + this.quantDisponivel);
    }
}

