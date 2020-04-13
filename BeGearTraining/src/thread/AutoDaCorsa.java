package thread;

public class AutoDaCorsa implements Runnable{

	private String nome;
	private static int classifica = 1;

	AutoDaCorsa() {

	}

	AutoDaCorsa(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public void run() {
		System.out.println("L'auto " + this.getNome() + " è partita!");
		try {
			Thread.sleep((int)(Math.random() * 1000d) + 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.cambioGomme();
		try {
			Thread.sleep((int)(Math.random() * 1000d) + 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			
		}

		System.out.println(this.getNome() + " ha tagliato per " + classifica + "° il traguardo!");
		classifica++;

	}

	private void cambioGomme() {
		System.out.println("Cambio gomme per l'auto " + this.getNome());
		try {
			Thread.sleep((int)(Math.random() * 1000d) + 1);;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Cambio gomme terminato per " + this.getNome() + " e si avvia verso il traguardo!");

	}

	public static void countdown(){
		try {
			Thread.sleep(500);
			System.out.println("Pronti");
			Thread.sleep(500);
			System.out.println("Partenza");
			Thread.sleep(500);
			System.out.println("Via!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
