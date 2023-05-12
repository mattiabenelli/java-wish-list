package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> whishList = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);

		
		while(true) {
	
			System.out.println("1- inserisci un nuovo elemento nella wishlist");
			System.out.println("2- esci");
			System.out.println("Cosa vuoi fare: ");
			
				int choice = in.nextInt();
				
				if (choice < 1 || choice > 2) {
					System.out.println("codice non valido");
					continue;
				}
				else if(choice == 2) {
					break;
				}
				
				System.out.println("Inserisci elemento wishlist: ");
				String elem = in.next();
				whishList.add(elem);

		}
		System.out.println("\n--------------------\n");
		System.out.println("la tua lista di desideri è: ");
		System.out.println(whishList);
		System.out.println("ecco il numero dei tuoi desideri: " + whishList.size());
		
		in.close();
	}
}
