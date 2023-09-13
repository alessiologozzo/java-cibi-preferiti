package org.lessons.java.array;

import java.util.Scanner;

public class CibiPreferiti {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dim = 0;
		
		dim = InputInterface.getInt(scanner, 5, 10, "Inserisci la dimensione dell'array");
		String[] arr = new String[dim];
		
		for(int i = 0; i < dim; i++)
			arr[i] = InputInterface.getString(scanner, i + 1 + ") Inserisci un piatto");
		
		System.out.println("Il tuo piatto preferito è: " + arr[0] + "! Un piatto che ti piace ma che apprezzi di meno è: " + arr[arr.length - 1] + ".");
		
		if(arr.length > 2);
			if(arr.length % 2 == 0)
				System.out.println("I piatti di mezzo della tua classifica sono: " + arr[arr.length / 2 - 1] + " e " + arr[arr.length / 2] + ".");
			else
				System.out.println("Il piatto di mezzo della tua classifica è: " + arr[(int)Math.ceil(5 / 2)] + ".");
			
		System.out.println("Arrivederci!");
		
		scanner.close();
	}

}
