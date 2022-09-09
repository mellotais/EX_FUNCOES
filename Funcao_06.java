package com.tais.funcao;
import java.util.Scanner;
public class Funcao_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean para = false;

		while(!para) {
			System.out.print("Informe a hora ");
			int iHour = input.nextInt();
			System.out.print("Informe os minutos ");
			int iMin = input.nextInt();

			int hora= formataHora(iHour);
			String result = mostraHora(hora,iMin);

			if(hora==iHour) {
				System.out.println(result+" AM.");
			}else {
				System.out.println(result+" PM.");
			}

			System.out.println("Deseja converter novamente?(s ou n)");
			char cOpt = input.next().charAt(0);
			if(cOpt == 's') {

			}else {
				para = true;
				System.out.println("Fim do programa. :)");
			}

		}

		input.close();
	}

	public static int formataHora(int h) {
		if(h > 12) {
			h -= 12;
		}

		return h;
	}
	public static String mostraHora(int h, int m) {
		String format = " ";
		format = (h +" Horas e "+ m +" minutos");

		return format;
	}
}
