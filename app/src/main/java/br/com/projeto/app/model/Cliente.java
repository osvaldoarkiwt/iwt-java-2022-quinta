package br.com.projeto.app.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.projeto.app.model.embedded.Endereco;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
@ToString
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Embedded
	private Endereco endereco;
	
	@OneToMany(mappedBy = "cliente")
	List<Pedido> pedidos;
}
