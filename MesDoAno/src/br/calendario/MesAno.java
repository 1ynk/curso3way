package br.calendario;

public class MesAno {
	public static void main(String[] args) {
		int mesDoAno = 12;
		
		if(mesDoAno == 12  || mesDoAno == 1 || mesDoAno == 2) {
			System.out.println("Verão");
		} else if(mesDoAno == 3  || mesDoAno == 4 || mesDoAno == 5) {
			System.out.println("outono");
		} else if(mesDoAno == 6  || mesDoAno == 7 || mesDoAno == 8) {
			System.out.println("inverno");
		} else if(mesDoAno == 9  || mesDoAno == 10 || mesDoAno == 11) {
			System.out.println("primavera");
		} else {
			System.out.println("mes invalido: " + mesDoAno);
		}
	}
}
