
public class Father  extends Son{

	@Override
	 void add() {
		
		
		System.out.println("hi");
	}
	
	
	public static void main(String[] args) {
		Father f=new Father();
		f.add();
	}
}
