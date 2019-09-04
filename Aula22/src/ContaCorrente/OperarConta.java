package ContaCorrente;

import java.util.Scanner;

public class OperarConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do depósito: ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		
		System.out.println("Digite o valor do saque: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		
		System.out.printf("A conta pertencente a: %s possui R$: %.2f",conta.titular,conta.saldo);
	}

}
