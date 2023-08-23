import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor inteiro de x: ");
        int x = scan.nextInt();

        calculaFuncao(x);
    }
    static void calculaFuncao(int x){
        System.out.println("Resultado da expressão x^2 + 4x + 2: " + ((x*x) + x*4)+ 2);
    }
}
