package br.projeto.service.dao;

public class MainObter {
	public static void main(String[] args) {

		//testarObter();
		testarUpdate();

	}

	private static void testarObter() {
		Cliente cliente = new Cliente();
		cliente.setSenha("teste2");
		cliente.setLogin("teste1");

		ClientesDao dao = new ClientesDao();
		Cliente clienteRetorno = dao.obter(cliente);

		System.out.println(dao.obter(cliente));
	}

	public static void testarUpdate() {

		Cliente cliente = new Cliente();

		cliente.setNome("D A N I E L");
		cliente.setLogin("teste1");
		cliente.setSenha("teste2");
		cliente.setEndereco("avenida pulo do gato doido");
		cliente.setCidade("Cidade %%%%%");
		cliente.setBairro("Bairo??");
		cliente.setEstado("Teste6");
		cliente.setCep("teste7");
		cliente.setCodigo(5);

		ClientesDao dao = new ClientesDao();

		dao.alterar(cliente);
	}

}
