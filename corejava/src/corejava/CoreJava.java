package corejava;

class CoreJava {

	private int a;
	private int b;
	public String d;

	public CoreJava() {
		super();
		System.out.println("I am from constructor");
	}

	public CoreJava(int a, int b, String d) {
		super();
		this.a = a;
		this.b = b;
		this.d = d;
	}

	public void add() {

		int c = a + b;
		System.out.println(c);

	}

}
