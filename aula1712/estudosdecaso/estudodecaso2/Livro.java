package aula1712.estudosdecaso.estudodecaso2;

public class Livro extends ItemBiblioteca {
    String autor;
    int numeroPaginas;

    public Livro(String titulo, String codigo, String autor, int numeroPaginas) {
        super(titulo, codigo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    protected void imprimirInformacoes() {
        System.out.println("Título: " + super.titulo);
        System.out.println("Código: " + super.codigo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de páginas: " + this.numeroPaginas);
    }
}
