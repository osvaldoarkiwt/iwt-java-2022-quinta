package orientacaoaobjeto.aula01.enums.exercicio;

public class Funcionario {
	
	private String nome;
	private VinculoEnum vinculo;
	
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

	public void setVinculo(VinculoEnum vinculo) {
		this.vinculo = vinculo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", vinculo=" + vinculo.getDescricao() + "]";
	}
}
