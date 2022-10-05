package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo14 {

	Scanner sc = new Scanner(System.in);

	public void resultado() {

		System.out.print("Digite o valor que deseja aplicar: ");
		double saldo = sc.nextDouble();
		double novoSaldo = saldo + (saldo * 0.01);
		System.out.println("\nResultado: ");
		System.out.println("O valor do saldo atualizado é: " + novoSaldo);

		sc.close();
	}
}