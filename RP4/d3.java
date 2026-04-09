package RP4;

import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            B[i] = A[i] * A[i];
        }

        System.out.println("\nMatriz A:");
        for (int i = 0; i < 15; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nMatriz B (quadrados):");
        for (int i = 0; i < 15; i++) {
            System.out.print(B[i] + " ");
        }

        scanner.close();
    }
}
