package br.enumm;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Trata {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		InputStreamReader leitor = new InputStreamReader(System.in);
		
		int[] array = {1,2,3,4};
		try {
			Character ch = (char) leitor.read();
			
			int i = Integer.parseInt(ch.toString());
			ps.println(array[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			ps.printf("indice fora do limite[0...3]: %s\\n",e.getMessage());
		}catch(NumberFormatException e) {
			ps.printf("errp de cpnversao : %s\n", e.getMessage());
		}catch(IOException e) {
			ps.printf("Erro Entrada/saida: %s\n", e.getMessage());
		}finally {
			ps.println("sempre passo aqui para fechar todos os recursos");
		}
	}

}
