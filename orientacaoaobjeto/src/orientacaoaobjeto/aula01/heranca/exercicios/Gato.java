package orientacaoaobjeto.aula01.heranca.exercicios;

import java.time.LocalDate;

public class Gato extends Animal {

	private String corDoPelo;
	private String comidaFavorita;
	private String odeia;
	
	public Gato() {}

	public Gato(String nome, LocalDate dataDeNascimento, String raca,String corDoPelo,String comidaFavorita,String odeia) {
		super(nome, dataDeNascimento, raca);
		this.corDoPelo = corDoPelo;
		this.comidaFavorita = comidaFavorita;
		this.odeia = odeia;
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	public String getComidaFavorita() {
		return comidaFavorita;
	}

	public void setComidaFavorita(String comidaFavorita) {
		this.comidaFavorita = comidaFavorita;
	}

	public String getOdeia() {
		return odeia;
	}

	public void setOdeia(String odeia) {
		this.odeia = odeia;
	}

	@Override
	public String toString() {
		return "gato [corDoPelo=" + corDoPelo + ", comidaFavorita=" + comidaFavorita + ", odeia=" + odeia
				+ ", getNome()=" + getNome() + ", getDataDeNascimento()=" + getDataDeNascimento() + ", getIdade()="
				+ getIdade() + ", getRaca()=" + getRaca() + "]";
	}
}
