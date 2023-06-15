package app.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.projeto.app.model.Cliente;
import br.com.projeto.app.model.embedded.Endereco;

public class ClienteTest extends InicioTest{

	@Test
	public void testaCliente() {
		
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro("bezerra de menezes");
		endereco.setNumero("1024");
		endereco.setBairro("São Gerardo");
		endereco.setCep("60325000");
		endereco.setCidade("Fortaleza");
		endereco.setEstado("Ceará");
		endereco.setPais("Brasil");
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Paulo");
		cliente.setEndereco(endereco);
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(cliente);
		
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Cliente clienteResposta = (Cliente) entityManager.find(Cliente.class, cliente.getId());
		
		Assert.assertNotNull(clienteResposta);
	}	
}
