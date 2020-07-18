package Co;

public class New {

	public static void main(String[] args) {

		int[] x = { 10, 2, 4, 5, 20 };
		int max = x[0];
		int min = x[0];
		//System.out.println("This is lenght of x : " + x.length);

		for (int i = 0; i < x.length; i++) {

			//System.out.println("This is index number " + i + " and value number is " + x[i]);
			if (x[i] > max) {

				max = x[i];
				System.out.println("This is max number " + max);

			}

			else if (x[i] < min) {

				min = x[i];
				System.out.println("This is min number " + min);
			}
			
		}

	}

}
