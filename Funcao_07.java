package com.filipe.funcao;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Funcao_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float dValue = -1;
		float fSoma = 0;
		int iN = 0;

		do {
			iN++;
			System.out.print("Informe o valor da prestação: ");
			dValue = input.nextFloat();
			System.out.print("Informe quantos dias em atraso: ");
			double dAtraso = input.nextFloat();

			DecimalFormat df = new DecimalFormat("##.##");

			System.out.println("O custo final é: "+df.format(valorPagamento(dValue,dAtraso))+" R$.");
			fSoma += valorPagamento(dValue,dAtraso);

		}while(dValue != 0);


		System.out.println("Número de prestações de hoje: "+(iN-1));
		System.out.println("Valor total das prestações: "+fSoma+" R$.");

		input.close();
	}
	public static double valorPagamento(double custo, double atraso) {

		double dias = 0;
		double dResult= 0;

		if(atraso > 0) {
			dias =(atraso *0.1);
			dResult = ((custo+(custo*0.3)) + dias);
		}else {
			dResult = custo;
		}

		return dResult;
	}

}