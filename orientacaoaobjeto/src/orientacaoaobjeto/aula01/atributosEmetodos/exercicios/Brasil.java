package orientacaoaobjeto.aula01.atributosEmetodos.exercicios;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Brasil {

	public static void main(String[] args) {
		
		Pessoa p01 = new Pessoa();
		
		p01.nome = "Maria";
		p01.dataDeNascimento = LocalDate.of(1995, Month.JANUARY, 9);
		p01.altura = 1.75;
		p01.peso = 68;
		p01.endereco = "Rua Z nº:1024, Meireles";
		
		Pessoa p02 = new Pessoa();
		
		p02.nome = "Helena";
		p02.dataDeNascimento = LocalDate.of(1989, Month.AUGUST, 17);
		p02.altura = 1.60;
		p02.peso = 50;
		p02.endereco = "Maranguape";

		Pessoa p03 = new Pessoa();
		
		p03.nome = "Lúcio";
		p03.dataDeNascimento = LocalDate.of(2000, Month.MARCH, 29);
		p03.altura = 1.70;
		p03.peso = 78;
		p03.endereco = "Avenida Bezerra de Menezes nº560, São Gerardo ";
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(p01);
		pessoas.add(p02);
		pessoas.add(p03);
		
		for(Pessoa pessoa : pessoas) {
			System.out.print("nome: "+pessoa.nome+" idade: "+pessoa.idade()+" imc: ");
			pessoa.imc();
		}
	}
}
