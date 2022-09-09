package com.filipe.funcao;
import java.util.Scanner;
public class Funcao_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o custo: ");
		float fCusto = input.nextFloat();
		System.out.print("Informe a porcentagem de imposto: ");
		float iImp = input.nextFloat();

		System.out.println("O custo final é: "+somaImposto(fCusto,iImp)+" R$.");

		input.close();
	}

	public static float somaImposto(float custo, float taxaImposto) {
		float result = (custo+(custo*(taxaImposto/100)));
		return result;
	}

}