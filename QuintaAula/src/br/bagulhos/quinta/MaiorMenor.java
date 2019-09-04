package br.bagulhos.quinta;

import java.util.Arrays;

import java.util.Collections;

public class MaiorMenor {
	public static void main(String[] args) {
		Integer vet1[] = {1,0,3,8,12,2,9,6,5,4};
		
		
		Arrays.sort(vet1);
		System.out.println("maior valor vetor 1: "+vet1[vet1.length-1]);
		Arrays.sort(vet1, Collections.reverseOrder());
		
		
		
		
		
		System.out.println("menor valor do vetor1: "+vet1[vet1.length-1]);
		
	}

}
