package br.enumm;

import java.util.Scanner;

public class MasculinoFeminino {
	public static void main(String[] args)   {
		try {
			teste();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ffef");
		}
		
	}
	public static void teste() throws Exception   {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite M (masculino) ou F (feminino): ");
		String sexo = sc.next();
		
		if(sexo.trim().equals(sexo)!=sexo.trim().equals("M")||sexo.trim().equals(sexo)!=sexo.trim().equals("F")) {
			throw new Exception("sexo invalido");
		}
		
	}

}
