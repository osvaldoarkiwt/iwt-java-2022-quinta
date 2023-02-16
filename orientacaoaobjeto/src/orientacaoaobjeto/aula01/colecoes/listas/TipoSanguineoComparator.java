package orientacaoaobjeto.aula01.colecoes.listas;

import java.util.Comparator;

public class TipoSanguineoComparator implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		
		return o1.getTipoSanguineo().compareTo(o2.getTipoSanguineo());
	}
}
