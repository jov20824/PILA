package utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Write {

	public static final String FICHERO1 = "C:\\Users\\aleja\\Documents\\salida1.txt";
	
	public static final String FICHERO2 = "C:\\Users\\aleja\\Documents\\salida2.txt";
	
	
	public Write() {
		
	}
	
	/**
	 * Método que se encarga de meter los datos que le pasamos con un iterador, en el fichero que le pasamos
	 * con un String.
	 * @param iterator
	 * @param fichero
	 */
	public static void escribir(Iterator<Integer> iterator, String fichero) {
		
		BufferedWriter bw;
		//ArrayList<Integer> x = new ArrayList<Integer>();
		
		
		try {
			bw = new BufferedWriter(new FileWriter(fichero));
			
			while (iterator.hasNext()) {
				String escribir = String.valueOf(iterator.next());
				bw.write(escribir+"\n");
			}
//			for (Integer numero: x) {
//				String escribir = String.valueOf(numero);
//				bw.write(escribir+"\n");
//			}
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
