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
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro + ", cep=" + cep + ", municipio=" + municipio
				+ ", estado=" + estado + ", pais=" + pais + "]";
	}
}
