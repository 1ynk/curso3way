package br.enumm;

public class Calculadora {

	public static void main(String[] args) throws Exception {
		Double nota1 = 5.0;
		Double nota2 = 3.0;

		System.out.println(Calculadora.calculaMedia(nota1, nota2));
	}

	public static Double calculaMedia(Double x, Double y) throws Exception {
		Double media = (x + y) / 2;
		if (media < 6) {
			
			throw new Exception("Criando exceção com Throws");
		}
		return media;
	}
}
