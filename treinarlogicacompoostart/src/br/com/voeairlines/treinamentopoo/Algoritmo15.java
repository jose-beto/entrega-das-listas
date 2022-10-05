package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo15 {

	Scanner sc = new Scanner(System.in);  

	public void resultado() {

		System.out.print("Digite o valor do salário mínimo: ");
		double salarioMin = sc.nextDouble();
		System.out.print("Digite a quantidade de Kwh: ");
		double qtdKwh = sc.nextDouble();
		double precoKwh = salarioMin / 700;
		double faturaPago = precoKwh * qtdKwh;
		double faturaDesconto = faturaPago - (faturaPago * 0.1);
		System.out.println("\nResultado: ");
		System.out.printf("Valor em reais de cada quiloWatts: %.2f", precoKwh);
		System.out.printf("\nValor de fatura sem desconto: %.2f", faturaPago);
		System.out.printf("\nValor de fatura com desconto: %.2f", faturaDesconto);

		sc.close();
	}
}