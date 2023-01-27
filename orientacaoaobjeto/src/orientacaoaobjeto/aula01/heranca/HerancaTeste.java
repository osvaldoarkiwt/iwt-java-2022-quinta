package orientacaoaobjeto.aula01.heranca;

import java.time.LocalDate;
import java.time.Month;

public class HerancaTeste {

	public static void main(String[] args) {
		
//		Pessoa p1 = new Pessoa();
//		
//		p1.setNome("Albierre");
//		p1.setDataDeNascimento(LocalDate.of(1968, Month.JUNE, 10));
//		p1.setEndereco("Marrocos");
//		p1.setTelefone("987545411");
		
		//System.out.println(p1);
		
		Aluno a1 = new Aluno("137","Ana",LocalDate.of(2002, Month.FEBRUARY, 10),"Bairro de Fátima","988774411","Java");
		
		Aluno a2 = new Aluno();
		
		System.out.println(a1.getIdade());
		System.out.println(a1.toString());
		
		Professor p1 = new Professor("987","Lúcia",LocalDate.of(1994, Month.AUGUST, 28),"Meireles","999334411",50.0,180);
		
		System.out.println(p1.getSalario());
		System.out.println(p1);
		
		System.out.println(Aluno.getNumeroAlunos());
		
	}
}
