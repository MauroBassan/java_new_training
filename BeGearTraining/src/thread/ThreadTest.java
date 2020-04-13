package thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread te1 = new ThreadEsteso();
		Thread ti1 = new Thread(new ThreadImplementato());
		
		
		
		te1.start();
		ti1.start();
	}

}
