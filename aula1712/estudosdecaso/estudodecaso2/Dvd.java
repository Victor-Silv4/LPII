package aula1712.estudosdecaso.estudodecaso2;

public class Dvd extends ItemBiblioteca{
    String duracao;
    
    public Dvd(String titulo, String codigo, String duracao) {
        super(titulo, codigo);
        this.duracao = duracao;
    }

    protected void imprimirInformacoes() {
        System.out.println("Título: " + super.titulo);
        System.out.println("Código: " + super.codigo);
        System.out.println("Duração: " + this.duracao);
    }
}


