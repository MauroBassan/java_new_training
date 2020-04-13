package thread;

public class ThreadFromThread extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 10; i ++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("Io sono il ThreadFromThread");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
