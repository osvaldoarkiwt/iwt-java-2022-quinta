package orientacaoaobjeto.aula01.construtoresEEncapsulamento;

import java.time.LocalDate;

public class Curso {

	String nome;
	String turno;
	int cargaHoraria;
	LocalDate comeco;
	LocalDate fim;
	
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", turno=" + turno + ", cargaHoraria=" + cargaHoraria + ", comeco=" + comeco
				+ ", fim=" + fim + "]";
	}
}
