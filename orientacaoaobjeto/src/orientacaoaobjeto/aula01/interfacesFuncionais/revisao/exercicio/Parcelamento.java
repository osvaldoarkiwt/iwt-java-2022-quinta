package orientacaoaobjeto.aula01.interfacesFuncionais.revisao.exercicio;

public class Parcelamento {

	public static void main(String[] args) {
		InterfaceParcelamento tres = new ParceladoTresVezes();
		
		InterfaceParcelamento cinco = new ParceladoCincoVezes();
		
		InterfaceParcelamento dez = new ParceladoDezVezes();
		
		System.out.println(executa(tres,3000));
		
		System.out.println(executa(cinco,3000));
		
		System.out.println(executa(dez,3000));

	}

	public static double executa(InterfaceParcelamento ip, double preco) {
		return ip.parcelar(preco);
	}
}

interface InterfaceParcelamento{
	public double parcelar(double preco);
}

class ParceladoTresVezes implements InterfaceParcelamento{

	@Override
	public double parcelar(double preco) {
		
		double parcela = preco /3;
		
		return parcela;
	}
}

class ParceladoCincoVezes implements InterfaceParcelamento{

	@Override
	public double parcelar(double preco) {
		
		double parcela = preco /5;
		
		double juros = parcela * 0.05;
		
		return parcela+juros;
	}
}

class ParceladoDezVezes implements InterfaceParcelamento{

	@Override
	public double parcelar(double preco) {
		
		double parcela = preco /10;
		
		double juros = parcela * 0.1;
		
		return parcela+juros;
	}
}