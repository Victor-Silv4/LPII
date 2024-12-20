package aula1712.estudosdecaso.estudodecaso2;

public class App {
    public static void main(String[] args) {

        ItemBiblioteca item1 = new Livro("Percy Jackson", "00000", "Rick Riordan", 325);
        ItemBiblioteca item2 = new Revista("Veja", "00001", "20°");
        ItemBiblioteca item3 = new Dvd("De volta para o futuro", "00002", "1:56h");

        ItemBiblioteca[] itens = new ItemBiblioteca[3];

        itens[0] = item1;
        itens[1] = item2;
        itens[2] = item3;
    
        for(int i = 0; i < itens.length; i++) {
            itens[i].imprimirInformacoes();
        }
    }
}
