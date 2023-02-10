package orientacaoaobjeto.aula01.interfacesFuncionais.generics;

public class Kelvin implements Escala<Double>{

	@Override
	public Double transformar(Double celsius) {
		
		return celsius + 273;
	}

}
