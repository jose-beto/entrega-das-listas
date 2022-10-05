package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo10 {

	Scanner sc = new Scanner(System.in);

	public void resultado() {

		System.out.print("Digite o 1º numero: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o 2º numero: ");
		int num2 = sc.nextInt();
		int produto = num1 * num2;
		System.out.println("\nResultado: ");
		System.out.println(produto);

		sc.close();
	}
}