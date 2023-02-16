package orientacaoaobjeto.aula01.colecoes.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
	
		List<Pessoa> teste = new ArrayList<>();
		
		List<Pessoa> nomes = new ArrayList<>(teste) {{
			add(new Pessoa("Ana",22,'A'));
			add(new Pessoa("Elizabeth",18,'A'));
			add(new Pessoa("Jorge",19,'B'));
			add(new Pessoa("Maria",32,'B'));
			add(new Pessoa("Lucas",25,'A'));
			add(new Pessoa("Julia",28,'B'));
		}};
		
		nomes.add(new Pessoa("Marcos",41,'B'));
		
		//nomes.sort(null);
		//nomes.sort(new NomeComparator());
		//nomes.sort(new IdadeComparator());
		nomes.sort(new TipoSanguineoComparator());
		
		Iterator it = nomes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
