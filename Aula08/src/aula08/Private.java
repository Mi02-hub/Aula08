package aula08;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Private {

	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 
	 Pessoa a = new Pessoa ();
	 
	 try {
		 
		  System.out.println("Digite seu nome:");
		  a.nome = scn.nextLine();
		  
		  
		  System.out.println("Digite a sua idade");
		  a.idade = scn.nextInt();
		  
		 
	 } catch (InputMismatchException e) {
		 System.out.print("As informações digitadas não estão certas!");
	 }
	 
	
	 
	 
	 

	}

}
