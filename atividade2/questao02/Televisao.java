package questao02;

public class Televisao {

    int polegadas;
    int volume; 
    String marca;
    int voltagem;
    int canal;
    boolean ligado;

    public Televisao(int polegadas, String marca, int voltagem, int canal) {
        this.polegadas = polegadas;
        this.volume = 5;
        this.marca = marca; 
        this.voltagem = voltagem;
        this.canal = canal;
        this.ligado = false;
    }

    public void ligar() {
        if(this.ligado == false){
            this.ligado = true;
            System.out.println("A tV " + this.marca + " está ligada");
            System.out.println("Seu consumo de nergia é: "  + (this.voltagem * this.polegadas) + "W");
        }

        else { 
            System.out.println("A TV " + this.marca + " já está ligada");
            System.out.println("Seu consumo de nergia é: "  + (this.voltagem * this.polegadas) + "W");
        }
        
    }

    public void desligar() {
        
        if(this.ligado == true) {
            this.ligado = false;
            System.out.println("A TV " + this.marca + " foi desligada");
        }

        else {
            System.out.println("A TV " + this.marca + " já está desligada");
        }
    }

    public void aumentarVolume() {

        if(this.volume < 10) {
            this.volume++;
            System.out.println("O volume atual é: " + this.volume);
        }

        else {
            System.out.println("O volume já está no máximo");
        }
    }

    public void diminuirVolume() {

        if(this.volume > 0) {
            this.volume--;
            System.out.println("O volume atual é: " + this.volume);
        }

        else {
            System.out.println("O volume já está no mínimo");
        }
    }

    public void aumentarCanal() {
        this.canal++;
        System.out.println("O canal atual é: " + this.canal);
    }

    public void diminuirCanal() {
        if(this.canal > 0) {
            this.canal--;
            System.out.println("O canal atual é: " + this.canal);
        }

        else {
            System.out.println("Você chegou ao canal número 0");
        }
    }
    
}