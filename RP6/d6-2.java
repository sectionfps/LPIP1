import java.util.Scanner;

public class Ex6_V2 {

    public static double aplicar_desconto(double valor, double desconto) {
        return valor - (valor * desconto / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor, desconto;

        System.out.print("Digite o valor do produto: ");
        valor = sc.nextDouble();

        System.out.print("Digite o desconto (%): ");
        desconto = sc.nextDouble();

        double valor_final = aplicar_desconto(valor, desconto);

        System.out.println("Valor final com desconto: " + valor_final);
    }
}