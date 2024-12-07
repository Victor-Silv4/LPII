package questao01;

public class Carro{

    String modelo;
    double velocidade;
    double aceleracao;
    int marcha;
    boolean ligado;;

    public Carro(String modelo, double velocidade, double aceleracao, int marcha, boolean ligado) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
        this.ligado = ligado;
    }

    public void ligar() {

        if(this.ligado == false) {
            this.ligado = true;
            System.out.println("O carro " + this.modelo + " foi ligado"); 
        }
        else {
            System.out.println("O " + this.modelo + " já está ligado");
        }
    }

    public void desligar() {
        
        if(this.ligado == true) {
            this.ligado = false;
            System.out.println("O carro " + this.modelo + " foi desligado"); 
        }

        else {
            System.out.println("O " + this.modelo + " já está desligado");
        }
    }

    public void acelerar() {

        if(this.ligado == true){
            velocidade += aceleracao;
            System.out.println("A velocidade atual é de: " + velocidade  + "Km/h");
        }

        else {
            System.out.println("O carro está desligado");
        }
    }

    public void desacelerar() {
        if(velocidade > 0 && this.ligado == true) {
            velocidade -= aceleracao;
            System.out.println("A velocidade atual é de: " + velocidade);
        }

        else {
            velocidade = 0;
            System.out.println("O carro"  + this.modelo + " está parado");
        }
        
    }

    public void virarDireita() {
        System.out.println("Virando a direita");
    }
    
    public void virarEsquerda() {
        System.out.println("Virando a esquerda");
    }

    public void marchaCima() {
        if(marcha < 10) {
            marcha++;
            System.out.println("O carro " + this.modelo + " esta na marcha " + marcha);
        }
    }

    public void marchaBaixo() {
        if(marcha > 0) {
            marcha--;
            System.out.println("O carro " + this.modelo + " esta na marcha " + marcha);
        }
    }
}