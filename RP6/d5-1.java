import java.util.Scanner;

public class Ex5_V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;
        System.out.print("Digite a temperatura em Celsius: ");
        celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}