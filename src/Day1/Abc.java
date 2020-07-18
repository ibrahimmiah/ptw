package Day1;

public class Abc {
	
	public static void main(String[] args) {
		Abc k = new Abc();
	int	p=k.add();
	int c=k.sub();
		System.out.println((k.sub()-k.add())*.02  );
		System.out.println(  k.sub()*.02);
	}
	
	int add(){
		int a=10;
		int b=20;
		int c= b/a;
	
		
		
		return c;
		
		
	}
int	sub(){
		
		int x =5;
		int y=10;
		int z= x*y;
		
		return z;
	}
	

}
