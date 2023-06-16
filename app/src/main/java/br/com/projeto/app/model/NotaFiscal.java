package br.com.projeto.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="nota_fiscal")
@Data
public class NotaFiscal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private Double preco;
	
	@OneToOne(mappedBy = "notaFiscal")
	private Pedido pedido;
}
