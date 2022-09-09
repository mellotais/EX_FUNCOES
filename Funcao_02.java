package com.tais.funcao;
import java.util.Scanner;
public class Funcao_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Informe N: ");
		int n = input.nextInt();
		System.out.println(sequencia(n));

		input.close();
	}

	public static StringBuilder sequencia(int n) {
		StringBuilder saida = new StringBuilder();
		for(int i = 1; i <= n;i++) {
			saida.append("\n");
			for(int j = 1; j <= i;j++) {
				saida.append((j)+" ");
			}
		}
		return saida;
	}
}