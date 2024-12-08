package atividade3.questao03;

public class Animal {

    String especie, dataNascimento, nome, numRegistro, localNascimento;

    public Animal(String especie, String dataNascimento, String nome, String numRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numRegistro = numRegistro;
        this.localNascimento = localNascimento;
    }

    public void alterar(String especie, String dataNascimento, String nome, String numRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numRegistro = numRegistro;
        this.localNascimento = localNascimento;
    }

    public void listar() {
        System.out.println("Especie: " + this.especie);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de registro: " + this.numRegistro);
        System.out.println("Local de nascimento: " + this.localNascimento);
        System.out.println("---------------------------------------");
    }

}
