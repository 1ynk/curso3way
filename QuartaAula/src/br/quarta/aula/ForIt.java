package br.quarta.aula;

public class ForIt {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,100};
		
		for(int i : a) {
			System.out.println(i);
		}
		System.out.printf("ultima posição: "+a[a.length - 1]);
	}

}
