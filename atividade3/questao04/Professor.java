package atividade3.questao04;

public class Professor {
    String nome;
    String titulacao;
    String formacao;
    int cargaHoraria;
    double salario;
    String descricaoDisciplinas;

    public Professor(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void alterar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void alterarDescDisciplina(String novaDescricao) {
        this.descricaoDisciplinas = novaDescricao;
    }

    public void listar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Formação: " + this.formacao);
        System.out.println("Carga horária: " + this.cargaHoraria);
        System.out.println("Salário: " + this.salario);
        System.out.println("Descrição da disciplina: " + this.descricaoDisciplinas);
        System.out.println("---------------------------------------");
    }

}
