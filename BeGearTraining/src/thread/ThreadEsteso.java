package thread;

public class ThreadEsteso extends Thread{
	
	public void run(){
		try {
			Thread.sleep(100);
			for(int i = 0; i < 10; i ++) {
				Thread.sleep(1000);
				System.out.println("Io sono il thread esteso");
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
