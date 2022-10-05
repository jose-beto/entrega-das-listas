package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo16 {

	Scanner sc = new Scanner(System.in);

	public void resultado() {
	
	String t = "Isso e um teste";
	
	System.out.println(t);
	System.out.println(t.substring(0, 1));
	System.out.println(t.substring(14));
	System.out.println(t.substring(0, 3));
	System.out.println(t.substring(3, 4));
	System.out.println(t.substring(1, 15 ));
	System.out.println(t.substring(13, 15 ));
	
	sc.close();
	
}

}