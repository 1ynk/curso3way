package br.com.jpa.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jpa.Pessoa;

public class TestaPersistenceXML {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoJpa");
		EntityManager entityManager = factory.createEntityManager();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("73573787134");
		pessoa.setNome("Fulano de Tal");
		
		entityManager.getTransaction().begin();
		entityManager.persist(pessoa);
		entityManager.getTransaction().commit();
		
		List<Pessoa> todasPessoasJPA = entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();
		
		for (Pessoa pessoaLaco : todasPessoasJPA) {
			System.out.println(pessoaLaco);
		}
	}

}
