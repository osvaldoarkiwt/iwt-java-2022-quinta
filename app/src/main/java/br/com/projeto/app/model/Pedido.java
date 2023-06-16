package br.com.projeto.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.projeto.app.model.enums.PedidoStatus;
import lombok.Data;

@Entity
@Table(name="pedidos")
@Data
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Enumerated(EnumType.STRING)
	private PedidoStatus status;
	
	@OneToOne
	@JoinColumn(name="notafiscal_codigo")
	private NotaFiscal notaFiscal;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@ManyToMany
	@JoinTable(name="pedido_produto",
				joinColumns = @JoinColumn(name = "pedido_id"),
				inverseJoinColumns = @JoinColumn(name = "produto_id"))
	List<Produto> produtos;	
}
