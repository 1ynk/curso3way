package heranca.veiculo;

public class TesteCarro {
	public static void main(String[] args) {
		String cor = null;
		int ano = 0;
		String id =null;
		String modelo=null;
		
		Veiculo veiculo = new Veiculo(cor, ano, id);
		
		Carro carro = new Carro(cor, ano, id, modelo);
		
		veiculo.mover();
		carro.mover();
	}

}
