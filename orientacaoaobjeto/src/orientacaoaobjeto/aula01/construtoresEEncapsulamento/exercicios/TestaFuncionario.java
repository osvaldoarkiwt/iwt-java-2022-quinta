package orientacaoaobjeto.aula01.construtoresEEncapsulamento.exercicios;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;


public class TestaFuncionario {

	public static void main(String[] args) {
	
		Endereco e01 = new Endereco("Rua Carolino de Aquino nº122","Fátima","60050140","Fortaleza","Ceará","Brasil");
		
		Contato c01 = new Contato("(85) 99997-4646","(85) 98887-1616","joacleiton@email.com");
		
		Funcionario fun01 = new Funcionario("Maria",LocalDate.of(1999, 11, 21),e01,c01,"gerente",5000.0,220);

		System.out.println(fun01);
		
		System.out.println(fun01.descontarFalta(30));
	}
}
