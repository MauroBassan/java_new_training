package thread;

public class ThreadImplementato implements Runnable{

	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; i ++) {
				Thread.sleep(1000);
				System.out.println("Io sono il thread implementato");
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
