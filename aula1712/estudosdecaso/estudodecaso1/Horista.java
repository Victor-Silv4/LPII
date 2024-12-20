package aula1712.estudosdecaso.estudodecaso1;

public class Horista extends Funcionario{
    double horasTrabalhadas, ValorHora;
    
    public Horista(String nome, String cpf, double horasTrabalhadas, double ValorHora) {
        super(nome,cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.ValorHora = ValorHora;
    }

    protected void calcularSalario() {
        super.salario = (horasTrabalhadas * ValorHora);
    }
}
