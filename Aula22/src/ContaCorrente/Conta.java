package ContaCorrente;

public class Conta {
	public String titular = "Daniel";
	public double numeroConta = 0471;
	public double saldo = 1000;

	public double depositar(double valorDeposito) {
		return this.saldo = valorDeposito + saldo;
	}

	public double sacar(double valorSaque) {
		return this.saldo = saldo - valorSaque;
	}

	public void transferir() {

	}
}
