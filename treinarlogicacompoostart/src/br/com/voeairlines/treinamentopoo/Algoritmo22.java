package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo22 {

	Scanner sc = new Scanner(System.in);

	public void resultado() {

		System.out.println("Informe a primeira medida: ");
		double medida1 = sc.nextDouble();
		System.out.println("Informe a outra medida: ");
		double medida2 = sc.nextDouble();

		double area = medida1 * medida2 / 2;
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("Area: %.2f", area);

		sc.close();
	}
}
