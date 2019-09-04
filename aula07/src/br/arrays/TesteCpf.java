package br.arrays;

import java.util.Scanner;

public class TesteCpf {
	public static void main(String[] args) {
		RetornoCpf cpf = new RetornoCpf();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita seu cpf aí: ");
		
		String var = sc.next();
		
		System.out.println(cpf.retornaNomePorCpf(var));
	}

}
