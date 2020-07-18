package Day1;

import java.util.Scanner;

public class Forif {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		// int x;
		int x = input.nextInt();
		int y = input.nextInt();
		for (int i = x; i < y; i++) {
			if (i % 2 == 0) {

				System.out.println(i + "This is even number.");

			} else if (i != 0) {

				System.out.println(i + "This is odd number.");

			} else {
				System.out.println("This is not number.");
			}

		}

	}
}
