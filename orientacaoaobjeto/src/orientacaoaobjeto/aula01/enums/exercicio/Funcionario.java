package orientacaoaobjeto.aula01.enums.exercicio;

/*
 * Classe funcionário 
 * 
 * autor: Osvaldo Souza
 * 
 * versão: 1.0
 * 
 * */
//TODO criar uma interface que contenha os métodos de calculo
//de salário através da frequência do funcionário.
public class Funcionario {
	
	private String nome;
	private VinculoEnum vinculo;
	//TODO modificar o construtor para receber o id do enum.
	public Funcionario(String nome, VinculoEnum vinculo) {
		this.nome = nome;
		this.vinculo = vinculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVinculo() {
		return vinculo.getDescricao();
	}
	//TODO modificar o método para receber o id do enum.
	public void setVinculo(VinculoEnum vinculo) {
		this.vinculo = vinculo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", vinculo=" + vinculo.getDescricao() + "]";
	}
}
