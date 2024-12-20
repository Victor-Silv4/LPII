package aula1712.estudosdecaso.estudodecaso4;

public class Bicicleta extends Transporte {
    int marchas;

    public Bicicleta(int capacidade, int marchas) {
        super(capacidade);
        this.marchas = marchas;
    }

    public void mostrarDetalhes() {
        System.out.println("Marchas: " + this.marchas);
        System.out.println("Capacidade: " + super.capacidade);
    }
}
