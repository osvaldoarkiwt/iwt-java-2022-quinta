package orientacaoaobjeto.aula01.interfaces02.exercicio;

public class Teste {

	public static void main(String[] args) {
		
		Escala f = new Fahrenheit();
		
		Escala k = new Kelvin();
		
		System.out.println("fahrenheit: "+f.transformar(24));
		System.out.println("kelvin: "+k.transformar(24));

	}
}
