package aula1712.estudosdecaso.estudodecaso4;

public class App {
     public static void main(String[] args) {

        Transporte transporte1 = new Bicicleta(1, 2);
        Transporte transporte2 = new Carro(2, "Gasolina");
        Transporte transporte3 = new Onibus(50, "Jardim Brasil");

        Transporte[] transportes = new Transporte[3];

        transportes[0] = transporte1;
        transportes[1] = transporte2;
        transportes[2] = transporte3;
    
        for(int i = 0; i < transportes.length; i++) {
            transportes[i].mostrarDetalhes();
        }
    }
}
