package br.calendario;

import java.util.Scanner;

public class Sexo {
	public static void main(String[] args) {
		
		System.out.println("Digite o Sexo: ");
		Scanner sc = new Scanner(System.in);
		String sexo = sc.next();
		
		
 		if(sexo.equalsIgnoreCase("F")) {
			System.out.println("sexo FEMININO");
		}else if(sexo.equalsIgnoreCase("M")) {
			System.out.println("sexo MASCULINO");
		}else {
			System.out.println("SEXO INVALIDO");
		}
	}

}
