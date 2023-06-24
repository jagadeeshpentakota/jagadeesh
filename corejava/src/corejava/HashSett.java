package corejava;

import java.util.HashSet;
import java.util.function.Consumer;

public class HashSett {
public static void main(String[] args) {
HashSet<String>  emp=new HashSet<String>() ;
{
emp.add("raju")	;
emp.add("rani")	;
emp.add("vani")	;
emp.add("raju")	;
emp.iterator();
System.out.println(emp);
}	

}
}
