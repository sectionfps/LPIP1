import java.util.Scanner;

public class Ex5_V2 {

    public static double celsius_para_fahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;
        System.out.print("Digite a temperatura em Celsius: ");
        celsius = sc.nextDouble();

        double fahrenheit = celsius_para_fahrenheit(celsius);

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}