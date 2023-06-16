package br.com.projeto.app.model.enums;

public enum PedidoStatus {
	
	CANCELADO("cancelado"),
	EFETUADO("efetuado"),
	PAGO("pago"),
	PENDENTE("pendente");
	
	private String descricao;
	
	private PedidoStatus(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
