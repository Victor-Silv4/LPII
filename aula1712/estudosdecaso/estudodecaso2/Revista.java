package aula1712.estudosdecaso.estudodecaso2;

public class Revista extends ItemBiblioteca{

    String edicao;

    public Revista(String titulo, String codigo, String edicao) {
        super(titulo, codigo);
        this.edicao = edicao;
    }

    protected void imprimirInformacoes() {
        System.out.println("Título: " + super.titulo);
        System.out.println("Código: " + super.codigo);
        System.out.println("Autor: " + this.edicao);
    }
}
