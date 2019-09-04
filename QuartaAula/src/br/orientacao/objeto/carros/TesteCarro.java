package br.orientacao.objeto.carros;

import java.util.Scanner;

public class TesteCarro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		System.out.println("Digite o ano do carro: ");
		carro.ano = sc.nextLine();
		
		System.out.println("Digite o modelo: ");
		carro.modelo = sc.nextLine();
		
		System.out.println("Digite a cor: ");
		carro.cor = sc.nextLine();
				
		System.out.println("Digite a placa: ");
		carro.placa = sc.nextLine();
		
		System.out.println("digite o estado do carro: 1-ligar 2-frear 3-acelerar");
		int var = sc.nextInt();
		System.out.println("=================================");
		System.out.println("ano: "+carro.ano);
		System.out.println("cor: "+carro.cor);
		System.out.println("modelo: "+carro.modelo);
		System.out.println("placa: "+carro.placa);
		switch(var) {
		case 1:
			carro.ligar();
			System.out.println(carro.ligar());
			break;
		case 2:
			carro.frear();
			break;
		case 3:
			carro.acelerar();
			break;
		}
		
		
		
		
		
		
		}
			
		
		
	}


