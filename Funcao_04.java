package com.tais.funcao;
import java.util.Scanner;
public class Funcao_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe um inteiro: ");
		int iNum = input.nextInt();

		String resp = validar(iNum);

		System.out.println(resp);


		input.close();
	}
	public static String validar(int a) {
		
		String output = new String();
		
		if(a > 0) {
			output = "P";
		}else {
			output = "F";
		}

		return output;
	}

}