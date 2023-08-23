import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Quantos pães foram vendidos no dia?");
        int npao = scan.nextInt();
        System.out.println("Quantos broas foram vendidos no dia?");
        int nbroa = scan.nextInt();

        double pao = 0.12;
        double broa = 1.50;

        double total = (npao * pao) + (nbroa * broa);
        System.out.println("O valor total vendido foi de: "+ total);

        double poupanca = total/10;
        System.out.println("O valor da poupança será de: "+ poupanca);

    }
}
