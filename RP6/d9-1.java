import java.util.Scanner;

public class Ex9_V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto;
        System.out.print("Digite uma palavra ou frase: ");
        texto = sc.nextLine();

        int contador = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);
    }
}