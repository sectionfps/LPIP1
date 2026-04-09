import java.util.Scanner;

public class Ex7_V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        System.out.print("Digite a nota (0 a 100): ");
        nota = sc.nextDouble();

        if (nota >= 90) {
            System.out.println("Classificação: A");
        } else if (nota >= 80) {
            System.out.println("Classificação: B");
        } else if (nota >= 70) {
            System.out.println("Classificação: C");
        } else if (nota >= 60) {
            System.out.println("Classificação: D");
        } else {
            System.out.println("Classificação: E");
        }
    }
}