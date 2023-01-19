package orientacaoaobjeto.aula01.construtoresEEncapsulamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estudante {

	private String nome;
	private LocalDate dataDeNascimento;
	private Endereco endereco;
	private Contato contato;
	private List<Curso> cursos = new ArrayList<>();
	
	public Estudante(String nome, LocalDate dataDeNascimento, Endereco endereco, Contato contato, List<Curso> cursos) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.contato = contato;
		this.cursos = cursos;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Contato getContato() {
		return this.contato;
	}
	
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public List<Curso> getCursos() {
		return this.cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public String cursoString() {
		String cursosString="[ ";
		
		for(Curso curso : cursos) {
			cursosString+=curso.nome+" "+curso.turno+" "+curso.cargaHoraria+" ";
		}
		
		return cursosString+=" ]";
	}
	
	public String toString() {
		return "Estudante \n-nome: "+nome+"\n-data de aniversário: "+
				dataDeNascimento+"\n"+
				endereco.toString()+"\n"+
				contato.toString()+
				"\n-cursos:\n "+
				cursoString();
	}
}
