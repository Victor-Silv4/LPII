package atividade3.questao04;

public class ProgramaProfessor {
    
    public static void main(String[] args) {
        Professor prof1 = new Professor("Jorge", "Mestre", "Sistemas de informação", 44, 7000, "Linguagem de programação 1, linguagem de programação 2");

        prof1.listar();

        prof1.alterar("Jorge", "Mestre", "Sistemas de informação", 44, 10000, "Linguagem de programação 1, linguagem de programação 2");

        prof1.listar();

        prof1.alterarDescDisciplina("Linguagem de programação 1, estruturas de dados");

        prof1.listar();

        
    }
}
