package Day1;

public class Ext extends input{
	public static void main(String[] args) {
		Ext m= new Ext();
		//m.in(10, 10);
		System.out.println(m.in(20, 30));
	}
	
	
	@Override
	public	int in(int x, int y) {
		return  x+y;
		
		
		
		
	}
@Override
	protected double in(double a, double b ) {
	System.out.println(" abul");
		return 5;
		
		
	}

	
	
	

}
