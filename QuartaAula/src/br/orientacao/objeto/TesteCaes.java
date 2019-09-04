package br.orientacao.objeto;

import java.util.Scanner;

public class TesteCaes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		System.out.println("Digite o nome do totó: ");
		cachorro.nome =sc.next();
		System.out.println("Digite o peso: ");
		cachorro.peso = sc.nextInt();
		System.out.println("Digite a cor dos olhos: ");
		cachorro.corOlhos = sc.next();
		System.out.println("Digite a quantidade de patas: ");
		cachorro.qtdPatas = sc.nextInt();
		
		Cachorro cachorro1 = new Cachorro();
		System.out.println("Digite o nome do totó: ");
		cachorro1.nome =sc.next();
		System.out.println("Digite o peso: ");
		cachorro1.peso = sc.nextInt();
		System.out.println("Digite a cor dos olhos: ");
		cachorro1.corOlhos = sc.next();
		System.out.println("Digite a quantidade de patas: ");
		cachorro1.qtdPatas = sc.nextInt();
		
		Cachorro cachorro2 = new Cachorro();
		System.out.println("Digite o nome do totó: ");
		cachorro2.nome =sc.next();
		System.out.println("Digite o peso: ");
		cachorro2.peso = sc.nextInt();
		System.out.println("Digite a cor dos olhos: ");
		cachorro2.corOlhos = sc.next();
		System.out.println("Digite a quantidade de patas: ");
		cachorro2.qtdPatas = sc.nextInt();
		
		Cachorro cachorro3 = new Cachorro();
		System.out.println("Digite o nome do totó: ");
		cachorro3.nome =sc.next();
		System.out.println("Digite o peso: ");
		cachorro3.peso = sc.nextInt();
		System.out.println("Digite a cor dos olhos: ");
		cachorro3.corOlhos = sc.next();
		System.out.println("Digite a quantidade de patas: ");
		cachorro3.qtdPatas = sc.nextInt();
		
		System.out.println("==================================================");
		System.out.println("nome: "+cachorro.nome);
		System.out.println("peso: "+cachorro.peso);
		System.out.println("cor dos olhos: "+cachorro.corOlhos);
		System.out.println("qtd patas: "+cachorro.qtdPatas);
		
		System.out.println("==================================================");
		System.out.println("nome: "+cachorro1.nome);
		System.out.println("peso: "+cachorro1.peso);
		System.out.println("cor dos olhos: "+cachorro1.corOlhos);
		System.out.println("qtd patas: "+cachorro1.qtdPatas);
		
		System.out.println("==================================================");
		System.out.println("nome: "+cachorro2.nome);
		System.out.println("peso: "+cachorro2.peso);
		System.out.println("cor dos olhos: "+cachorro2.corOlhos);
		System.out.println("qtd patas: "+cachorro2.qtdPatas);
		
		System.out.println("==================================================");
		System.out.println("nome: "+cachorro3.nome);
		System.out.println("peso: "+cachorro3.peso);
		System.out.println("cor dos olhos: "+cachorro3.corOlhos);
		System.out.println("qtd patas: "+cachorro3.qtdPatas);
		

	}

}
