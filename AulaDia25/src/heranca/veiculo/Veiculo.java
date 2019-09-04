package heranca.veiculo;

public class Veiculo {
	
	private String cor;
	private int ano;
	private String id;
	
	public Veiculo(String cor, int ano, String id) {
		this.cor = cor;
		this.ano = ano;
		this.id = id;
		System.out.println("Objeto veiculo criado!");
	}
	public void mover() {
		System.out.println("movendo");
	}

}
