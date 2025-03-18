package atividade_1803;

public class Livro {
    int isbn;
    String autor, editora, titulo;
    
    public Livro (int isbn, String autor, String editora, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livro livro = (Livro) obj;
        return this.isbn == livro.isbn; 
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(isbn);
    }
}
