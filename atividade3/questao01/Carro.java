package atividade3.questao01;

public class Carro {
    
    int codigo;
    String marca;
    String cor;
    String modelo;
    int anoFabricacao;
    int numPortas;
    String tipoCombustivel;
    int quantDisponivel;
    double preco;
    String tipo;


    public Carro(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numPortas, String tipoCombustivel, int quantDisponivel, double preco, String tipo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantDisponivel = quantDisponivel;
        this.preco = preco;
        this.tipo = tipo;
    }


    public void alterar(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numPortas, String tipoCombustivel, int quantDisponivel, double preco, String tipo) {

        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantDisponivel = quantDisponivel;
        this.preco = preco;
        this.tipo = tipo;
    }

    public void listar() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
        System.out.println("Número de Portas: " + this.numPortas);
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
        System.out.println("Quantidade Disponível: " + this.quantDisponivel);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("-----------------------------");
    }
}


