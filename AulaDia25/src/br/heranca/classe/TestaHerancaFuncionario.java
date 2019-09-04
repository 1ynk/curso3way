package br.heranca.classe;

public class TestaHerancaFuncionario {
	public static void main(String[] args) {
		Secretario secretario = new Secretario();
		Engenheiro engeheiro = new Engenheiro();
		Diretor diretor = new Diretor();
		Gerente gerente = new Gerente();
		
		System.out.println("eng: "+engeheiro.nome);
		System.out.println("secr:"+secretario.nome);
		System.out.println("dir: "+diretor.nome);
		System.out.println("ger: "+gerente.nome);
	}

}
