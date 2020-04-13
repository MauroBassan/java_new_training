package generics;

public class TestGenerics {
	
	public static void main(String[]args)  {
		
		int x;
		double y;
		
		x = 10;
		y = 25.5;
		
		CoppiaGenerics<Integer , Double> cg = new CoppiaGenerics<>();
		cg.setT1(x);
		cg.setT2(y);
		System.out.println(cg.getT1() + " " + cg.getT2());
	}
}
