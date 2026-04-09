import java.util.ArrayList;
import java.util.Scanner;

public class SorveteriaDener {

    static void exibirCabecalho() {
        System.out.println("=================================");
        System.out.println("     SORVETERIA DO DENER");
        System.out.println("   Sistema de Controle de Estoque");
        System.out.println("=================================");
    }

    static String verificarEstoqueCritico(int quantidade) {
        if (quantidade < 5) {
            return "[REPOSIÇÃO NECESSÁRIA]";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirCabecalho();

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do insumo: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a quantidade: ");
            
            // usando nextInt direto (mais simples)
            int qtd = scanner.nextInt();
            scanner.nextLine(); // limpar o ENTER do buffer

            nomes.add(nome);
            quantidades.add(qtd);
        }

        System.out.println("\nRelatório de Estoque:");

        for (int i = 0; i < nomes.size(); i++) {
            String aviso = verificarEstoqueCritico(quantidades.get(i));
            System.out.println("Produto: " + nomes.get(i) +
                    " | Estoque: " + quantidades.get(i) +
                    " unidades " + aviso);
        }

        scanner.close();
    }
}