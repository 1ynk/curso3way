package br.soma.estatica;

public class TresTiposDeVariaveis {
	
	static String staticVariable = "variavel de classe, ou estatica";
	
	String instanceVariable = "Variavel de instalcia";
	
	public static void main(String[] args) {
		TresTiposDeVariaveis instanceVariable = new TresTiposDeVariaveis();
		String localVariable = "variavel local";
		
		System.out.println("variavel estatica: "+staticVariable);
		System.out.println("variavel de instancia: "+instanceVariable);
		System.out.println("variavel local: "+localVariable);
	}

}
