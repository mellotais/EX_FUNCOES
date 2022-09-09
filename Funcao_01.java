package com.filipe.funcao;
import java.util.Scanner;
public class Funcao_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Informe N: ");
		int n = input.nextInt();
		System.out.println(sequencia(n));

		input.close();
	}

	public static StringBuilder sequencia(int n) {
		StringBuilder saida = new StringBuilder();
		for(int i = 0; i <= n;i++) {
			saida.append("\n");
			for(int j = 0; j < i;j++) {
				saida.append((i)+" ");
			}
		}
		return saida;
	}
}