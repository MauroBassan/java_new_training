package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

import inheritance.Animale;
import inheritance.Gatto;

public class TestKeyValue2 {

	public static void main(String[]args) {

		int i = 0;
		KeyValue [] kv  = new KeyValue[3]; 
		kv[i]= new KeyValue <Integer , String>();
		kv[i].setG1(10);
		kv[i].setG2("Paolo");
		i++;

		kv[i]= new KeyValue <String , Double>();
		kv[i].setG1("Lupo");
		kv[i].setG2(20.55);
		i++;
		
		kv[i] = new KeyValue<Integer , String>(22, "piero");  // motodo costruttore passo i dati da KeyValue
		i++;

		stampa(kv);
		metodo1(10);
		metodo2(new Gatto());

		ArrayList <KeyValue> lista = new ArrayList();
		lista.add(new KeyValue<String , Integer>());
		lista.get(0).setG1("Ehi");
		lista.get(0).setG2(30);

		lista.add(new KeyValue<Double , String>());
		lista.get(1).setG1(20.55);
		lista.get(1).setG2("Eilà");
		
		lista.add(new KeyValue<Integer , String>(30 ,"Remo"));          // Metodo costruttore 
		lista.add(new KeyValue<String , Character>("Remo", 'r'));       // Metodo costruttore 
		


		stampa(lista);

	}

	private static<T extends Animale> void metodo2(T g) {
		System.out.println(g + " - " + g.getClass().getSuperclass() );
		
	}

	private static <T extends Number> void metodo1(T g) {
		System.out.println(g + " - " + g.getClass().getSimpleName());
		
		
	}

	private static <T> void stampa(ArrayList<T> lista) {
		for (T t : lista) {
			System.out.println(t.toString());
					}
	}
	
	private static  <T> void stampa(T[] lista) {

		for (T t : lista) {
            System.out.println(t.toString());
		}

	}
}