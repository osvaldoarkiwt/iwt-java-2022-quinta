package orientacaoaobjeto.aula01.construtoresEEncapsulamento;

import java.time.LocalDate;

public class Curso {

	String nome;
	String turno;
	int cargaHoraria;
	LocalDate comeco;
	LocalDate fim;
		
	{
		//this.fim = this.comeco.plusMonths(this.cargaHoraria /16);
	}
	
	public Curso() {}
	
	public Curso(String nome, String turno, int cargaHoraria, LocalDate comeco) {
		this.nome = nome;
		this.turno = turno;
		this.cargaHoraria = cargaHoraria;
		this.comeco = comeco;
		this.fim = this.comeco.plusMonths(this.cargaHoraria /16);
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", turno=" + turno + ", cargaHoraria=" + cargaHoraria + ", comeco=" + comeco
				+ ", fim=" + fim + "]";
	}
}
