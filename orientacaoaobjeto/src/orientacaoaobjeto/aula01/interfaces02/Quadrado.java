package orientacaoaobjeto.aula01.interfaces02;

public class Quadrado implements Figura{

	@Override
	public int perimetro(int lado) {
		return lado*4;
	}

}
