import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fabrica fabrica = new Fabrica();
        OperadorDeCorte operadorDeCorte = new OperadorDeCorte();
        OperadorDeDobrar operadorDeDobrar = new OperadorDeDobrar();
        OperadorDePrensa operadorDePrensa = new OperadorDePrensa();


            System.out.println(operadorDeCorte.trabalhar());
            System.out.println(operadorDePrensa.trabalhar());
            System.out.println(operadorDeDobrar.trabalhar());

    }
}
