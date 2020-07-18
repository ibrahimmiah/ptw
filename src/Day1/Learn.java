package Day1;

public class Learn {
	public static void main(String[] args) {
		Learn.add(1, 6);

	}

	static void add(int x, int y) {
    int  sum= 0;
		for (int i = x; i < y; i++) {
			sum = sum+i;
			   System.out.println(i+" This is i");
			   
			if (i % 2 ==0) {

				System.out.println(i+" This is even number.");
			}else {
				System.out.println(i+" This is odd number.");
			}
        
			System.out.println(sum+" This is sum"+"\n"+"===================");
		}

	}

}
