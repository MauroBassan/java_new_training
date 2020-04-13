package generics;

public class KeyValue <g1 , g2> {

	public KeyValue() {

	}
	public KeyValue(g1 g1, g2 g2) {
		this.setG1(g1);
		this.setG2(g2);
    }
	public KeyValue(g1 g1) {

	}

	g1 G1;
	g2 G2;


	public g1 getG1() {
		return G1;
	}
	public void setG1(g1 g1) {
		G1 = g1;
	}
	public g2 getG2() {
		return G2;
	}
	public void setG2(g2 g2) {
		G2 = g2;
	}
	@Override
	public String toString() {
		return "KeyValue [G1= " + G1 + "("  + G1.getClass().getSimpleName() + ")" + " G2= " + G2 + "(" + G1.getClass().getSimpleName() +")"+ "]";
	}









}
