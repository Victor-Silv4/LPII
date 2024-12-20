package aula1712.estudosdecaso.estudodecaso5;

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.println("Professor: " + nome + ", CPF: " + cpf + ", Disciplina: " + disciplina);
    }
}
