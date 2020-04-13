package collections;

import java.util.HashMap;
import java.util.HashSet;

public class TestMap {

	public static void main(String[]args) {
		
		HashMap<Integer,String> hm = new HashMap();
//		HashSet<String> hs = new HashSet<>();  // non accetta duplicati
		
		hm.put(23, "Vanni");
		hm.put(11, "Matilde");
		hm.put(96, "Courtney");
		hm.put(44, "Filippo");
		hm.put(18, "Cristina");
		
        System.out.println(hm);

	}
}
