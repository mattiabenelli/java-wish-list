package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> whishList = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		boolean newElem = true;
		boolean control = true;
		
		while(newElem == true) {
			System.out.println("\n--------------------\n");
			System.out.println("Inserisci elemento wishlist: ");
			String elem = in.next();
			
			whishList.add(elem);
			
			System.out.println("\n--------------------\n");
			System.out.println("1- inserisci un nuovo elemento nella wishlist");
			System.out.println("2- esci");
			System.out.println("Cosa vuoi fare: ");
			
			while(control == true) {
				int choice = in.nextInt();
				
				if (choice == 1) {
					control = false;
				}
				else if(choice == 2) {
					control = false;
					newElem = false;
				}
				else{
					System.out.println("formato non valido");
				}
			}
		}
		System.out.println("\n--------------------\n");
		System.out.println("la tua lista di desideri è: ");
		System.out.println(whishList);
		
		in.close();
	}
}
