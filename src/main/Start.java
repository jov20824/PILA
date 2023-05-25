package main;

import exceptions.PilaLlenaException;
import objects.Pila;
import utilities.Write;

public class Start {

	public static void main(String[] args) {
		
		Pila pila = new Pila();
		
		for(int i=0;i<40;i++) {
			int numero = (int)(Math.random()*100);
			
			try {
				pila.add(numero);
			} catch (PilaLlenaException e) {
				e.getMessage();
				e.printStackTrace();
			}
			
		}
		System.out.println(pila);
		pila.writer(Write.FICHERO1);
		

		
		for(int i=0;i<10;i++) pila.get();
		
		System.out.println(pila);
		pila.writer(Write.FICHERO2);
		
		
		
		
		for(int i=0;i<30;i++) pila.get();
		
		System.out.println(pila);
	}

}
