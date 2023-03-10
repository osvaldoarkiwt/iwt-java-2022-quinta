package orientacaoaobjeto.aula01.atributosEmetodos;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Cachorro {

	String nome;
	String raca;
	LocalDate dataNascimento;
	double peso;
	char porte;

	public void latir() {
		System.out.println("au au au");
	}
	
	public void comer(String comida) {
		
		switch(comida.toLowerCase()) {
			case "peixe": System.out.println("fazer cara feia"); break;
			case "carne": System.out.println("abana o rabo e come feliz"); break;
			case "frango": System.out.println("come à força"); break;
			case "racao": System.out.println("só come"); break;
			default: System.out.println("vira-se e vai embora");
		}
	}
	
	//passear(int distancia) return feliz / cansado / zangado
	public String passear(int distancia) {
		
		if(distancia >= 1500)     return "cansado";
		else if(distancia >= 1000)return "zangado";
		else if(distancia >= 500) return "feliz";
		else 					  return "não passeou";
	}
	
	public int idadeCachorro() {
		
		LocalDate hoje = LocalDate.now();
		
		int idade = (int) dataNascimento.until(hoje, ChronoUnit.YEARS);
		
		return idade;
	}
	
	public double idadeHumano() {
		int idade = this.idadeCachorro();
		double idadeHumano = 0;
		
		if(idade>=0 && idade <=2) {
			switch(porte) {
			case 'P':
			case 'p': idadeHumano = idade*12.5; break;
			
			case 'M':
			case 'm': idadeHumano = idade*10.5; break;
			
			case 'G':
			case 'g': idadeHumano = idade*9; break;
			
			default: idadeHumano = 0;
			}
		}else if(idade > 2) {
			
			switch(porte) {
			case 'P':
			case 'p': idadeHumano = ((idade-2)*4.87)+25; break;
			
			case 'M':
			case 'm': idadeHumano = ((idade-2)*5.74)+21; break;
			
			case 'G':
			case 'g': idadeHumano = ((idade-2)*7.84)+18; break;
			
			default: idadeHumano = 0;
			}
		}
		return idadeHumano;
	}
	
	@Override
	public String toString() {
		
		String porteCachorro = "";
		
		switch(porte) {
			case 'P':
			case 'p': porteCachorro = "pequeno"; break;
			
			case 'M':
			case 'm': porteCachorro = "médio"; break;
			
			case 'G':
			case 'g': porteCachorro = "grande"; break;
			
			default: porteCachorro = "ALIEN";
		}
		
		return "Cachorro nome: "+nome+" raca: "+raca+" data de nascimento: "+dataNascimento
				+" peso: "+peso+" porte: "+porteCachorro;
	}
	
}
