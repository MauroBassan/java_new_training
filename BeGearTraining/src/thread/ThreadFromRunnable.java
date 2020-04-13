package thread;

public class ThreadFromRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i ++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("Sono il ThreadFromRunnable ");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
