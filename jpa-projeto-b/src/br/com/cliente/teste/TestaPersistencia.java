package br.com.cliente.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cliente.Cliente;

public class TestaPersistencia {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-projeto-b");
		EntityManager entityManager = factory.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fulano");
		cliente.setProfissao("ATOA");
		
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		
		List<Cliente> todosClientesJPA = entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
		for(Cliente clienteLaco : todosClientesJPA) {
			System.out.println(clienteLaco);
		}
	}

}
