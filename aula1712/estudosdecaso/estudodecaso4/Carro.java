package aula1712.estudosdecaso.estudodecaso4;

public class Carro extends Transporte{
    String combustivel;

    public Carro(int capacidade, String combustivel) {
        super(capacidade);
        this.combustivel = combustivel;
    }

    public void mostrarDetalhes() {
        System.out.println("Combustíivel: " + this.combustivel);
        System.out.println("Capacidade: " + super.capacidade);
    }
}
