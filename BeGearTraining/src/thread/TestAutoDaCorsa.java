package thread;
import java.util.Scanner;

public class TestAutoDaCorsa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Thread [] auto;
		System.out.println("Quante auto concorrono alla gara?");
		int numeroAuto = sc.nextInt();
		sc.nextLine();
		auto = new Thread[numeroAuto];
		
		for(int i = 0; i < numeroAuto ; i++) {
			System.out.println("Inserisci il nome dell'auto numero " + (i + 1));
			auto[i] = new Thread(new AutoDaCorsa(sc.nextLine()));
			auto[i].setPriority((int)(Math.random() * 10d) + 1);
		}
		
		AutoDaCorsa.countdown();
		
		for(int i = 0; i < numeroAuto; i++) {
			auto[i].start();
		}
		

		
	}

}
