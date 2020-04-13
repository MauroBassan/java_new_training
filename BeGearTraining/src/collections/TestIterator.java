package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	
	public static void main(String[]args) {
		
		List<String> nomi = new ArrayList<>();
		
		
		nomi.add("23:Vanni");
		nomi.add("11:Matilde");
		nomi.add("96:courtney");
		nomi.add("44:Filippo");
		nomi.add("18:Cristina");
		
		Iterator <String> inter;
		inter = nomi.iterator();
		
		
		System.out.println("**Elementi nella lista**");
		for(String s : nomi) {
			System.out.println(s);
		}
		
		int numero;
		String valore;
		
		System.out.println("**Elementi da cancellare**");
		while(inter.hasNext()) {
			valore = inter.next();
			numero = Integer.parseInt(valore.substring(0,2));
			if(numero % 4 == 0) {
				System.out.println(valore.substring(3));
				inter.remove();
			}
			
		}
		System.out.println("**Elementi senza numero**");
		
		for(int i = 0; i < nomi.size();i++) {
			String x = String.valueOf(nomi.get(i).substring(3));
			
			System.out.println(x);
			
			
		}
			
		}
		
}	


