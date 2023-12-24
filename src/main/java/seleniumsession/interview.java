package seleniumsession;

public class interview {

	public static void main(String[] args) {

		
		String str = "great  responsibility";
		
		int count = 0;
		for(int i = 0;i<= str.length();i++) {
			
			
			for(int j = i+1; j<str.length();j++) {
					
				
					if (str.charAt(i) == str.charAt(j) ) {
						
						count ++;
						if(count>=2) {
							System.out.println(str.charAt(i));
							
							break;
							
						}
						
						
						//System.out.println(str.charAt(i));
						
						//break;
						
						
					}
				
			}
			
			
		}
		
		
		
		

	}

}
