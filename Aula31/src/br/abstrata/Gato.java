package br.abstrata;

public class Gato extends Animal{
	
	public Gato() {
		super("Miau");
	}
	
	public void fazerRuido() {
		System.out.println("Miar= "+this.getRuido());
	}
	
	public void comer() {
		System.out.println("come rato");
	}

}
