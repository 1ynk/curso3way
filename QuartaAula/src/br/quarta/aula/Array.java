package br.quarta.aula;

public class Array {
	public static void main(String[] args) {
		int i[] = new int[20];
		
		
		for(int cont=0;cont<20;cont++) {
			i[cont]=cont+1;
			if(i[cont]==12) {
				System.out.println("numero da posição 12: "+i[cont]);
			}
		}
		for(int cont=0; cont<20;cont++) {
			System.out.println(i[cont]);
		}
	}

}
