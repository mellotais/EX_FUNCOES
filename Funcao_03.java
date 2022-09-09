package com.filipe.funcao;
import java.util.Scanner;
public class Funcao_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe n1: ");
		int n1 = input.nextInt();
		System.out.print("Informe n2: ");
		int n2 = input.nextInt();
		System.out.print("Informe n3: ");
		int n3 = input.nextInt();

		System.out.println("A soma é: "+soma(n1,n2,n3));

		input.close();
	}
	public static float soma(float a, float b, float c) {
		float soma = a + b + c;

		return soma;
	}

}