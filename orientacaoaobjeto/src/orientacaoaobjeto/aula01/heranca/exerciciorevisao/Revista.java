package orientacaoaobjeto.aula01.heranca.exerciciorevisao;

import java.time.LocalDate;

public class Revista extends Publicacao{

	private Integer ano;
	private String nicho;
	private String editora;
	
	public Revista(String titulo, LocalDate dataDeLancamento, 
			Double preco,Integer ano,String nicho,String editora) {
		super(titulo, dataDeLancamento, preco);
		
		this.ano = ano;
		this.nicho = nicho;
		this.editora = editora;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getNicho() {
		return nicho;
	}

	public void setNicho(String nicho) {
		this.nicho = nicho;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Revista [ano=" + ano + ", nicho=" + nicho + ", editora=" + editora + ", getTitulo()=" + getTitulo()
				+ ", getDataDeLancamento()=" + getDataDeLancamento() + ", getPreco()=" + getPreco() + "]";
	}
}
