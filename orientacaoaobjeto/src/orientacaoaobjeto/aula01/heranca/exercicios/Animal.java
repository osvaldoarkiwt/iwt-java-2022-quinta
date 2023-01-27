package orientacaoaobjeto.aula01.heranca.exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Animal {

	private String nome;
	private LocalDate dataDeNascimento;
	private String raca;
	
	public Animal() {}
	
	public Animal(String nome, LocalDate dataDeNascimento, String raca) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade() {
		return (int) dataDeNascimento.until(LocalDate.now(),ChronoUnit.YEARS);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public abstract String toString();
}
