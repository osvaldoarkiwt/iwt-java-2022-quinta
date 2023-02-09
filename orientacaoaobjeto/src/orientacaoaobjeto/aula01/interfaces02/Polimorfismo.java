package orientacaoaobjeto.aula01.interfaces02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Polimorfismo {

	public static void main(String[] args) {
	
		//List<Integer> lista = new ArrayList<>();
		//List<Integer> lista02 = new LinkedList<>();

		Figura quad = new Quadrado();
		Figura tri = new Triangulo();
		
		System.out.println(quad.perimetro(5));
		System.out.println(tri.perimetro(5));
		
	}
}
