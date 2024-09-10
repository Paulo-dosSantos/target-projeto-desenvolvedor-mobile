package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		
		//CÓDIGO PARA RESOLUÇÃO DA QUESTÃO 1
		Scanner sc= new Scanner(System.in);
		/*Primeiro número da sequência de Fibonacci*/
		int a=0;
		
		int indice=12;
		int soma=0;
		int k=1;
		
		while(k<indice) {
			k+=1;
			soma+=k;
		}
		System.out.println("O valor da soma é: "+soma);
	}

		
	}


