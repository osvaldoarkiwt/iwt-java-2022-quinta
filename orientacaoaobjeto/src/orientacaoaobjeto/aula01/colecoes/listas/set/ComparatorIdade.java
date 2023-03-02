package orientacaoaobjeto.aula01.colecoes.listas.set;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		
		return o1.getIdade().compareTo(o2.getIdade());
	}

}
