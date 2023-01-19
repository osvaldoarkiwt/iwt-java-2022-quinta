package orientacaoaobjeto.aula01.construtoresEEncapsulamento;

public class Endereco {
	
	String logradouro;
	String bairro;
	String cep;
	String municipio;
	String estado;
	String pais;
		
	public Endereco(String logradouro, String bairro, String cep, String municipio, String estado, String pais) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.municipio = municipio;
		this.estado = estado;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro + ", cep=" + cep + ", municipio=" + municipio
				+ ", estado=" + estado + ", pais=" + pais + "]";
	}
}
