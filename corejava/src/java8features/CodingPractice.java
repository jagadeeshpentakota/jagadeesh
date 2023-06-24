package java8features;

public class CodingPractice {

	public static void main(String[] args) {

		
		
		
//	int num=2020;
//	
//	if((num%4==0)&&(num%100!=0)||(num==400)){
//		System.out.println("leaf year");
//	}else {
//		System.out.println("normal year");
//	}
		
		// String str1="jagadeesh";
		// String str2="jagadeesh";

		// System.out.println(str1==(str2));

//	List<Employee>  list=new ArrayList<Employee>();
//	list.add(new Employee(101,"kiddu",20000));
//	list.add(new Employee(102,"kuni",200000));
//	list.add(new Employee(103,"king",30000));
//	
//	System.out.println(list.stream().sorted(Comparator
//			.comparing(Employee::getSalary).reversed()).skip(1).
//			mapToDouble(Employee::getSalary).
//			findFirst().
//			orElseThrow(()->new IllegalArgumentException("Not enough employees")));
//	
//	

//	Map<Integer,String> list=new HashMap<>();
//	
//	list.put(1, "jagadeesh");
//	list.put(2, "jagan");
//	list.put(3, "ramana");
//	list.put(4, "ramu");
//
//	    if(list.isEmpty()) {
//	    	
//	    	System.out.println("data not found");
//	    	
//	    }else {
//	    	System.out.println("data is there ");
//	    }

//		String text="jagadeesh java developer ";
//		
//		String Results=text.line().filter(l->l.contains("java")).findAny().orElse("npt found");
//		
//		System.out.println(Results);

//		List<Employee> empdetails=new ArrayList<>();
//		empdetails.add(new Employee( 1,"jagadeesh",10000));
//		empdetails.add(new Employee( 2,"rajesh",20000));
//		empdetails.add(new Employee( 3,"jagan",30000));
//		empdetails.add(new Employee( 4,"veru",10000));
//		
//		
//		
//		     Map<Double, List<Employee>> emp=empdetails.stream().
//		    		 collect(Collectors.groupingBy(Employee::getSalary,Collectors.toList()));
//		    		
//		     emp.entrySet().forEach(entry->{
//		    	 System.out.println(entry.getKey()+"........"+entry.getValue());
//		     });
//		
//		     System.out.println("**************************************");
//		     
//		    Map<Integer, Long> emplist= empdetails.stream().
//		    		collect(Collectors.groupingBy(Employee::getId,Collectors.counting()));
//		     
//		    emplist.entrySet().forEach(entry->{
//		    	
//		    	System.out.println(entry.getKey()+"*****"+entry.getValue());
//		    });

//		String s1 = "";
//		String s2 = "java developer";
//
//		if (s1.length() == 0 || s1.isEmpty()) {
//
//			System.out.println("yes it is empty");
//
//		}else {
//			System.out.println(s1);
//		}
//
//		if(s2.length()==0||s2.isEmpty()) {
//			System.out.println("yes s2 is empaty");
//		}else {
//			System.out.println(s2);
//		}
		/*
		 * List<String> list=Arrays.asList("jagan","jaya","srinu","");
		 * 
		 * list.stream().filter(x->x.startsWith("s")).count(); System.out.println(list);
		 */
		// dates=Stream.generate(LocalDateTime::now).map(LocalDateTime::toString).limit(10).toList();

		// System.out.println( dates);

//		List<String> list=
//				Arrays.asList("jagadeesh","jagan","raju","","");
//	
//		long count=list.stream().filter(x->x.isEmpty()).count();
//		
		// System.out.println(count);
//		int start,end;
//		Scanner sc=new Scanner(System.in) ;
//		System.out.println("enter start or end value range");
//		start =sc.nextInt();
//		
//		boolean status = false;
//		int start = 1, end = 10;
//		int arr[] = { 2, 5, 8, 9 };
//
//		Set<Integer> missingNumber = new HashSet<Integer>();
//
//		for (int i = start; i <= end; i++) {
//
//			for (int j = 0; j < arr.length; j++) {
//				if (i != arr[j]) {
//					status = true;
//					break;
//				} if(status==false) {
//					missingNumber.add(i);
//				}
//				System.out.println(missingNumber);
//
//			}
//
//		}

//	List<Integer> list1=Arrays.asList(1,3,5,7,9);
//	List<Integer> list2=Arrays.asList(2,4,6,8,10);
//
//	   List<List<Integer>> list= Arrays.asList(list1,list2);
//		
//		list.stream().flatMap(l1->l1.stream()).collect(Collectors.toList()).forEach(System.out::println);
//		
//   List<String> list=new ArrayList<>();
//   list.add(1, "jagadeesh");
//   list.add(2, "jagan");
//   list.add(6, "veru");
//   list.add(8, "venkatesh");
// 
//   System.out.println(list.stream().filter(x->x.startsWith("v")).collect(Collectors.toList()));
//	
//	String str="e\\b\\_``nc";
//		
//	System.out.println(str)
//		.
//	char[] ch=str.toCharArray();
//	
//	for(char c: ch) {
//		c+=5;
//		System.out.print(c);
//	}

//		
//		List<String> str=new ArrayList<>();
//		str.add("jagadeesh");
//		str.add("pavan");
//		str.add("pavan");
//		str.add("vinay");
//		
//		System.out.println(str);
//		
//		Set<String> set=new HashSet<>(str);
//		System.out.println(set);

//		int n=10;
//		for(int i=1;i<=n;i++) {
//			
//			if(i%5==0&i%3==0) {
//				
//				System.out.println("fizzbuzz");
//			}else if(i%3==0){
//				System.out.println("fizz");
//			}else if(i%5==0) {
//				
//				System.out.println("buzz");
//			}
//			else {
//				System.out.println(i);
//			}
//			
//		}
//		

//		String str="jagadeesh";
//		
//	//	String rev="";
//		
//		
//		StringBuffer strr=new StringBuffer(str);
//		
//		strr.reverse();
//		
//		System.out.println(strr);

		// int len=str.length();

//		for(int i=len-1;i>=0;i--) {
//			
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
//		
	}

}
