package atividade3.questao05;

public class ProgramaFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario("Carlos", "25/12/2000", "21.180.019-3", "123.456.789-00", "Santa Mônica - Feira de Santana", "Feira de Santana", "Analista de sistemas", "Superior completo", "123456789-000", 12000);

        func1.listar();

        func1.alterar("Carlos", "25/12/2000", "21.180.019-3", "123.456.789-00", "Santa Mônica - Feira de Santana", "Feira de Santana", "Analista de sistemas", "Superior completo", "123456789-000", 15000);

        func1.listar();

    }
}
