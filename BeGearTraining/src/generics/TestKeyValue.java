package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestKeyValue {
	
	public static void main(String[]args) {
		
		int i = 0;
		KeyValue [] kv  = new KeyValue[2]; 
		
//		KeyValue<Integer , String> key = new KeyValue();
//		                           
//		
//		key.setG1(10);
//		key.setG2("Ciao");
//		System.out.println(key.getG1()+ " Value : " + key.getG2());
//		
//		KeyValue<Integer , String> key1 = new KeyValue();
//		key1.setG1(30);
//		key1.setG2("Salve");
//		System.out.println(key1.getG1()+ " Value : " + key1.getG2());
//		
//		KeyValue<Integer , String> key2 = new KeyValue();
//		
//		key2.setG1(60);
//		key2.setG2("Addio");
//     	System.out.println(key2.getG1()+ " Value : " + key2.getG2());
		
		
		kv[i]= new KeyValue <Integer , String>();
		kv[i].setG1(10);
		kv[i].setG2("Paolo");
		i++;
		
	    kv[i]= new KeyValue <String , Double>();
		kv[i].setG1("Lupo");
		kv[i].setG2(20.55);
		System.out.println();
		i++;
		
		for(i = 0; i < kv.length; i++) {
		
		System.out.println(kv[i].getG1().getClass().getSimpleName()+ " " + kv[i].getG1());
		System.out.println(kv[i].getG2().getClass().getSimpleName()+ " " + kv[i].getG2());
		}
		System.out.println();
		
		
		ArrayList <KeyValue> lista = new ArrayList();
		lista.add(new KeyValue<String , Integer>());
		lista.get(0).setG1("Ehi");
		lista.get(0).setG2(30);
		
		lista.add(new KeyValue<Double , String>());
		lista.get(1).setG1(20.55);
		lista.get(1).setG2("Eilà");
		
		for(int j = 0; j < lista.size();j++) {
				System.out.print(lista.get(j).getG1());
		        System.out.println(" " + lista.get(j).getG2());
		


		}
		
		
	}
}

