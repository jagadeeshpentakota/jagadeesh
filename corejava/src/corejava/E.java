package corejava;

public class E extends C {

	public void Ef() {
		System.out.println("I am from e");
	}
	public static void main(String[] args) {

		E e = new E();
		//e.ab();
		C.cd();
		e.Ef();
		
	}
}
