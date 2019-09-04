package br.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Arrays {
	
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Stack");
		lista.add("overflow");
		
		for (String string : lista) {
			System.out.println(string);
		}
		
		String str1 = lista.get(1);
		System.out.println(str1);
		
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "teste");
		hashmap.put(5, "teste2");
		
		
		
	}

}
