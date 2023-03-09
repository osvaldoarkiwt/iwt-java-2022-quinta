package orientacaoaobjeto.aula01.colecoes.listas.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ImplementacaoMap {

	public static void main(String[] args) {
		
		Map<String, Double> produtos = new HashMap<>();			
		
		produtos.put("mamão", 3.80);
		produtos.put("maçã", 9.00);
		produtos.put("abacate",7.20);
		produtos.put("melancia",1.50);
		produtos.put("maçã", 14.00);
		
		for(Entry<String, Double> entrada : produtos.entrySet()) {
			System.out.println(entrada.getKey()+":"+entrada.getValue());
		}
		
		for(String chave : produtos.keySet()) {
			System.out.println(chave+"-"+produtos.get(chave));
		}
	}
}
