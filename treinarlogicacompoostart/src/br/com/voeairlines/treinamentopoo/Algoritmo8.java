package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo8 {

	Scanner sc = new Scanner(System.in);

	public void resultado() {
		
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite seu endereço: ");
		String endereco = sc.nextLine();
		System.out.print("Digite seu telefone: ");
		String telefone = sc.nextLine();
		System.out.println("\nResultado: ");
		System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);
		
		sc.close();
	}
}