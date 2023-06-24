package java8features;

import java.util.Arrays;
import java.util.List;

public class Streamss {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("jaga", "raju", "appala", "anitha");

		Long count = name.stream().filter(names -> names.length() > 3).map(String::toUpperCase).sorted().count();

		System.out.println("count" + count);
	}

}
