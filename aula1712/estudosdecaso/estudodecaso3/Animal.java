package aula1712.estudosdecaso.estudodecaso3;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected void emitirSom() {
        System.out.println("emitindo som");
    }
}
