package orientacaoaobjeto.aula01.construtoresEEncapsulamento.exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Funcionario {
	
	private String nome;
	private LocalDate dataDeNascimento;
	private Endereco endereco;
	private Contato contato;
	private String funcao;
	private Double salario;
	private Integer jornadaDeTrabalho;
	
	public Funcionario() {}

	public Funcionario(String nome, LocalDate dataDeNascimento, Endereco endereco, Contato contato, String funcao,
			Double salario, Integer jornadaDeTrabalho) {
		
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.contato = contato;
		this.funcao = funcao;
		this.salario = salario;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}

	public void setJornadaDeTrabalho(Integer jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}

	public int getIdade() {
		
		LocalDate hoje = LocalDate.now();
		
		int idadeFuncionario = (int) dataDeNascimento.until(hoje, ChronoUnit.YEARS);
		
		return idadeFuncionario;
	}
	
	public double descontarFalta(int numeroDeFaltas) {
		
		double diaria = this.salario/ 30;
		
		return this.salario-=(diaria*numeroDeFaltas);
		
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento +" idade: "+getIdade()+ ", endereco=" + endereco
				+ ", contato=" + contato + ", funcao=" + funcao + ", salario=" + salario + ", jornadaDeTrabalho="
				+ jornadaDeTrabalho + "]";
	}
}
