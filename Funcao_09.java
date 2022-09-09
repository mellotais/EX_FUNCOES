package com.filipe.funcao;
import java.util.Scanner;
public class Funcao_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um inteiro: ");
		String sNum = input.next();
		
		int iTam = sNum.length();
		String resp = inverteNum(sNum,iTam);
		
		System.out.println("O número ao contrário é:"+resp);
		
		input.close();
	}
	
	public static String inverteNum(String n , int tam) {
		
		String output = " ";
		
		for(int i = tam;i > 0; i--) {
			output += n.substring(i -1 , i);
		}
			
		return output;
	}
	
	
}
