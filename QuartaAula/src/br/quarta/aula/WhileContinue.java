package br.quarta.aula;

public class WhileContinue {
	public static void main(String[] args) {
		int cont = 0;
		
		while (true) {
			
			if(cont == 2) {
				System.out.println("continue");
				cont++;
				continue;
			}
			
			if(cont==10) {
				System.out.println("break");
				break;
			}
			
			System.out.println(cont);
			cont++;
			
		} 
	}

}
