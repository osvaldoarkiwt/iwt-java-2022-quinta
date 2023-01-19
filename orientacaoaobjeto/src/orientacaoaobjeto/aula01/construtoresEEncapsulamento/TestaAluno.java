package orientacaoaobjeto.aula01.construtoresEEncapsulamento;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaAluno {

	public static void main(String[] args) {
		
		Curso c01 = new Curso();
		
		c01.nome = "Java";
		c01.turno = "noite";
		c01.cargaHoraria = 120;
		c01.comeco = LocalDate.of(2022, Month.DECEMBER, 01);
		c01.fim = c01.comeco.plusMonths(c01.cargaHoraria /16);
		
		Curso c02 = new Curso();
		
		c02.nome = "Frontend";
		c02.turno = "noite";
		c02.cargaHoraria = 80;
		c02.comeco = LocalDate.of(2022, Month.AUGUST, 22);
		c02.fim = c01.comeco.plusMonths(c01.cargaHoraria /16);
		
		Contato cont01 = new Contato();
		
		cont01.telefone01 = "(85) 99997-4646";
		cont01.telefone02 = "(85) 98887-1616";
		cont01.email = "joacleiton@email.com";
		
		Endereco e01 = new Endereco();
		
		e01.logradouro = "Rua Carolino de Aquino nº122";
		e01.bairro = "Fátima";
		e01.cep = "60050140";
		e01.municipio = "Fortaleza";
		e01.estado = "Ceará";
		e01.pais = "Brasil";
		
		Estudante est01 = new Estudante();
		
		est01.nome = "Joacleiton";
		est01.dataDeNascimento = LocalDate.of(1999, Month.APRIL, 1);
		est01.endereco = e01;
		est01.contato = cont01;
		est01.cursos =  Arrays.asList(c01,c02);
		
		System.out.println(est01);
	}

}
