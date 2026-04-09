package RP2;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            System.out.print("Digite a quantidade em estoque: ");
            int qtd = sc.nextInt();

            if (qtd < 0) {
                System.out.println("Erro: A quantidade não pode ser um valor negativo. Tente novamente.");
            } else {
                System.out.println("\nProduto cadastrado com sucesso!");
                System.out.println("Resumo do produto:");
                System.out.println("Nome: " + nome);
                System.out.println("Preço: R$ " + preco);
                System.out.println("Quantidade em estoque: " + qtd);
            }
        }
    }
}