package orientacaoaobjeto.aula01.interfacesFuncionais.generics;


public class Teste {

	public static void main(String[] args) {
		
		Escala<Double> f = new Fahrenheit();
		Escala<Double> k = new Kelvin();
		
		Escala<Double> fahrenheit = c -> c * 1.8 + 32;
		Escala<Double> kelvin = c -> c + 273;
		
		System.out.println("fahrenheit: "+f.transformar(24.0));
		System.out.println("kelvin: "+k.transformar(24.0));
		System.out.println(executa(fahrenheit,24.0));
		System.out.println(executa(kelvin,24.0));

	}
	
	public static Double executa(Escala<Double>escala,Double celsius) {
		return escala.transformar(celsius);
	}
}
