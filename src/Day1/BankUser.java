package Day1;

import java.util.Scanner;

public class BankUser {
	static double a;
	static double b;
	//static double c;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Total out : ");
		a=input.nextDouble();
		System.out.print("Total in : ");
		
		b=input.nextDouble();
		System.out.println();
	   double	c= a-b;
		System.out.print("Total amount : "+c);
	   
	   
	}
	
	

}
