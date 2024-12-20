package aula1712.estudosdecaso.estudodecaso4;

public class Transporte {
    protected int capacidade;

    protected Transporte(int capacidade) {
        this.capacidade = capacidade;
    }

    protected void mostrarDetalhes() {
        System.out.println(this.capacidade);
    }
}
