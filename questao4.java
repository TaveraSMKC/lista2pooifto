import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso do prato: ");
        double peso = scan.nextDouble();

        double quilo = 12.00;
        double valorfinal = peso * quilo;
        System.out.println(String.format("O valor a ser pago será de: %.2f", valorfinal, " reais"));

    }
}
