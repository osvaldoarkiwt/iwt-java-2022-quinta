package orientacaoaobjeto.aula01.colecoes.listas;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	
	private Integer idade;
	
	private Character tipoSanguineo;

	public Pessoa() {};
	
	public Pessoa(String nome, Integer idade, Character tipoSanguineo) {
		
		this.nome = nome;
		this.idade = idade;
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Character getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(Character tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, tipoSanguineo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(tipoSanguineo, other.tipoSanguineo);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", tipoSanguineo=" + tipoSanguineo + "]";
	}

	@Override
	public int compareTo(Pessoa o) {
		
		return this.getNome().compareTo(o.getNome());
	}
}
