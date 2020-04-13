package thread;

public class B implements Runnable {

	@Override
	public void run() {
		System.out.println("Io sono la classe B\t" + Thread.currentThread().getName());
		countdown();
	}
	
	synchronized public static void countdown() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
