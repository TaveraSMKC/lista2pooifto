import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da gasolina: ");
        double gasolina = scan.nextDouble();

        System.out.println("Digite quantos litros de gasolina será colocado: ");
        double litros = scan.nextDouble();

        double valortotal = gasolina*litros;

        System.out.println(String.format("O valor total de combustivel sera de: %.2f", valortotal));

    }
}
