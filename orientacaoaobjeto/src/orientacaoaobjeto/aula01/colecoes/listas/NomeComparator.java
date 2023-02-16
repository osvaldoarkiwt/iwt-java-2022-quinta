package orientacaoaobjeto.aula01.colecoes.listas;

import java.util.Comparator;

public class NomeComparator implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		// TODO Auto-generated method stub
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}

}
