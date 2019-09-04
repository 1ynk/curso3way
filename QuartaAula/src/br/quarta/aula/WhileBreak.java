package br.quarta.aula;

public class WhileBreak {
	public static void main(String[] args) {
		
		int cont=0;
		
		while(true) {
			if(cont ==10) {
				System.out.println("parada nº: "+cont);
				break;
			}
			System.out.println("i: "+cont);
			cont++;
		}
	}
	
	
}
