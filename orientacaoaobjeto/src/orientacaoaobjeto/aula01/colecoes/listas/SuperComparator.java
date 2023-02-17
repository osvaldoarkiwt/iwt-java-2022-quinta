package orientacaoaobjeto.aula01.colecoes.listas;

import java.util.Comparator;

public class SuperComparator implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		
		if(nome != 0) return nome;
		
		int tipoSanguineo = o1.getTipoSanguineo().compareTo(o2.getTipoSanguineo());
		
		if(tipoSanguineo != 0) return tipoSanguineo;
		
		return o1.getIdade().compareTo(o2.getIdade());
	}
}
