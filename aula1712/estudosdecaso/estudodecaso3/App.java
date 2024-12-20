package aula1712.estudosdecaso.estudodecaso3;

public class App {
    public static void main(String[] args) {

        Animal animal1 = new Cachorro("Rex", 1, "Husky");
        Animal animal2 = new Gato("Lola", 2, "Branca");
        Animal animal3 = new Ave("Blue", 5, "Arara Azul");

        Animal[] animais = new Animal[3];

        animais[0] = animal1;
        animais[1] = animal2;
        animais[2] = animal3;
    
        for(int i = 0; i < animais.length; i++) {
            animais[i].emitirSom();
        }
    }
}
