package br.com.projeto.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="produtos")
@Data
@NoArgsConstructor
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	@ManyToMany(mappedBy = "produtos")
	private List<Pedido> pedidos;

	public Produto(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

}
