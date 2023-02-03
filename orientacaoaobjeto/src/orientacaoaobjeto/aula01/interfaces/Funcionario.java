package orientacaoaobjeto.aula01.interfaces;

public class Funcionario implements Descontos, Bonus{
	private String nome;
	private Double salario;
	
	public Funcionario(String nome,Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome +" salário: "+salario+"]";
	}

	@Override
	public Double descontoFGTS(Double salario) {
		
		return salario * 0.08;
	}

	@Override
	public Double descontoValeTransporte(Double salario) {
		
		return salario * 0.06;
	}

	@Override
	public Double bonusAnual(Double salario) {
		
		return salario * 3;
	}

	@Override
	public Double bonusDeMeta(Double salario) {
		
		return salario * 0.5;
	}
}
