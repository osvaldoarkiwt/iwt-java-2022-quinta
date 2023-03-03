package orientacaoaobjeto.aula01.colecoes.listas.set.exercicio;

import java.util.Objects;

public class Estudante implements Comparable<Estudante>{
	private Long id;
	private String nome;
	private Integer idade;
	private String curso;
	
	public Estudante(Long id, String nome, Integer idade, String curso) {

		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
	}

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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso, id, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		return Objects.equals(curso, other.curso) && Objects.equals(id, other.id) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Estudante [id=" + id + ", nome=" + nome + ", idade=" + idade + ", curso=" + curso + "]";
	}

	@Override
	public int compareTo(Estudante o) {
		
		return this.nome.compareToIgnoreCase(o.getNome());
	}
}
