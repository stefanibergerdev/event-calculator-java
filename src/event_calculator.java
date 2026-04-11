import java.util.Scanner;
public class event_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variáveis principais e inputs

        System.out.println("Digite quantos convidados serão (adultos e crianças): ");
        int convidados = scanner.nextInt();
        System.out.println("Digite a quantidade de copos por pessoa: ");
        int copos = scanner.nextInt();
        System.out.println("Digite quantas unidades de salgado por pessoa serão: ");
        int salgados = scanner.nextInt();
        System.out.println("Digite quantas unidades de doce por pessoa serão: ");
        int doces = scanner.nextInt();
        System.out.println("Digite quantas fatias de bolo por pessoa serão: ");
        int fatias = scanner.nextInt();
        System.out.println("Digite a quantidade em mL de bebida por pessoa: ");
        double bebidas = scanner.nextDouble();

        //Cálculos

        int totalCopos = convidados * copos;
        int totalSalgados = convidados * salgados;
        int totalDoces = convidados * doces;
        int totalBolo = convidados * fatias;
        double totalBebidas = (convidados * bebidas) / 1000;

        //Outputs
        System.out.println("\nPara o seu evento com " + convidados + " convidados, será necessário: ");
        System.out.println("O total de " + totalCopos + " copos.");
        System.out.println("O total de " + totalSalgados + " salgados.");
        System.out.println("O total de " + totalDoces + " doces.");
        System.out.println("O total de " + totalBolo + " fatias de bolo.");
        System.out.printf("O total de %.3f litros de bebidas. \n", totalBebidas);

        scanner.close();
    }
}
