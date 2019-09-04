package br.aula.vintedois;

public class Carrim {
	public static int contadorObjetos;
	
	Carrim(){
		contadorObjetos++;
		System.out.println("Objeto criado, existem: "+contadorObjetos+" objetos dessa classe");
	}

}
