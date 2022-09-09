package com.filipe.funcao;
import java.util.Scanner;
public class Funcao_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um inteiro: ");
		String sNum = input.next();
		
		int r = mostraTam(sNum);
		
		System.out.println("O número "+sNum+" tem "+r+" dígitos.");
		
		input.close();
	}
	
	public static int mostraTam(String n) {
		int output = n.length();
			
		return output;
	}
	
	
}
