package questao02;

public class App {
    public static void main(String[] args) {

        Televisao tv1 = new Televisao( 80 , "LG", 220, 4);

        tv1.ligar();
        tv1.aumentarVolume();
        tv1.aumentarCanal();
        tv1.diminuirCanal();
        tv1.diminuirVolume();
        tv1.desligar();

        System.out.println("---------------------------------------------------");

        Televisao tv2 = new Televisao(100, "Roku", 110, 0);

        tv2.desligar();
        tv2.ligar();
        tv2.diminuirCanal();
        tv2.aumentarVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.aumentarCanal();
        tv2.diminuirCanal();
        tv2.desligar();

    }
}
