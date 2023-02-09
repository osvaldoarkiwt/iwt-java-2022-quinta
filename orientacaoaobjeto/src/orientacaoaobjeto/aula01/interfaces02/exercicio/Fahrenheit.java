package orientacaoaobjeto.aula01.interfaces02.exercicio;

public class Fahrenheit implements Escala{

	@Override
	public double transformar(double celsius) {
		
		return  celsius * 1.8 + 32;
	}
}
