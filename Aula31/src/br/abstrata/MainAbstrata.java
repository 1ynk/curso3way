package br.abstrata;

public class MainAbstrata {
	
	public static void main(String[] args) {
		ContaPoupanca cta = new ContaPoupanca();
		
		cta.setSaldo(50);
		
		cta.imprimeExtrato();
		
	}
	

}
