import java.util.Scanner;

public class Ex4_V2 {

    public static String gerar_mensagem_boas_vindas(String nome, int idade) {
        return "Bem-vindo, " + nome + "! Você tem " + idade + " anos.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        String mensagem = gerar_mensagem_boas_vindas(nome, idade);
        System.out.println(mensagem);
    }
}