package app.testes;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import br.com.projeto.app.model.Cliente;
import br.com.projeto.app.model.NotaFiscal;
import br.com.projeto.app.model.Pedido;
import br.com.projeto.app.model.Produto;
import br.com.projeto.app.model.enums.PedidoStatus;

public class PedidoTest extends InicioTest{

	@Test
	public void testaPedido() {
		
		Cliente clienteBanco = entityManager.find(Cliente.class, 1L);
		
		NotaFiscal nf = entityManager.find(NotaFiscal.class, 1L);
		
		Produto produto01 = entityManager.find(Produto.class, 1L);
		Produto produto02 = entityManager.find(Produto.class, 2L);
		Produto produto03 = entityManager.find(Produto.class, 3L);
		
		Pedido pedido = new Pedido();
		
		pedido.setStatus(PedidoStatus.EFETUADO);
		
		pedido.setCliente(clienteBanco);
		
		pedido.setNotaFiscal(nf);
		
		pedido.setProdutos(Arrays.asList(produto01,produto02,produto03));
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(pedido);
		
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Pedido pedidoResposta = (Pedido) entityManager.find(Pedido.class, pedido.getCodigo());
		
		Assert.assertNotNull(pedidoResposta);
	}
}
