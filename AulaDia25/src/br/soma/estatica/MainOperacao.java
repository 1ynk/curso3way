package br.soma.estatica;

import java.util.Scanner;

public class MainOperacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os numeros para soma: ");
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		
		
		TestaSomaEstatica.somaNumero(x, y);
		
		System.out.println("Digite os numeros para multiplicar: ");
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		
		TestaSomaEstatica.multiplicaNumero(x, y);
		
		
	}

}
