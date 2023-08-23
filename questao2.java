import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();

        int diastotais = idade*365;
        System.out.println(nome+" já viveu o total de "+diastotais+" dias");

    }
}
