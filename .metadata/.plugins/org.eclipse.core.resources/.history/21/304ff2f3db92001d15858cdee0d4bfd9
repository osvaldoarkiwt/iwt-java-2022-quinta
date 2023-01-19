package orientacaoaobjeto.aula01.atributosEmetodos.exercicios.estudante;

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
		return "Estudante \n-nome: "+nome+"\n-data de aniversário: "+dataDeNascimento+"\n-endereço: "+
				endereco.logradouro+"\n bairo: "+endereco.bairro+"\n cep: "+endereco.cep+
				"\n município: "+endereco.municipio+"\n estado: "+endereco.estado+
				"\n-contato:"+"\n telefone 01: "+contato.telefone01+"\n telefone 02: "+contato.telefone02+
				"\n email: "+contato.email+"\n-cursos:\n "+cursoString();
	}
}
