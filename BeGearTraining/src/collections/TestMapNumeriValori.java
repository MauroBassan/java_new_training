package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapNumeriValori {

	public static void main(String[]args) {
		
		HashMap<Integer,String> hm = new HashMap();
//		HashSet<String> hs = new HashSet<>();  // non accetta duplicati
		
		hm.put(23, " Vanni");
		hm.put(11, " Matilde");
		hm.put(96, " Courtney");
		hm.put(44, " Filippo");
		hm.put(18, " Cristina");
		
		System.out.println("**Elementi nella lista**");
		for(Integer i : hm.keySet()) { 
			System.out.println("Key : " +i +", Value : " + hm.get(i));
			
		}
		    System.out.println("-------------------"); 
		
		Entry<Integer,String> e;  //per portare una mappa nel set per poter utilizzare un iteratore devo utilizzare entry set
		Set<Map.Entry<Integer,String>> setMap = hm.entrySet();
		Iterator<Entry<Integer,String>> itera = setMap.iterator();
		
		System.out.println("**Elementi da cancellare**");
		
		while(itera.hasNext()) {
			e = itera.next();
			if ((e.getKey() % 4 == 0)) {
				System.out.println(e.getKey() + e.getValue());
				itera.remove();
				
			}
			
		}
		System.out.println("-------------------");
		System.out.println("**Elementi senza numero**");
		
		for(Integer i : hm.keySet()) { 
			System.out.println("Key : " + /* i mi restituisce anche la chiave*/" Value : " + hm.get(i));
			}
		    System.out.println("-------------------");

	}
}
