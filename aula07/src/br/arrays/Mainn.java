package br.arrays;

class Mainn {
	public static void main(String[] args) {
		Test <Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());
		
		Test<String> sObj = new Test<String>("GeeksforGeeks");
		
		//demonstração de a classe generica recebe varios tipos
	}
}
