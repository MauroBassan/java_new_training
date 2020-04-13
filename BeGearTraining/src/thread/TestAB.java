package thread;

public class TestAB {

	public static void main(String[] args) {
		
		System.out.println("Io sono la classe testAB\t" + Thread.currentThread().getName());
		
		Thread t1 = new Thread(new ClasseA());
		Thread t2 = new Thread(new ClasseB());
		
		t1.start();
		t2.start();
	}

}
