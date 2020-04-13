package generics;

public class TestMetodoGenerico {
	
	public static void main(String[]args) {
		
		int x = 10;
		boolean b = true;
		String s = "Alessandro";
		
		System.out.println(metodo1(x));
		System.out.println(metodo1(b));
		System.out.println(metodo1(s));
		
		new TestMetodoGenerico().metodo2(100,110.4f);
		new TestMetodoGenerico().metodo2(true,110.45);
		new TestMetodoGenerico().metodo2("Ciao", 'c');
	}
	
	
	private static <T>String metodo1(T x) {
		
		if (x instanceof Integer) {
			Integer xx =(Integer) x*3;
			x = (T) xx;
		} 
		
		if (x instanceof String) {
			x = (T) (x + " Ciao");
		}
		return (x + " - " + x.getClass().getSimpleName());
		
		
	}
	
	private <V1, V2> void metodo2(V1 value1 , V2 value2) {
		System.out.println(value1 + " - " + value1.getClass().getSimpleName());
		System.out.println(value2 + " - " + value2.getClass().getSimpleName());
		
	}

}
