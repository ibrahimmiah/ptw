package Day1;


public class Tax {
	
	
	public static void main(String[] args) {
		
		//Tax.expanse(1000, 2000, 1000, 198);
		//Tax.taxable();
		//System.out.println();
		
	double  x=Tax.Grossincome(10000)-Tax.expanse(100, 2000, 3000,200);
		
	System.out.println("net income : "+x);
	}
	static double Grossincome(double g) {
		System.out.println( "grossinc : "+g);
		return g;
		
		
		
	}
	
	static double expanse(double car,double gas, double toll,double etc) {
		
		double t= car+gas+toll+etc;
		System.out.println("expanse : "+t);
		return t;
		
		
		
		
	}
	/*static double taxable( ) {
		
		double p=Tax.Grossincome(10000)-Tax.expanse (2000, 4000, 800, 100);
		System.out.println("net : "+p);
			return p;	
				
	}*/
	
	

}
