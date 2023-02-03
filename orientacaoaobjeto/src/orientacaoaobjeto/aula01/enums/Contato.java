package orientacaoaobjeto.aula01.enums;

public class Contato {

	private String telefone;
	private TelefoneEnum tipoDeTelefone;
	
	public Contato(String telefone, TelefoneEnum tipoDeTelefone) {
		
		this.telefone = telefone;
		this.tipoDeTelefone = tipoDeTelefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TelefoneEnum getTipoDeTelefone() {
		return tipoDeTelefone;
	}

	public void setTipoDeTelefone(TelefoneEnum tipoDeTelefone) {
		this.tipoDeTelefone = tipoDeTelefone;
	}

	@Override
	public String toString() {
		return "Contato [telefone=" + telefone + ", tipoDeTelefone=" + tipoDeTelefone + "]";
	}
}
