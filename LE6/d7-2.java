import java.util.Scanner;

public class Ex7_V2 {

    public static String classificar_nota(double nota) {
        if (nota >= 90) {
            return "A";
        } else if (nota >= 80) {
            return "B";
        } else if (nota >= 70) {
            return "C";
        } else if (nota >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        System.out.print("Digite a nota (0 a 100): ");
        nota = sc.nextDouble();

        String resultado = classificar_nota(nota);

        System.out.println("Classificação: " + resultado);
    }
}