package Day1;

public class Nloop {
	public static void main(String[] args) {
		int i;
		int j;
		
		
		for(i= 1; i<=3; i++) {
			System.out.println("Outer loop start ssssss");
			
			for(j=1; j<=2; j++) {
				
				System.out.println("This is inner loop ***");
				
			}
			
			
			System.out.println("Outer loop end -------");
		}
		
		System.out.println("=====End======");
	}

}
