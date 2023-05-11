package br.com.projetoservlet.model;

import java.util.Objects;

public class Aluno {

	private Long id;
	private String nome;
	private Integer idade;
	private String endereco;
	private String curso;
	private String turno;
	
	public Aluno() {}

	public Aluno(String nome, Integer idade, String endereco, String curso, String turno) {
		
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.curso = curso;
		this.turno = turno;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso, endereco, idade, nome, turno);
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
		return Objects.equals(curso, other.curso) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(turno, other.turno);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", curso=" + curso + ", turno="
				+ turno + "]";
	}
}
