import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Com qual deseja começar a corrida?");
            System.out.println("\n Moto");
            System.out.println("\n Carro");
            System.out.println(" Digite 1 para moto" + "\n Digite 2 para carro");
            int escolhe = scan.nextInt();
            if (escolhe == 1) {
                System.out.println(" Vc escolheu moto sua corrida começa em breve!");
            } else if (escolhe == 2) {
                System.out.println(" Vc escolheu carro Sua corrida começa em breve!");
            } else {
                System.out.println(" Opção invalida");
                System.out.println(" Tente novamente dando play ao sistema");
                System.exit(0);

            }

            System.out.println("\n Sua corrida começa em 3 segundos");
            for (int i = 1; i < 4; i++) {
                System.out.println("\n" + i);
            }
            System.out.println("Sua corrida começou!!");

            if (escolhe == 1) {
                System.out.println("Sua habilidade especial foi carregada deseja usar? ");
                System.out.println("Digite 3 para Sim e 4 para não!");
                int habilidadeEspecialLuigi = scan.nextInt();

                if (habilidadeEspecialLuigi == 3) {
                    Moto moto = new Moto();
                    moto.ultilizarHabilidadeEspecial();
                } else if (habilidadeEspecialLuigi == 4) {
                    System.out.println("Inimigo usou habilidade especial e passou vc!!");
                } else {
                    System.out.println("Opção errada vc perdeu!");
                }
            }

            if (escolhe == 2){
                System.out.println("Sua habilidade especial foi carregada deseja usar? ");
                System.out.println("Digite 3 para Sim e 4 para não!");
                int habilidadeEspecialMario = scan.nextInt();

                if (habilidadeEspecialMario == 3) {
                   Carro carro = new Carro();
                   carro.ultilizarHabilidadeEspecial();
                } else if (habilidadeEspecialMario == 4) {
                    System.out.println("Inimigo usou habilidade especial e passou vc!!");
                } else {
                    System.out.println("Opção errada vc perdeu!");
                }
            }
         }
}
