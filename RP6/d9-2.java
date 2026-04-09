import java.util.Scanner;

public class Ex9_V2 {

    public static int contar_vogais(String texto) {
        int contador = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto;
        System.out.print("Digite uma palavra ou frase: ");
        texto = sc.nextLine();

        int resultado = contar_vogais(texto);

        System.out.println("Quantidade de vogais: " + resultado);
    }
}