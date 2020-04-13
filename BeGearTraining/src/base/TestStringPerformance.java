package base;

public class TestStringPerformance {

	public static void main(String[] args) {
		
		String string = "Ciao";
		StringBuilder stringbuilder = new StringBuilder();
		//stringbuilder = null;
		StringBuffer stringbuffer;
		
		long start, end;
		
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			string = string + i;
		}
		end = System.nanoTime();
		System.out.println("Elapsed time for String: " + (end - start));
		
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			stringbuilder.append("Ciao" + i);
			//System.out.println(stringbuilder);
		}
		end = System.nanoTime();
		System.out.println("Elapsed time for stringbuilder: " + (end - start));
		
	
		
	}

}
