package orientacaoaobjeto.aula01.interfaces02.exercicio;

public class Kelvin implements Escala{

	@Override
	public double transformar(double celsius) {
		
		return celsius + 273;
	}

}
