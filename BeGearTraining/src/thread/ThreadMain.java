package thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		// metodo alternativoThreadFromThread tft = new ThreadFromThread();
		Thread tft = new ThreadFromThread();
		Thread tfr = new Thread(new ThreadFromRunnable());
		
		tft.start();
		tfr.start();

	}

}
