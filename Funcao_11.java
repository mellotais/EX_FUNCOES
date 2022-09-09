package com.tais.funcao;
import java.util.Scanner;
public class Funcao_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Informe uma data DD/MM/AAAA: ");
	String sDate = input.next();
	
	String[] separa = sDate.split("/");
	int iDay = Integer.parseInt(separa[0]);
	int iMounth = Integer.parseInt(separa[1]);
	int iYear = Integer.parseInt(separa[2]);
		
	StringBuilder result = new StringBuilder(dataExtenso(iDay,iMounth,iYear));
	System.out.println(result);
		
	input.close();
	}
	public static StringBuilder dataExtenso(int dia , int mes, int ano) {
		
		StringBuilder output = new StringBuilder();
		
		boolean bisexto = false;
		boolean invalid = false;
				
		if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
			if(dia > 0 && dia < 32) {
				output.append("Hoje é dia "+dia);	
				bisexto = true;
			}
			if(mes > 0 && mes < 13) {
				if(mes == 1) {
					output.append(" de Janeiro ");	
				}else if(mes == 2){
					output.append(" de Fevereiro ");	
				}else if(mes == 3){
					output.append(" de Março ");	
				}else if(mes == 4){
					output.append(" de Abril ");	
				}else if(mes == 5){
					output.append(" de Maio ");	
				}else if(mes == 6){
					output.append(" de Junho ");	
				}else if(mes == 7){
					output.append(" de Julho ");	
				}else if(mes == 8){
					output.append(" de Agosto ");	
				}else if(mes == 9){
					output.append(" de Setembro ");	
				}else if(mes == 10){
					output.append(" de Outubro ");	
				}else if(mes == 11){
					output.append(" de Novembro ");	
				}else if(mes == 12){
					output.append(" de Dezembro ");	
				}else if(bisexto){
					output.append("O ano é bisexto.");
				}else{
					System.out.println("Data inválida.");
					invalid = true;
				}
			}	
		}	
		if(dia > 0 && dia < 32 && !bisexto && !invalid) {
				output.append("Hoje é dia "+dia);
				
		}else if(mes > 0 && mes < 13) {
				
			}if(mes == 1 && !bisexto) {
				output.append(" de Janeiro ");	
			}else if(mes == 2 && !bisexto){
				output.append(" de Fevereiro ");	
			}else if(mes == 3 && !bisexto){
				output.append(" de Março ");	
			}else if(mes == 4 && !bisexto){
				output.append(" de Abril ");	
			}else if(mes == 5 && !bisexto){
				output.append(" de Maio ");	
			}else if(mes == 6 && !bisexto){
				output.append(" de Junho ");	
			}else if(mes == 7 && !bisexto){
				output.append(" de Julho ");	
			}else if(mes == 8 && !bisexto){
				output.append(" de Agosto ");	
			}else if(mes == 9 && !bisexto){
				output.append(" de Setembro ");	
			}else if(mes == 10 && !bisexto){
				output.append(" de Outubro ");	
			}else if(mes == 11 && !bisexto){
				output.append(" de Novembro ");	
			}else if(mes == 12 && !bisexto) {
				output.append(" de Dezembro ");	
			}else if (!bisexto){
				System.out.println("Data inválida.");
				invalid = true;
			}
			if(!bisexto && !invalid) {
				output.append("de "+ ano+".\n");
				output.append("O ano não é bisexto.");
			}else if(bisexto) {
				output.append("de "+ ano+".\n");
				output.append("O ano é bisexto.");
			}
			
		return output;
	}

}
