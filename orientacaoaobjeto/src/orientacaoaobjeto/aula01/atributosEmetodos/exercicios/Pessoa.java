package orientacaoaobjeto.aula01.atributosEmetodos.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	String nome;
	double altura;
	double peso;
	LocalDate dataDeNascimento;
	String endereco;
	
	public int idade() {
		
		LocalDate hoje = LocalDate.now();
		
		int idadePessoa = (int) dataDeNascimento.until(hoje, ChronoUnit.YEARS);
		
		return idadePessoa;
	}
	
	public void imc() {
		
		double imc = peso/Math.pow(altura, 2);
		
		if(imc < 18.5) {
			System.out.println("abaixo do peso");
		}else if(imc>=18.5 && imc <24.9) {
			System.out.println("peso normal");
		}else if(imc>=24.9 && imc <29.9) {
			System.out.println("sobrepeso");
		}else if(imc>=29.9 && imc <34.9) {
			System.out.println("obesidade I");
		}else if(imc>=39.9 && imc <39.9) {
			System.out.println("obesidade II");
		}else if(imc>40) {
			System.out.println("obesidade III");
		}
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yy");
	
		return "Pessoa nome: "+nome+" data de nascimento: "+dataDeNascimento.format(formatoBrasil)+" peso: "
				+peso+" altura: "+altura+" endereco: "+endereco;
	}
}
