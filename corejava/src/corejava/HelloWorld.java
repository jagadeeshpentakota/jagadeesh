package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelloWorld {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("jagan");
	list.add("jaganreddy");
	list.add("jaganmohanredy");
	list.add("Ap cm jagan");
	list.add("jagan");
	
	System.out.println(list);
	
	Iterator<String> apcm =list.iterator();
	while(apcm.hasNext()) {
		System.out.println(apcm.next());
		
	}
}
}
