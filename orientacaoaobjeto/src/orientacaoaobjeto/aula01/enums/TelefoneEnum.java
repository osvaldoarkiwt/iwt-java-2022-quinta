package orientacaoaobjeto.aula01.enums;

public enum TelefoneEnum {
	
	FIXO(1l),CELULAR(2l),RECADO(3l),TRABALHO(4l);
	
	private Long id;
	
	private TelefoneEnum(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}
}
