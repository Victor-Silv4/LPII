package aula1712.estudosdecaso.estudodecaso1;

public class Funcionario {
    
    protected String nome, cpf;
    protected double salario;
    
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    protected void calcularSalario() {
        
    }

    public void imprimirSalario() {
        System.out.println("Salário: " + this.salario);
    }

}
