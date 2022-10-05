package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo12 {

	Scanner sc = new Scanner(System.in);

	public void resultado() {

		System.out.print("Digite um valor: ");
		double num1 = sc.nextDouble();
		System.out.print("Digite outro valor: ");
		double num2 = sc.nextDouble();
		double media = (num1 + num2) / 2;
		System.out.println("\nResultado: ");
		System.out.println("Média: " + media);

		sc.close();
	}
}