package java8features;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import javax.xml.stream.StreamFilter;

public class Results {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		List<Object> results=new ArrayList<Object>();
		results.add("raju"+35);
		results.add("anil"+70);
		results.add("amar"+10);
		results.add("arjun"+20);
		results.add("almar"+40);
		
		System.out.println(results.add(results.size()));
for(Object o:results) {
	System.out.println(o);
}


	
	//	System.out.println(results.iterator().next().hashCode());
	
		//results.forEach(x->System.out.println(x));
		
		/*
		 * System.out.println(results);
		 * 
		 * for(Object o:results) { System.out.println(o);
		 * 
		 * }
		 */
//
//        for(String result :results) {
//        	
//        	if( results<=35 != null) {
//        		System.out.println();
//        	}
//        }
//		
//		Collections.sort(results, new Comparator<String>() {
//		    @Override
//		    public int compare(String o1, String o2) {
//		        int n1 = Integer.parseInt(o1.split("\\d", 2)[1]);
//		        int n2 = Integer.parseInt(o2.split("\\d", 2)[1]);
//		        return Integer.compare(n1, n2);
//		    }
//		});
//
//		for (String result : results) {
//		    System.out.println(result);
//		}
		
//		System.out.println(results.add("vamsi"+50));
//		System.out.println(results);
//		System.out.println(Collection.class);
//		System.out.println(results.stream().count());
//		System.out.println(results.stream().filter().count());
//		System.out.println();
	//	System.out.println(results.stream().flatMap());
	
//		if(results.stream().filter(p->p<25) != null ) {results
//		
//	System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
	}
	}
	

