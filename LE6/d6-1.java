import java.util.Scanner;

public class Ex6_V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor, desconto;

        System.out.print("Digite o valor do produto: ");
        valor = sc.nextDouble();

        System.out.print("Digite o desconto (%): ");
        desconto = sc.nextDouble();

        double valor_final = valor - (valor * desconto / 100);

        System.out.println("Valor final com desconto: " + valor_final);
    }
}