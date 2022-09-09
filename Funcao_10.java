package com.tais.funcao;
import java.util.Scanner;
import java.util.Random;
public class Funcao_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
	System.out.print("Pressione enter para jogar os dados: ");	
	String nada = input.nextLine();
	
	boolean win = false;	
	int i = 0;
	int num = 0;
	int dado1 = jogoCraps();
	int dado2 = jogoCraps();
	int soma = dado1+dado2;
	
		while(!win) {
			i++;			
			if(i==1 && (soma == 7 || soma == 11)) {
				win = true;
				System.out.println("Você tirou "+soma+", você é um natural, ganhou o jogo! :D");
			}else if(i==1 && soma == 2 || soma == 3 || soma ==12) {
				System.out.println("Craps :C Você tirou "+soma+" e perdeu!");
				win = true; //lose '-'
			}
			if(i == 1) {
				num = soma;
			}
			
			if(!win) {
				System.out.println("Seu número: "+soma+", tire "+num+" novamente para ganhar.");	
				System.out.print("Caso contrário se tirar 7 irá perder, Pressiona ENTER para jogar: ");	
				nada = input.nextLine();
				dado1 = jogoCraps();
				dado2 = jogoCraps();
				soma = dado1+dado2;	
				if(soma == 2 || soma == 3 || soma ==12) {
					System.out.println("Craps :C Você tirou "+soma+" e perdeu!");
					win = true;
				}
				if(soma == num && !win) {
					win = true;
					System.out.println("Você tirou "+soma+" e ganhou!");
				}
				if(soma == 7 && !win) {
					System.out.println("Você tirou 7 e perdeu!");
					win = true;
				}
		}
		
	}
	System.out.println(nada);
	
	input.close();
	}
	
	public static int jogoCraps() {
		Random randola = new Random();
			
		int rand = randola.nextInt(1,7);
				
		return rand;
	}	
}

