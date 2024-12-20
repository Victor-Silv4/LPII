package aula1712.estudosdecaso.estudodecaso5;

class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + nome + ", CPF: " + cpf + ", Matrícula: " + matricula);
    }
}