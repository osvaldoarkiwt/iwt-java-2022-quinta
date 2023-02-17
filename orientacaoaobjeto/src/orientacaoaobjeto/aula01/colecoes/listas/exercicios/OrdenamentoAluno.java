package orientacaoaobjeto.aula01.colecoes.listas.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenamentoAluno {

	public static void main(String[] args) {
		List<Aluno> sala = new ArrayList<>() {{
			add(new Aluno("Paula","Java"));
			add(new Aluno("Marcio","Javascript"));
			add(new Aluno("Levi","Javascript"));
			add(new Aluno("Helena","Java"));
			add(new Aluno("Marcela","Python"));
			add(new Aluno("Paula","PHP"));
			add(new Aluno("Levi","Assembly"));
		}};

		sala.sort(new SuperComparator());
		
		for(Aluno aluno : sala) System.out.println(aluno);
		
	}
}

class NomeComparator implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}
}

class CursoComparator implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		
		return o1.getCurso().compareToIgnoreCase(o2.getCurso());
	}
}

class SuperComparator implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		
		if(nome != 0) return nome;
		
		return o1.getCurso().compareToIgnoreCase(o2.getCurso());
	}
	
}
