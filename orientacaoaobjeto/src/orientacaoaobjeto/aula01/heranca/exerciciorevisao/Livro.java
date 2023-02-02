package orientacaoaobjeto.aula01.heranca.exerciciorevisao;

import java.time.LocalDate;

public class Livro extends Publicacao{

	private String autor;
	private String edicao;
	
	public Livro(String titulo, LocalDate dataDeLancamento, Double preco,
			String autor, String edicao) {
		super(titulo, dataDeLancamento, preco);
		this.autor = autor;
		this.edicao = edicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", edicao=" + edicao + ", getAutor()=" + getAutor() + ", getEdicao()="
				+ getEdicao() + "]";
	}
}
