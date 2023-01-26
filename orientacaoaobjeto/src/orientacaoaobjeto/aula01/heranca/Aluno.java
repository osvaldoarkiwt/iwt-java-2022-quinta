package orientacaoaobjeto.aula01.heranca;

import java.time.LocalDate;

public class Aluno extends Pessoa{
	
	private String matricula;
	private String curso;

	public Aluno() {}
	
	public Aluno(String matricula,String nome,LocalDate dataDeNascimento,
								String endereco,String contato,String curso) {
		super(nome,dataDeNascimento,endereco,contato);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + ", nome=" + getNome()
				+ ", Data de nascimento=" + getDataDeNascimento() + ", idade=" + getIdade() + ", endereco="
				+ getEndereco() + ", telefone=" + getTelefone() + "]";
	}
}
