package orientacaoaobjeto.aula01.heranca.exerciciorevisao;

import java.time.LocalDate;
import java.util.List;

public class Jornal extends Publicacao{

	private List<Caderno> sessoes;

	public Jornal(String titulo, LocalDate dataDeLancamento, Double preco,List<Caderno> sessoes) {
		super(titulo, dataDeLancamento, preco);
		this.sessoes = sessoes;
	}

	public List<Caderno> getSessoes() {
		return sessoes;
	}

	public void setSessoes(List<Caderno> sessoes) {
		this.sessoes = sessoes;
	}

	@Override
	public String toString() {
		return "Jornal [sessoes=" + sessoes + ", getTitulo()=" + getTitulo() + ", getDataDeLancamento()="
				+ getDataDeLancamento() + ", getPreco()=" + getPreco() + "]";
	}
}
