package Day1;

public class Bank {
	//Bank k= new Bank();
	
	
	
	public static void main(String[] args) {
		Bank k= new Bank();
		//k.total(10000);
		//k.in(600);
		//k.out(200);
		double p = k.total(10000)+k.in(1000)-k.out(600);
		
		System.out.println("Total cash :" +p);
	}
	
  double total(double a) {
	  
	 // System.out.println("Total cash : "+a);  
	  return a;
  }
  
  double in (double b) {
	 
	 System.out.println("Cash in : "+b); 
	 return b;
  }
   double out(double c) {
	  
	  
	  System.out.println("Cash out : "+c);
	  return c;
  }

}
