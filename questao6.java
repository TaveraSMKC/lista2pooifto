import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome do cidadão: ");
        String nome = scan.nextLine();
        System.out.println("Insira a idade do cidadão: ");
        int idade = scan.nextInt();
        System.out.println("Insira o telefone do cidadão: ");
        int telefonezap = scan.nextInt();

        cadastroFuncional(nome, idade, telefonezap);
    }

    static void cadastroFuncional(String nome, int idade, int telefonezap){

        System.out.println("=====================");
        System.out.println("DADOS DO FUNCIONÁRIO");
        System.out.println("=====================");
        System.out.printf("Nome: %s%n Idade: %d%nTelefone: (63) %s%n ", nome, idade, telefonezap);
        System.out.println("=====================");

    }
}
