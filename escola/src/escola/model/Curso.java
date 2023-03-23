package escola.model;

import java.util.List;
import java.util.Objects;

public class Curso {

	private Long id;
	
	private String nome;
	
	private Professor professor;
	
	private List<Aluno> alunos;
	
	public Curso() {}

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

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alunos, id, nome, professor);
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
		return Objects.equals(alunos, other.alunos) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(professor, other.professor);
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", professor=" + professor + ", alunos=" + alunos + "]";
	}
}
