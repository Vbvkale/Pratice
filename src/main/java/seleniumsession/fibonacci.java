package seleniumsession;

public class fibonacci {

	public static void main(String[] args) {
		
		
		String str = "alevela";
		int j=str.length()-1;
		
		for(int i=0;i<str.length();i++) {
			
				if(str.charAt(i) == str.charAt(j)){
					j--;
					
					if(j==1) {
						
						System.out.println("The String is palendrom");
						break;
					}
				}else {
					
					System.out.println("The string is not palendrom");
					break;
				}
				
			
		}
		
	
		

	}
	
	
	public static void oddno() {
		int a []= {2,3,5,4,5,2,4,3,5,2,4,4,2};
		int count =0;
		
		for(int i=0;i <a.length;i++) {
		
			if(a[i]%2!=0) {
				
				//System.out.println(a[i]+" The number is odd");
				count = count +1;
				
			}
		
		}
		
		System.out.println(count);
		
	}
	
	
	public static void febo() {
		
		int a = 5;
		int temp=0;
		int feb =1;
		
		
		for(int i=0;i <a;i++) {
			
			System.out.print(" "+temp);
			
			int c = temp + feb;
			temp = feb;
			feb = c;
			
			
		}
		// 0 1 1 2 3 5
	}

}
