package br.aula.vintedois;

public class MainMetodos {
	public static void main(String[] args) {
		
		ImprimeString imprime = new ImprimeString();
		
		System.out.println(imprime.retornaMetodo());
		imprime.imprimeMetodo();
		String recebeRetorno = imprime.retornaMetodo();
	}

}
