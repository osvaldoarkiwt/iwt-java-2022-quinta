package escola.model;

import java.time.LocalDate;
import java.util.Objects;

public class Aluno {
	
	private Long id;
	
	private String nome;
	
	private LocalDate dataDeNascimento;
	
	private String endereco;
	
	public Aluno() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataDeNascimento, endereco, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataDeNascimento, other.dataDeNascimento) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", endereco="
				+ endereco + "]";
	}
}
