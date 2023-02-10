package orientacaoaobjeto.aula01.interfacesFuncionais;

public class TesteIntefaceFuncional {

	public static void main(String[] args) {
		// SMI single method interface
		Operacao soma = (x,y) -> {return x+y;};
		Operacao subtracao = (x,y) -> x-y;
		Operacao multiplicacao = (x,y) -> x*y;
		Operacao divisao = (x,y) -> (double)x/y;
		
		System.out.println(soma.calculo(30, 40));
		System.out.println(subtracao.calculo(30, 40));
		System.out.println("soma: "+executa(soma,30,40));
		System.out.println("subtracao: "+executa(subtracao,30,40));
		System.out.println("multiplicação: "+executa(multiplicacao,30,40));
		System.out.println("divisão: "+executa(divisao,30,40));
	}

	public static double executa(Operacao op,int x, int y) {
		return (double)op.calculo(x, y);
	}
	
}
