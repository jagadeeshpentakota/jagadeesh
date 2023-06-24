package corejava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListt {

	public static void main(String[] args) {
		List<String> city=new LinkedList<>();
		city.add("hyd");
		city.add("chennai");
		city.add("beng");
		city.add("mum");
		city.add("dehli");
		city.add("kkr");
		
		System.out.println(city);
		
		
		Iterator<String> itr=city.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
//		Iterator<String> itr=((LinkedList<String>) city).descendingIterator();  
//		while(itr.hasNext()) {
//		System.out.println(itr.next());
//		}
		/*
		 * Iterator<String> i=((LinkedList<String>) city). descendingIterator();
		 * while(i.hasNext()) { System.out.println(i.next()); }
		 */
	}

}
