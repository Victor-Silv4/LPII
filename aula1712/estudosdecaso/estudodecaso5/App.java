package aula1712.estudosdecaso.estudodecaso5;

public class App {
    public static void main(String[] args) {
        
        Pessoa professor1 = new Professor("Carlos Silva", "123.456.789-00", "Matemática");
        Pessoa professor2 = new Professor("Maria Oliveira", "987.654.321-00", "Física");
        Pessoa aluno1 = new Aluno("João Santos", "111.222.333-44", "A12345");
        Pessoa aluno2 = new Aluno("Ana Costa", "555.666.777-88", "B67890");

        Pessoa[] comunidadeEscolar = new Pessoa[4];

        comunidadeEscolar[0] = professor1;
        comunidadeEscolar[1] = professor2;
        comunidadeEscolar[2] = aluno1;
        comunidadeEscolar[3] = aluno2;

        for(int i = 0; i < comunidadeEscolar.length; i++) {
            comunidadeEscolar[i].exibirDados();
        }
    }
}
