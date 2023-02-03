package orientacaoaobjeto.aula01.enums.exercicio;

import java.time.LocalDate;

public enum VinculoEnum {
	CARTEIRA_ASSINADA(1,"carteira assinada"),
	PESSOA_JURIDICA(2,"pessoa jurídica"),
	EIRELI(3,"eireli"),
	MEI(4,"micro empresário"),
	DIARISTA(5,"diarista");
	
	private Integer id;
	private String descricao;
	
	private VinculoEnum(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
