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

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public LocalDate getComeco() {
		return comeco;
	}

	public void setComeco(LocalDate comeco) {
		this.comeco = comeco;
	}

	public LocalDate getFim() {
		return fim;
	}

	public void setFim(LocalDate fim) {
		this.fim = fim;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", turno=" + turno + ", cargaHoraria=" + cargaHoraria + ", comeco=" + comeco
				+ ", fim=" + fim + "]";
	}
}
