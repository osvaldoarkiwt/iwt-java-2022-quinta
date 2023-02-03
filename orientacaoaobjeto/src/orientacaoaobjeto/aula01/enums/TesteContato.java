package orientacaoaobjeto.aula01.enums;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato c01 = new Contato("32346161",TelefoneEnum.FIXO);
		
		System.out.println(c01.getTipoDeTelefone().getId());
		
	}

}
