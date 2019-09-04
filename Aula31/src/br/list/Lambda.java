package br.list;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {

		System.out.println("Impressao de todos os elementos da lista!");

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		for (Integer n : list) {
			System.out.println(n);
		}

		System.out.println("imprime todos os elementos da lista! novamente");

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		list.forEach(n -> System.out.println(n));
	}

}
