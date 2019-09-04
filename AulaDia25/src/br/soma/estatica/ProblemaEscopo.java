package br.soma.estatica;

public class ProblemaEscopo {
	public static void main(String[] args) {
		
		int var1 = 10;
		int var2;
		
		if(var1<100) {
			 var2 = 20;
		}else {
			 var2 = 21;
		}
		System.out.println("valor de var1: "+var1);
		
		System.out.println("valor var2: "+var2);
	}

}
