package orientacaoaobjeto.aula01.heranca.exerciciorevisao;

import java.time.LocalDate;

public abstract class Publicacao {
	
	private String titulo;
	private LocalDate dataDeLancamento;
	private Double preco;
	
	public Publicacao(String titulo, LocalDate dataDeLancamento, Double preco) {
		this.titulo = titulo;
		this.dataDeLancamento = dataDeLancamento;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(LocalDate dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public abstract String toString();
}
