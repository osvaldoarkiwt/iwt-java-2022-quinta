package br.com.projeto.app.model.embedded;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Endereco {
	
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private String pais;
}
