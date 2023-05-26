package br.com.projeto.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.projeto.app.model.Produto;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");

		EntityManager em = factory.createEntityManager();
		
		Produto produto = new Produto();
		
		em.persist(produto);
		
		em.close();
		
	}
}
