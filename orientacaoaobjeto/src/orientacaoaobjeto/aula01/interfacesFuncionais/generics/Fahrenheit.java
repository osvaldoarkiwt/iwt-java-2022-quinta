package orientacaoaobjeto.aula01.interfacesFuncionais.generics;

public class Fahrenheit implements Escala<Double>{

	@Override
	public Double transformar(Double celsius) {
		
		return  celsius * 1.8 + 32;
	}
}
