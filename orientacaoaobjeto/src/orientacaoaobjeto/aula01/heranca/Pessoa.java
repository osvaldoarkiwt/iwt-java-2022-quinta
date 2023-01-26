package orientacaoaobjeto.aula01.heranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Pessoa {
	
	private String nome;
	private LocalDate dataDeNascimento;
	private String endereco;
	private String telefone;
	
	public Pessoa() {}
	
	public Pessoa(String nome, LocalDate dataDeNascimento, String endereco, String telefone) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yy");
		
		String nascimento = dataDeNascimento.format(dataFormatada);
		
		return nascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {
		
		LocalDate hoje = LocalDate.now();
		
		return (int) dataDeNascimento.until(hoje, ChronoUnit.YEARS);
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public abstract String toString();
}
