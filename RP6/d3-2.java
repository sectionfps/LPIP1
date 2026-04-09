import java.util.Scanner;

public class Ex3_V2 {

    public static boolean validar_senha(String senha) {
        return senha.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha;
        System.out.print("Digite uma senha: ");
        senha = sc.nextLine();

        while (!validar_senha(senha)) {
            System.out.println("Senha inválida! Deve ter pelo menos 8 caracteres.");
            System.out.print("Digite novamente: ");
            senha = sc.nextLine();
        }

        System.out.println("Senha válida!");
    }
}