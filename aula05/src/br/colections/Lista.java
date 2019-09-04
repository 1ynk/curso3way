package br.colections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<String> listaString = new ArrayList<>();
		
		listaString.add("cotrato");
		listaString.add("documento");
		listaString.add("nota fiscal");
		
		System.out.println(listaString+",tamanho: "+listaString.size());
		
		listaString.remove("documento");
		System.out.println(listaString+",tamanho: "+listaString.size());
		
		Boolean contem = listaString.contains("nota fiscal");
		System.out.println("A lista contem nota fiscal?\n "+contem);
	}

}
