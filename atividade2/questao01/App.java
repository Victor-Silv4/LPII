package atividade2.questao01;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat Uno", 0, 10, 0, false);

        carro.ligar();
        carro.acelerar();
        carro.marchaCima();
        carro.virarDireita();
        carro.virarEsquerda();
        carro.marchaBaixo();
        carro.marchaBaixo();
        carro.desligar();
        carro.desacelerar();
        
        System.out.println("-----------------------------------------------------------");


        Carro carro2 = new Carro("Gol quadrado", 10, 20, 2, true);

        carro2.ligar();
        carro2.acelerar();
        carro2.marchaCima();
        carro2.virarDireita();
        carro2.virarEsquerda();
        carro2.marchaBaixo();
        carro2.desligar();
        carro2.desacelerar();
    }
}
