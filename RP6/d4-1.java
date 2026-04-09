import java.util.Scanner;

public class Ex4_V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Bem-vindo, " + nome + "! Você tem " + idade + " anos.");
    }
}