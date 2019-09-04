package heranca.veiculo;

public class Carro extends Veiculo{
	
	private String modelo;
	
	public Carro(String cor, int ano, String id, String modelo) {
		super(cor, ano, id);
		this.modelo = modelo;
		System.out.println("Objeto carro criado!");
	}
	@Override
	public void mover() {
		System.out.println("correr");
	}

}
