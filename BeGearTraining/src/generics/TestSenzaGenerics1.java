package generics;

public class TestSenzaGenerics1 {

	public static void main(String[]args) {
		
		CoppiaIntDouble cid = new CoppiaIntDouble();
		
		cid.setX(10);
		cid.setY(12.5);
		System.out.println(cid.getX()+ " " + cid.getY());
		
		CoppiaBooleanFloat cbf = new CoppiaBooleanFloat();
		cbf.setB(false);
		cbf.setF(100.25f);
		System.out.println(cbf.isB() + " " + cbf.getF());
		
		
		
		
		
	}
}
