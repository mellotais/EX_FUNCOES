package com.filipe.funcao;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
public class Funcao_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe uma palavra: ");
	String word = input.next();
	
	StringBuilder result = embaralhaPalavra(word);
	
	System.out.println(result);
	
	input.close();
	}
	
	public static StringBuilder embaralhaPalavra(String palavra) {
		
		StringBuilder output = new StringBuilder();
		String [] res = palavra.split("");
				
		List<String> embaralhar  = Arrays.asList(res);
		Collections.shuffle(embaralhar);
					
		String resultado = String.join("", embaralhar);
		output.append(resultado);
			
		return output;
	}

}
