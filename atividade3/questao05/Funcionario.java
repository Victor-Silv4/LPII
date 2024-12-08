package atividade3.questao05;

public class Funcionario {
    
    String nome, dataNascimento, rg, cpf, endereco, naturalidade, profissao, grauInstrucao, matricula;
    double salario;

    public Funcionario(String nome, String dataNascimento, String rg, String cpf, String endereco, String naturalidade, String profissao, String grauInstrucao, String matricula, double salario) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula; 
        this.salario = salario;
    }

    public void alterar(String nome, String dataNascimento, String rg, String cpf, String endereco, String naturalidade, String profissao, String grauInstrucao, String matricula, double salario) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula; 
        this.salario = salario;
    }

    public void listar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Local de nascimento (naturalidade): " + this.naturalidade);
        System.out.println("Profissão: " + this.profissao);
        System.out.println("Grau de instrução: " + this.grauInstrucao);
        System.out.println("Número de matrícula: " + this.matricula);
        System.out.println("Salário: " + this.salario);
        System.out.println("---------------------------------------");
    }

}
