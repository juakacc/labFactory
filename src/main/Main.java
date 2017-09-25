package main;

import lanchonete.Lanchonete;
import lanchonete.LanchoneteA;
import lanchonete.LanchoneteB;
import lanchonete.LanchoneteC;

public class Main {

	public static void main(String[] args) {
		Lanchonete a = new LanchoneteA();
		Lanchonete b = new LanchoneteB();
		Lanchonete c = new LanchoneteC();
		
		System.out.println("Sanduíche 01:");
		System.out.println(a.getSanduiche());
		
		System.out.println("\nSanduíche 02:");
		System.out.println(b.getSanduiche());
		
		System.out.println("\nSanduíche 03:");
		System.out.println(c.getSanduiche());
	}
	
}
