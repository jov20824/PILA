package objects;

import java.util.ArrayList;
import java.util.Iterator;

import exceptions.PilaLlenaException;
import utilities.Write;

public class Pila {
	
	private ArrayList<Integer> lista;
	
	
	public Pila() {
		lista = new ArrayList<Integer>();
	}
	
	
	/**
	 * Método que se encarga de insertar un número que le pasamos por parámetro a la lista. Si la lista está
	 * llena, lanza una excepción
	 * @param numero
	 * @throws PilaLlenaException
	 */
	public void add(int numero) throws PilaLlenaException {
		
		if (lista.size()>=30) {
			PilaLlenaException e = new PilaLlenaException("Límite máximo (30) de la pila alcanzado");
			throw e;
		}
		else {
			lista.add(numero);
		}
	}
	
	/**
	 * Método que nos permite sacar un número de la lista siempre y cuando la lista no esté vacía.
	 * Este método siempre sacará el último dato metido en la lista.
	 */
	public void get() {
		
		if(lista.isEmpty()==false) {
			lista.remove(lista.size()-1);
		}
	}
	
	/**
	 * Método que nos dice si la lista está llena o no, en caso de estarla, devolverá un true, sino, un false.
	 * @return boolean
	 */
	public boolean isFull() {
		if (lista.size()==30) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Método que nos dice si la lista está vacía o no, en caso de estarla, devolverá un true, sino, un false.
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (lista.isEmpty()==true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Método que nos dice el tamaño de la lista devolviendo el número dado por el método size.
	 * @return int
	 */
	public int numberOfElements() {
		return lista.size();
	}

	/**
	 * Método al que, al pasarle un fichero, el cual ha de ser la variable estática final FICHERO1 o FICHERO2,
	 * llama al método estático de la clase Write para que escriba los datos almacenados en la lista en un fichero.
	 * @param fichero
	 */
	public void writer(String fichero) {
		
		if (fichero==Write.FICHERO1 | fichero==Write.FICHERO2) {
			
			Iterator<Integer> iterador = lista.iterator();
			Write.escribir(iterador,fichero);
		}
	}

	@Override
	public String toString() {
		return "Pila [lista=" + lista + "]";
	}
	
	
}
