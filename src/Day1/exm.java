package Day1;

public class exm {
	
	public static void main(String[] args) {
	//double x=	exm.three(4000);
		//System.out.println(x);
		exm.one(100, 200);
		exm.two(300, 250);
		double p= exm.one(100, 200)- exm.two(300, 250);
		System.out.println("This is output: "+p);
	}
	
	static  double one(double a, double b) {
		
	double	c= a+b;
	
	return c;
		
	}
	
	static double two(double d, int e) {
		
		double f =d+e;
		return f;
		
	}
	/*static double three(double total) {
		
		total=exm.one(1000, 1200)+exm.two(2000, 300);
		return total;
	}*/
	

	}


