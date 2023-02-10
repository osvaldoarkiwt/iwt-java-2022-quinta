package orientacaoaobjeto.aula01.interfacesFuncionais.exercicio;

public class MudancaEscalaTermica {

	public static void main(String[] args) {
	
		Escala fahrenheit = c -> c * 1.8 + 32;
		Escala kelvin = c -> c + 273;
		
		System.out.println(executa(fahrenheit,30));
		System.out.println(executa(kelvin,30));

	}

	public static double executa(Escala escala, double celsius) {
		return escala.transforma(celsius);
	}
}
