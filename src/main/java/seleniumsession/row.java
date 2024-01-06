package seleniumsession;

import java.util.Scanner;

public class row {

	public static void main(String[] args) {
		
		System.out.println("Enter Number to check Factorial :  ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp=1;
		
		if(a==0) {
			
			System.out.println("The factorial number of 0 is : 0");
		}else {
			
			for(int i = a; i >=1 ;i--) {
				
				 temp = temp * i;
				
			}
			
			System.out.println("The factorial number of "+ a +" is : " + temp );
				
		}
		

	}

}
