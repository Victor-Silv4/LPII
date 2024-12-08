package atividade3.questao01;

public class ProgramaCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro(0, "Fiat", "Preto", "Strada", 2020, 4, "Gasolina", 10,  103.990, "completo");
    
        carro1.listar();
    
    
        carro1.alterar(0, "Fiat", "Preto", "Strada", 2020, 4, "Gasolina", 7,  103.990, "completo");
    
        carro1.listar();
    
        }
}
