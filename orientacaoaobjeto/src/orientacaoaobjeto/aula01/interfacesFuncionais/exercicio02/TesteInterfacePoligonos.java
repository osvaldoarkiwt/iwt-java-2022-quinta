package orientacaoaobjeto.aula01.interfacesFuncionais.exercicio02;

public class TesteInterfacePoligonos {

	public static void main(String[] args) {
		
		Poligono triangulo = l -> Math.pow(l, 2)*Math.sqrt(3)/4;
		
		Poligono quadrado = l -> Math.pow(l, 2);
		
		Poligono pentagono = l -> (double)1/4*(Math.sqrt(5*(5+2*Math.sqrt(5))*Math.pow(l, 2)));

		System.out.println("área do triangulo: "+calcula(triangulo,4));
		System.out.println("área do quadrado: "+calcula(quadrado,4));
		System.out.println("área do pentagono: "+calcula(pentagono,4));
		
	}
	
	public static double calcula(Poligono pol,double lado) {
		return pol.calculaArea(lado);
	}
	
}
