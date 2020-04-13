package generics;

import java.util.ArrayList;

public class TestArrayGenerics {
	
	public static void main (String[]args) {
		
		ArrayList<String> nomi = new ArrayList();
		nomi.add("Elena");
		nomi.add("Gigi");
		nomi.add("Franchino");
		nomi.add("Balù");
/*	    nomi.add(15)  usando i generics e definendo l array list di tipo string mi considera sbagliato 
*                     tutto ciò che inserirò almeno che non sia di tipo string
*/
//		String s;
		
		for (int i = 0; i < nomi.size(); i++) {
//			s = (String) nomi.get(i);
			System.out.println(nomi.get(i));
			
		}
				
	}

}
