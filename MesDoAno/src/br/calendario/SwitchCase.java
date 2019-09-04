package br.calendario;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int mesDoAno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o mes: ");
		mesDoAno = sc.nextInt();

		switch (mesDoAno) {
		case 12:
		case 1:
		case 2:
			System.out.println("verão");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("outono");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("inverno");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("primavera");
			break;
		default:
			System.out.println("mes inválido: "+mesDoAno);

		}
	}

}
