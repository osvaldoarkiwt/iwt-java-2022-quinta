package orientacaoaobjeto.aula01.interfacesFuncionais.generics.exercicio;

import java.util.ArrayList;
import java.util.List;

public class TesteIntefaceFuncional {

	public static void main(String[] args) {
		
		List<String> salaDeAula = new ArrayList<>();
		
		// SMI single method interface
		Operacao<Integer> soma = (x,y) -> {return x+y;};
		Operacao<String> subtracao = (x,y) -> String.valueOf((Integer.parseInt(x)- Integer.parseInt(y)));
		Operacao<Double> multiplicacao = (x,y) -> x*y;
		Operacao<Double> divisao = (x,y) -> (double)x/y;
		
		System.out.println(soma.calculo(30, 40));
		System.out.println(subtracao.calculo("30","40"));
	//	System.out.println("soma: "+executa(soma,30,40));
	//	System.out.println("subtracao: "+executa(subtracao,30,40));
		System.out.println("multiplicação: "+executa(multiplicacao,30,40));
		System.out.println("divisão: "+executa(divisao,30,40));
	}

	public static double executa(Operacao op,int x, int y) {
		return (double) op.calculo((double)x,(double) y);
	}
	
}
