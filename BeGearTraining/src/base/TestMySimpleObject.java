package base;

public class TestMySimpleObject {

	
	public static void main(String[]args) {
		MyFirstSimpleObject mfso1 = new MyFirstSimpleObject();
		MyFirstSimpleObject mfso2 = new MyFirstSimpleObject();
		
		System.out.println(mfso1);
		System.out.println(mfso2);
		
		mfso1.setBool1(true);
		mfso1.setBool2(true);
		mfso1.setVariabile1(100);
		mfso1.setVariabile2(200);
		mfso1.setNome("Pippo");
		
		
		
		mfso1.stampaOggetto();
		System.out.println("---------");
		mfso2.stampaOggetto();
		
		
	}
	
}
