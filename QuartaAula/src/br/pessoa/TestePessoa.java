package br.pessoa;

import java.util.Scanner;

public class TestePessoa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		System.out.println("Digite a cor do cabelo: ");
		pessoa1.corCabelo = sc.next();
		System.out.println("Digite a cor dos olhos");
		pessoa1.corOlhos = sc.next();
		System.out.println("Digite o sexo: ");
		pessoa1.sexo = sc.next();
		System.out.println("Digite o tipo sanguineo: ");
		pessoa1.tipoSanguineo = sc.next();
		
		Pessoa pessoa2 = new Pessoa();
		System.out.println("Digite a cor do cabelo: ");
		pessoa2.corCabelo = sc.next();
		System.out.println("Digite a cor dos olhos");
		pessoa2.corOlhos = sc.next();
		System.out.println("Digite o sexo: ");
		pessoa2.sexo = sc.next();
		System.out.println("Digite o tipo sanguineo: ");
		pessoa2.tipoSanguineo = sc.next();
		
		
		System.out.println("Dados pessoa 1: ");
		System.out.println("cabelo: "+pessoa1.corCabelo);
		System.out.println("olhos: "+pessoa1.corOlhos);
		System.out.println("sexo: "+pessoa1.sexo);
		System.out.println("sangue: "+pessoa1.tipoSanguineo);
		
		System.out.println("Dados pessoa 2: ");
		System.out.println("cabelo: "+pessoa2.corCabelo);
		System.out.println("olhos: "+pessoa2.corOlhos);
		System.out.println("sexo: "+pessoa2.sexo);
		System.out.println("sangue: "+pessoa2.tipoSanguineo);
	}
}
