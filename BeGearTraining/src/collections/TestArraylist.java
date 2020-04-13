package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

import array.Persona;

public class TestArraylist {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		Vector<String> colors_v = new Vector();
		List<String> colors_al = new ArrayList<>();
		List<String> colors_ll = new LinkedList<>();
		
		String colore=" ";


		do {
			System.out.println("inserisci colore : ");
			colore=(sc.nextLine());
			if(colore.equalsIgnoreCase("Stop")) {
				break;
			}
			colors_v.add(colore);
			colors_al = colors_v ;
			colors_ll = colors_al;
			
//			colors_al.add(colore);
//			colors_ll.add(colore);
			

		}while(true);
		
		 for(String z : colors_ll) {
	        	System.out.println(z + " (LinkedList) ");
	        	System.out.println("---------------");
	        }

        for(String y : colors_al) {
        	System.out.println(y + " (ArrayList)");
        	System.out.println("---------------");
        }

		for (String x : colors_v) {
			System.out.println(x + " (Vector)");
			System.out.println("---------------");
		}
		System.out.println("Lunghezza lista : " + colors_v.size());
		System.out.println("Quanti valori può contenere la lista : " + colors_v.capacity());
			
//		}
//		for  (int i = 0; i < colors.size();i++) {
//			System.out.println(colors.get(i));
//		}

	
}
}

