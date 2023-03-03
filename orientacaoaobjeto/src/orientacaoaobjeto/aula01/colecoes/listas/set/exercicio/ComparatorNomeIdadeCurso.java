package orientacaoaobjeto.aula01.colecoes.listas.set.exercicio;

import java.util.Comparator;

public class ComparatorNomeIdadeCurso implements Comparator<Estudante>{

	@Override
	public int compare(Estudante estudante01, Estudante estudante02) {
		
		int nome = estudante01.getNome().compareToIgnoreCase(estudante02.getNome());
		
		if(nome != 0) return nome;
		
		int idade = estudante01.getIdade().compareTo(estudante02.getIdade());
		
		if(idade != 0) return idade;
		
		return estudante01.getCurso().compareToIgnoreCase(estudante02.getCurso());
	}
}
