package org.lessons.java.security;

//Importiamo la classe Scanner dalla JRE
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		//Inizializziamo un'istanza della classe Scanner per poter gestire il flusso di dati in input
		Scanner scanner = new Scanner(System.in);
		
		//Dichiarazione delle variabili
		
		String userName;
		String userLastName;
		String userColor;
		short userYear;
		byte userMonth,userDay;
		
	//Assegnazione di un valore acquisito da tastiera
		
		System.out.println("Inserisci il tuo nome: ");
		userName = scanner.nextLine();
		System.out.println("Inserisci il tuo cognome: ");
		userLastName = scanner.nextLine();
		System.out.println("Inserisci il tuo colore preferito: ");
		userColor = scanner.nextLine();
		System.out.println("Inserisci la tua data di nascita in formato numerico");
		System.out.print("Giorno: ");
		userDay = scanner.nextByte();
		System.out.print("Mese: ");
		userMonth = scanner.nextByte();
		System.out.print("Anno: ");
		userYear = scanner.nextShort();
	
		
		
		
		
		
		
		
		

	}

}
