import java.util.Scanner;

public class Ex8_V2 {

    public static String classificar_triangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o lado 1: ");
        a = sc.nextDouble();

        System.out.print("Digite o lado 2: ");
        b = sc.nextDouble();

        System.out.print("Digite o lado 3: ");
        c = sc.nextDouble();

        String resultado = classificar_triangulo(a, b, c);

        System.out.println("Triângulo " + resultado);
    }
}