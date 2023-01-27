package orientacaoaobjeto.aula01.heranca.exercicios;

import java.time.LocalDate;

public class Cachorro extends Animal{

	private Integer numeroPatas;
	private Integer numeroVacinas;
	private String gostaDe;
	
	public Cachorro() {}

	public Cachorro(String nome, LocalDate dataDeNascimento, String raca,Integer numeroPatas, Integer numeroVacinas, String gostaDe) {
		super(nome,dataDeNascimento,raca);
		this.numeroPatas = numeroPatas;
		this.numeroVacinas = numeroVacinas;
		this.gostaDe = gostaDe;
	}

	public Integer getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(Integer numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public Integer getNumeroVacinas() {
		return numeroVacinas;
	}

	public void setNumeroVacinas(Integer numeroVacinas) {
		this.numeroVacinas = numeroVacinas;
	}

	public String getGostaDe() {
		return gostaDe;
	}

	public void setGostaDe(String gostaDe) {
		this.gostaDe = gostaDe;
	}

	@Override
	public String toString() {
		return "Cachorro [numeroPatas=" + numeroPatas + ", numeroVacinas=" + numeroVacinas + ", gostaDe=" + gostaDe
				+ ", getNome()=" + getNome() + ", getDataDeNascimento()=" + getDataDeNascimento() + ", getIdade()="
				+ getIdade() + ", getRaca()=" + getRaca() + "]";
	}
}
