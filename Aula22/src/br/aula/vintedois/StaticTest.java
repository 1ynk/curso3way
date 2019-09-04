package br.aula.vintedois;

public class StaticTest {
	public static void main(String[] args) {
		Carrim fusca = new Carrim();
		Carrim ferrari = new Carrim();
		Carrim jipe = new Carrim();
		
		System.out.println(Carrim.contadorObjetos);
		}

}
