package br.arrays;

import java.util.ArrayList;
import java.util.Collections;



public class Ordenar {
	
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("AA");
		arraylist.add("ZZ");
		arraylist.add("CC");
		arraylist.add("FF");
		
		for (String string : arraylist) {
			System.out.println(string);
		}
		System.out.println("---------------------------------------------------");
		Collections.sort(arraylist, Collections.reverseOrder());
		
		for (String str : arraylist) {
			System.out.println(str);
		}
	}

}
