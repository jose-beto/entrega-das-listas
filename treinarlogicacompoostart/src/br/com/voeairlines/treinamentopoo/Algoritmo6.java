package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo6 {
	
	Scanner sc = new Scanner(System.in);

	public void resultado() {
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		System.out.println("\nResultado: ");
		System.out.println(num1 + " e " + num2);
		
		sc.close();
	}
}