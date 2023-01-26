package orientacaoaobjeto.aula01.heranca;

import java.time.LocalDate;

public class Professor extends Pessoa{

	private String matricula;
	private Double valorHoraAula;
	private Integer cargaHoraria;
	
	public Professor() {}
	
	public Professor(String matricula,String nome, LocalDate dataDeAniversario,String endereco,String contato,Double valorHoraAula,Integer cargaHoraria) {
		super(nome,dataDeAniversario, endereco, contato);
		
		this.matricula = matricula;
		this.valorHoraAula = valorHoraAula;
		this.cargaHoraria = cargaHoraria;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(Double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Double getSalario() {
		return valorHoraAula * cargaHoraria;
	}

	@Override
	public String toString() {
		return "Professor [matricula=" + matricula + ", nome=" + getNome() +", data de nascimento="+getDataDeNascimento()+", idade"+getIdade()+", endereco=" + getEndereco() + ", telefone="
				+ getTelefone() + ", valorHoraAula=" + valorHoraAula + ", cargaHoraria="
						+ cargaHoraria + "]";
	}
}
