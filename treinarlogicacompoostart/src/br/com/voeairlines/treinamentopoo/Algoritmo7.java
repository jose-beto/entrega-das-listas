package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo7 {
	
	
	
	int n1, ant, suc;
	
	Scanner sc = new Scanner(System.in);
	public void resultado() {
	
	System.out.print("Entre com o numero: ");
	n1 = sc.nextInt();

	ant = n1 - 1;
	suc = n1 + 1;

	System.out.print("O antecessor e: " + ant + "\n");
	System.out.println("O sucessor e: " + suc);
	
	sc.close();

}

}