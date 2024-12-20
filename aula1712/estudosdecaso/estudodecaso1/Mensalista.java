package aula1712.estudosdecaso.estudodecaso1;

public class Mensalista extends Funcionario{
    double salarioFixo;
    
    public Mensalista(String nome, String cpf, double salarioFixo) {
        super(nome,cpf);
        this.salarioFixo = salarioFixo;
    }

    protected void calcularSalario() {
        super.salario = salarioFixo;
    }
}
