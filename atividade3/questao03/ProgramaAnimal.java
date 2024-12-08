package atividade3.questao03;

public class ProgramaAnimal {
    
    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Leâo", "12/11/2024", "Simba", "1234567-89", "Etiópia");

        animal1.listar();

        animal1.alterar("Leâo", "15/11/2024", "Simba", "1234567-89", "Etiópia");

        animal1.listar();
    }
}
