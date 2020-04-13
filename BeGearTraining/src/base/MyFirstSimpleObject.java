package base;

public class MyFirstSimpleObject {

	private int variabile1;
	private int variabile2;
	private boolean bool1;
	private boolean bool2;
    private String nome;
    
    
    public void stampaOggetto() {
    	System.out.println("variabile1: " + getVariabile1());
    	System.out.println("variabile2: " + getVariabile2());
    	System.out.println(":variabile1 " + isBool1());
    	System.out.println("variabile2: " + isBool2());
    	System.out.println("nome: "+ getNome());
    	
    }



	/**
	 * @return the variabile1
	 */
	public int getVariabile1() {
		return variabile1;
	}



	/**
	 * @param variabile1 the variabile1 to set
	 */
	public void setVariabile1(int variabile1) {
		this.variabile1 = variabile1;
	}



	/**
	 * @return the variabile2
	 */
	public int getVariabile2() {
		return variabile2;
	}



	/**
	 * @param variabile2 the variabile2 to set
	 */
	public void setVariabile2(int variabile2) {
		this.variabile2 = variabile2;
	}



	/**
	 * @return the bool1
	 */
	public boolean isBool1() {
		return bool1;
	}



	/**
	 * @param bool1 the bool1 to set
	 */
	public void setBool1(boolean bool1) {
		this.bool1 = bool1;
	}



	/**
	 * @return the bool2
	 */
	public boolean isBool2() {
		return bool2;
	}



	/**
	 * @param bool2 the bool2 to set
	 */
	public void setBool2(boolean bool2) {
		this.bool2 = bool2;
	}



	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}



	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
