package br.carros;

public class Carro {
	private int ano;
	private String cor;
	private String modelo;
	private String placa;
	private static int contador;

	boolean ligado = false;

	public Carro(String modelo, String cor, int ano, String placa) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;
	}
	
	public void print(String msg) {
		System.out.println(msg);
		print();
	}
	
	public void print() {
		System.out.println();
		System.out.println("Carro de placa: "+placa);
		System.out.println("cor: "+cor);
		System.out.println("modelo: "+modelo);
		System.out.println("ano: "+ano);
	}
	
	
	
	
	public void ligar(String nome) {
		System.out.println(nome+"o carro está ligando");
	}
	

	public void frear() {
		System.out.println("freando");
	}

	public void acelerar() {
		System.out.println("acelerando");
	}
	public static int getContadorInstancia() {
		return contador;
	}

}
