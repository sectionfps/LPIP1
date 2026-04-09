import java.util.Scanner;

public class DesafioROI {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double lucro, investimento;

            System.out.print("Digite o lucro: ");
            lucro = sc.nextDouble();

            System.out.print("Digite o investimento: ");
            investimento = sc.nextDouble();

            if (investimento == 0) {
                System.out.println("Erro: investimento não pode ser zero.");
            } else {
                double roi = (lucro - investimento) / investimento;
                System.out.println("ROI: " + roi);
            }
        }
    }
}