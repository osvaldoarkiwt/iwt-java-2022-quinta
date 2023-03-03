package orientacaoaobjeto.aula01.colecoes.listas.set;

import java.util.Set;
import java.util.TreeSet;

public class SetComObjeto {

	public static void main(String[] args) {
		
		Set<Pessoa> lista = new TreeSet<>(new ComparatorIdade());
		
		lista.add(new Pessoa("Ivone",45));
		lista.add(new Pessoa("Paulo",38));
		lista.add(new Pessoa("Maria",30));
		lista.add(new Pessoa("Carlos",60));
		lista.add(new Pessoa("Joao",41));
		
		lista.forEach(System.out::println);
		
		
		
	}
}


