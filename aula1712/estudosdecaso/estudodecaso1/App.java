package aula1712.estudosdecaso.estudodecaso1;

public class App {
    public static void main(String[] args) {

        Funcionario horista1 = new Horista("João", "123.456.789-00", 120, 20);
        Funcionario horista2 = new Horista("Ana", "321.465.978-58", 160, 35);

        Funcionario mensalista1 = new Mensalista("Cesar", "321.874.423-88",2800);
        Funcionario mensalista2 = new Mensalista("Carla", "124.471.978-77",2100);

        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = horista1;
        funcionarios[1] = mensalista1;
        funcionarios[2] = horista2;
        funcionarios[3] = mensalista2;
    
        for(int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].calcularSalario();
            funcionarios[i].imprimirSalario();
        }

    }
}
