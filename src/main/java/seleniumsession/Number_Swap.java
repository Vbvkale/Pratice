package seleniumsession;

public class Number_Swap {

	
	
	public static void swap(int x, int y) {
		
	
		
		System.out.println( "Value before swaping : " + " X :"+ x +" Y : "+ y );
		
		x = x+y; // x = 2+3. x = 5 
		y= x-y;  // y = 5-3  y = 2
		x= x-y;  // x = 5-2 x = 3 
		
		System.out.println( "Value after swaping : " + " X :"+ x +" Y : "+ y );
		
	}
	
	public static void main(String[] args) {
		
		
		swap(2,3);

	}
	
}


