package orientacaoaobjeto.aula01.heranca.exerciciorevisao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Loja {

	public static void main(String[] args) {
		
		LocalDate dataDeLancamento = LocalDate.of(2022, Month.FEBRUARY, 10);
		
		Caderno c01 = new Caderno("Esportes",5);
		
		Caderno c02 = new Caderno("Atualidades",15);
		
		Caderno c03 = new Caderno("Finanças",10);
		
		Revista r01 = new Revista("Aqui e Agora",dataDeLancamento,15.50,(Integer)dataDeLancamento.getYear(),"notícias","BrazilNew");
		
		Livro l01 = new Livro("O conde de monte cristo",dataDeLancamento,45.0,"Alexandre Dummas","30ª");
		
		Jornal j01 = new Jornal("Fortaleza News",dataDeLancamento,7.0,new  ArrayList<Caderno>() {{
			add(c01);
			add(c02);
			add(c03);
		}});

		
		System.out.println(r01);
		System.out.println(l01);
		System.out.println(j01);
		
	}

}
