package orientacaoaobjeto.aula01.atributosEmetodos.exercicios.estudante;

import java.time.LocalDate;
import java.util.Objects;

public class Curso {

	String nome;
	String turno;
	int cargaHoraria;
	LocalDate comeco;
	LocalDate fim;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cargaHoraria, comeco, fim, nome, turno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return cargaHoraria == other.cargaHoraria && Objects.equals(comeco, other.comeco)
				&& Objects.equals(fim, other.fim) && Objects.equals(nome, other.nome)
				&& Objects.equals(turno, other.turno);
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", turno=" + turno + ", cargaHoraria=" + cargaHoraria + ", comeco=" + comeco
				+ ", fim=" + fim + "]";
	}
}
