package br.calendario;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		int numero;
		System.out.println("Digite o numero: ");
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
	}

}
