package corejava;

public interface Human {
void learning();
void learning(String str);
void work();

}
interface recruitment{
boolean screening(int  score);
boolean interview(boolean selected);
	
}
class programmer implements Human,recruitment{

	@Override
	public boolean screening(int score) {
		System.out.println("attendent screen test");
		int thresold=20;
		if(score>thresold)
			return true;
		return false;
	}

	@Override
	public boolean interview(boolean selected) {
		System.out.println("Attend interview");
		if(selected)
			return true;
		return false;
	}

	@Override
	public void learning(String str) {
	
		System.out.println("learn"+str);
		
		
	}

	@Override
	public void work() {
		System.out.println("dev application");
		
	}

	@Override
	public void learning() {
		// TODO Auto-generated method stub
		
	}
}
class HumanTest{
	public static void main(String[] args) {
		programmer pro=new programmer();
		pro.screening(30);
		pro.interview(false);
		pro.learning("coding");
		
		
	}
	
	
	
}	
	
