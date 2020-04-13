package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestPerformance {
	
	public static void main(String []args) {
		
		List<String> v = new Vector();
		List<String> al = new ArrayList();
		List<String> ll = new LinkedList();
		long start, end;
		
		for(int i = 0; i < 10000; i++) {
			v.add("ciao" + i);
		}
		
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			v.get(i);
		}
		end = System.nanoTime();
	    System.out.println("Elapsed time for Vector" + (end - start));
	    
	    al = v;
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			al.get(i);
		}
		end = System.nanoTime();
	    System.out.println("Elapsed time for ArrayList : " + (end - start));
	    
	    ll = v;
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			ll.get(i);
		}
		end = System.nanoTime();
	    System.out.println("Elapsed time for LinkedList : " + (end - start));
			
	}

}
