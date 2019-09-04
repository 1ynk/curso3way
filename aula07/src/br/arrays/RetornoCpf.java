package br.arrays;

import java.util.HashMap;
import java.util.Map;

public class RetornoCpf{
	
	public String retornaNomePorCpf(String cpf) {
		Map<String, String> lista = new HashMap<String, String>();
		lista.put("735.737.871-34","Daniel Galdino Fernandes");
		lista.put("213.116.411-49","Fulano de Tal");
		
		if(lista.containsKey(cpf)) {
			return lista.get(cpf);
		}else {
			return "cpf nao existente";
		}
	}

}
