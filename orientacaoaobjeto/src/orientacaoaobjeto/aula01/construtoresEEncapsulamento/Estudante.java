package orientacaoaobjeto.aula01.construtoresEEncapsulamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estudante {

	String nome;
	LocalDate dataDeNascimento;
	Endereco endereco;
	Contato contato;
	List<Curso> cursos = new ArrayList<>();
	
	public String cursoString() {
		String cursosString="[ ";
		
		for(Curso curso : this.cursos) {
			cursosString+=curso.nome+" "+curso.turno+" "+curso.cargaHoraria+" ";
		}
		return cursosString+=" ]";
	}
	
	public String toString() {
		return "Estudante \n-nome: "+nome+"\n-data de aniversário: "+
				dataDeNascimento+"\n"+
				endereco.toString()+"\n"+
				contato.toString()+
				"\n-cursos:\n "+
				cursoString();
	}
}
