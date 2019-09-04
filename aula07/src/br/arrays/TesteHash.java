package br.arrays;

import java.util.HashMap;
import java.util.Map;

public class TesteHash {
	
	public static void main(String[] args) {
		Map<Long, String> exemplo = new HashMap<Long, String>();
		
		exemplo.put(222222l, "N1");
		
		Map<String, String> exemplo2 = new HashMap<String, String>();
		
		exemplo2.put("N1", "V1");
		exemplo2.put("N2", "V2");
		exemplo2.put("N3", "V3");
		exemplo2.put("N4", "V4");
		exemplo2.put("N5", "V5");
		exemplo2.put("N6", "V6");
		
		String KeyToSearch ="N1";
		
		if(exemplo2.containsKey(KeyToSearch)) {
			System.out.println("valor da chave "+KeyToSearch+"="+exemplo2.get(KeyToSearch));
		}else {
			System.err.println("chave inexistente");
		}
		
		for(String key : exemplo2.keySet()) {
			String valor = exemplo2.get(key);
			System.out.println(key+"="+valor);
		}
	}

}
