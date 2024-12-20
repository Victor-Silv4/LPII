package aula1712.estudosdecaso.estudodecaso2;

public class ItemBiblioteca {
    protected String titulo, codigo;
    
    public ItemBiblioteca(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    protected void imprimirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Código: " + this.codigo);
    }

}

