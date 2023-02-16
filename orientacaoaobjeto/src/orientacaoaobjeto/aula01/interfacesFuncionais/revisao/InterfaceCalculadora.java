package orientacaoaobjeto.aula01.interfacesFuncionais.revisao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc01 = new Soma();
		
		Calculadora calc02 = new Subtracao();
		
		Calculadora calc03 = (x,y) -> x * y;
		
//		System.out.println(calc01.calcula(40, 30));
//		
//		calc01 = new Subtracao();
//		
//		System.out.println(calc01.calcula(40, 30));
//			
		System.out.println(executa(calc01,40,30));
		System.out.println(executa(calc02,40,30));
		System.out.println(executa(calc03,40,30));
	}
	
	public static double executa(Calculadora c, double a, double b) {
		return c.calcula(a, b);
	}
}

interface Calculadora{

	static String nome = "OSVALDO";
	
	default void teste() {
		System.out.println("hello world");
	}
	
	public double calcula(double a, double b);
}

class Soma implements Calculadora{

	@Override
	public double calcula(double a, double b) {
		
		return a+b;
	}
}

class Subtracao implements Calculadora{
	@Override
	public double calcula(double a, double b) {
		
		return a-b;
	}	
}
