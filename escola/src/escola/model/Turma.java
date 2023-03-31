package escola.model;

import java.util.List;
import java.util.Objects;

public class Turma {

	private Professor professor;
	
	private Curso curso;
	
	private List<Aluno> alunos;
	

	public Turma() {}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public List<Aluno> getAlunos() {
		return alunos;
	}


	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(alunos, curso, professor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		return Objects.equals(alunos, other.alunos) && Objects.equals(curso, other.curso)
				&& Objects.equals(professor, other.professor);
	}


	@Override
	public String toString() {
		return "Turma [professor=" + professor + ", curso=" + curso + ", alunos=" + alunos + "]";
	}
}
