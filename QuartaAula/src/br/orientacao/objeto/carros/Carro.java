package br.orientacao.objeto.carros;

public class Carro {
	public String ano;
	public String cor;
	public String modelo;
	public String placa;

	boolean ligado = false;
	
	public String ligar() {
		String x;
		if(ligado==false) {
			ligado=true;
			x = "carro ligado";
			
		}else {
			x="carro ja ligado";
		}
	
		return x;
	}
	
	public void frear() {
		System.out.println("freando");
	}
	
	public void acelerar() {
		System.out.println("acelerando");
	}
	
	

}
