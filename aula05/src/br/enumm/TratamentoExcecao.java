package br.enumm;

public class TratamentoExcecao {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4 };

		try {
			System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exce��o lan�ada: " + e);
			e.printStackTrace();
		}
	}
}
