package Day1;

public class cost {
	
	
	public static void main(String[] args) {
		cost k= new cost();
	double p=	k.dailysales()-k.dailycost();
		System.out.println("Yearly profit is : "+p*365);
	}
	
	double dailysales() {
		double cash = 1000.30, card = 2000.30;
		double x=cash+ card;
		System.out.println("Daily sales : "+x);
		return x;
	}
	
	double dailycost() {
		double car =300,insu = 400,gas = 500,etc =300.50;
		
		double y= car+insu+ gas+etc;
		System.out.println("Daily cost : "+ y);
		return y;
		
	}

}

