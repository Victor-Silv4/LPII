package aula1712.biblioteca;

public class Filme extends Publicacao {
    String diretor, atorPrincipal, sinopse, tempoDuracao;

    public Filme(String titulo, String autor, String genero, String editora, int anoPublicacao, int quantDisponivel,
                 String diretor, String atorPrincipal, String sinopse, String tempoDuracao) {
        super(titulo, autor, genero, editora, anoPublicacao, quantDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }

    protected void imprimirDados() {
        super.imprimirDados();
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Ator principal: " + this.atorPrincipal);
        System.out.println("Sinopse: " + this.sinopse);
        System.out.println("Tempo de duração: " + this.tempoDuracao);
        System.out.println("---------------------------------");
    }
}
