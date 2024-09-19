package aula08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excessoes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Digite um número");
			int num = scn.nextInt();
			
		} 
		catch (InputMismatchException) {
			   
			System.out.println("Não foi digitado nenhum número");
		}
		
		
		
		
      
	}

}
