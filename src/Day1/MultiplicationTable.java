package Day1;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m,n;
		
		System.out.print("Enter initital number : ");
		m= input.nextInt();
		System.out.print("Enter final number : ");
		n= input.nextInt();
		System.out.println("*============*");
		for(int i=m; i<=n; i++) {
			for(int j=1;j<=10;j++) {
				
				System.out.println(i+"X"+j+" = "+i*j);	
				
			}
			
			System.out.println("*=============*");
		}
		
	}

}
