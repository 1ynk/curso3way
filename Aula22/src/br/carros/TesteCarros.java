package br.carros;

import java.util.Scanner;

public class TesteCarros {
	public static void main(String[] args) {
		
		Carro carro = new Carro("uno", "preto", 1989, "PQP-1010");
		
		carro.print();
		
		carro.ligar(" || Daniel \n");
		
		System.out.println(Carro.getContadorInstancia());
	}

}
