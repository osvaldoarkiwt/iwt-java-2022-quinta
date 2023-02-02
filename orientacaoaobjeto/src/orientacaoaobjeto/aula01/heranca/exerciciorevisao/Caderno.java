package orientacaoaobjeto.aula01.heranca.exerciciorevisao;

public class Caderno {
	
	private String nome;
	private Integer numeroDePaginas;
	
	public Caderno(String nome, Integer numeroDePaginas) {
		this.nome = nome;
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(Integer numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
}
