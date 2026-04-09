import java.util.Scanner;

public class Ex8_V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o lado 1: ");
        a = sc.nextDouble();

        System.out.print("Digite o lado 2: ");
        b = sc.nextDouble();

        System.out.print("Digite o lado 3: ");
        c = sc.nextDouble();

        if (a == b && b == c) {
            System.out.println("Triângulo Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }
}