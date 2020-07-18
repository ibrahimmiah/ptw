package Day1;

public class cost2 {
	
	public static void main(String[] args) {
		
	double income=	cost2.dailysales(1000.40, 3000.69)- cost2.dailycaost(280.54, 340.50, 790.48);
		
		System.out.println("This is my yearle income : "+income*365);
		System.out.println("Good luck.");
		
		
		
	}
	
static	double dailysales(double card, double cash) {
	
	double a=card+cash;
	System.out.println("This is my daily sales : "+a);
	return a;
	
}
	


static double dailycaost(double rent,double gas,double etc) {
	
	double b=rent+gas+etc;
	System.out.println("This is my daily cost : "+b);
	return b;
	
	
	
}



}
