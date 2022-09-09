package com.filipe.funcao;
import java.util.Scanner;
import java.util.Random;
public class Funcao_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Insira um número de 1 até 20: ");
	int n = input.nextInt();
	
	Random rand = new Random();
	StringBuilder sbResult = new StringBuilder();
	
	if(n < 1 || n > 20) {
		int rand_input = rand.nextInt(1,20);
		sbResult = desenhaMoldura(rand_input);
	}else {
		sbResult = desenhaMoldura(n);
	}
	System.out.println(sbResult);
	
	input.close();
}
	
	public static StringBuilder desenhaMoldura(int num) {
		
		StringBuilder output = new StringBuilder();
		int i = 1;
		
		for(i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				//first line
				if(i == 1 && j==1) {
					output.append("x");
				}else if(i == 1 && j != num) {
					output.append("_");
				}else if(j== num && i == 1){
					output.append("x");
				}
			}
		}
				//mid lines
		for(i = 1; i <= num; i++) {
				if(i != 1 ) {
					output.append("\n|");
					for(int k = 1; k <= (num-2); k++) {
						output.append(" ");
						if(k == num-2) {
							output.append("|");	
						}
					}
				}					
		}
		//final line
		for(int m = 1; m <= num;m++) {
			if(m==1) {
				output.append("\nx");
			}else if(m != num) {
				output.append("_");
			   }else if(m== num){
			   	output.append("x");
		    	m = (num+1);
		    }
		}
			
		return output;
	
	}

}
