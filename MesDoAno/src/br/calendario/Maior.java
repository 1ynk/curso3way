package br.calendario;

public class Maior {
	public static void main(String[] args) {
		int x=10, y=9, z=8;
		
		if(x>y && x>z) {
			System.out.println("maior: x= "+x);
		}else if (y>x && y>z) {
			System.out.println("maior: y= "+y);
		}else {
			System.out.println("maior: z= "+z);
		}
	}

}
