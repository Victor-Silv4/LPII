package aula1712.estudosdecaso.estudodecaso4;

public class Onibus extends Transporte{
    String linha;

    public Onibus(int capacidade, String linha) {
        super(capacidade);
        this.linha = linha;
    }

    public void mostrarDetalhes() {
        System.out.println("Linha: " + this.linha);
        System.out.println("Capacidade: " + super.capacidade);
    }
}
