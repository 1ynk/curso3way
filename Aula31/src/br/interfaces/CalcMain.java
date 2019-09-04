package br.interfaces;

import java.util.Scanner;

public class CalcMain{
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Digite os numeros x e y: ");
		
		Scanner sc = new Scanner(System.in);
		
		Double x = sc.nextDouble();
		Double y = sc.nextDouble();
		
		System.out.println("soma: "+calc.soma(x, y));
		
		System.out.println("multiplicação: "+calc.multiplicacao(x, y));
		
		System.out.println("subtração: "+calc.subracao(x, y));
		
		
	}

}
