package orientacaoaobjeto.aula01.atributosEmetodos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Canil {

	public static void main(String[] args) {
	
		Cachorro c01 = new Cachorro();
		
		c01.nome = "totó";
		c01.raca = "srd";
		c01.dataNascimento = LocalDate.of(2016, Month.FEBRUARY, 14);
		c01.peso = 20.5;
		c01.porte = 'g';
		
		Cachorro c02 = new Cachorro();
		
		c02.nome = "pix";
		c02.raca = "chitzu";
		c02.dataNascimento = LocalDate.of(2019, Month.OCTOBER, 6);
		c02.peso = 20.5;
		c02.porte = 'p';
		
		System.out.println(c01+"\n"+c02);
		
		//c01.latir();
		//c01.comer("x-bacon");
		System.out.println(c01.passear(100));
		
		System.out.println(c01.idadeHumano());
		System.out.println(c02.idadeHumano());
		
		System.out.println(LocalDateTime.now());
		
	}	
}
