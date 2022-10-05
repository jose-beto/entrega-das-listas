package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo13 {

	Scanner sc = new Scanner(System.in);

	public void resultado() {

		System.out.print("Digite um valor: ");
		double num1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double num2 = sc.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		double num3 = sc.nextDouble();
		System.out.print("Digite o quarto valor: ");
		double num4 = sc.nextDouble();
		double media = ((num1 * 1) + (num2 * 2) + (num3 * 3) + (num4 * 4)) / 10;
		System.out.println("\nResultado: ");
		System.out.println("Media: " + media);

		sc.close();
	}
}