package Day1;



public class cost1 {
	
	
	public static void main(String[] args) {
		cost1 p= new cost1();
	double count=	p.dailysales(1000, 2000)-p.dailycost(200, 400, 400);
	
	System.out.println("This is my daily income : "+count);
	System.out.println("Goodluck");
	
	}
	
	double dailysales (double cash ,double card) {
	double	a= cash+card;
		return a;
		
		
	}
	double dailycost(double rent,double gas, double etc) {
	double	b= rent+ gas+ etc;
		return b;
		
	}


}
