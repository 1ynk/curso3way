package br.getset;

import java.util.Scanner;

public class MainCor {
	public static void main(String[] args) {

		Cores cores = new Cores();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua cor: ");
		
		cores.setCor(sc.nextLine());

		System.out.println("cor digitada: "+cores.getCor());
	}

}
