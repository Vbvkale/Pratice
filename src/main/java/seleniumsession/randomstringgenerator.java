package seleniumsession;

import java.util.Random;

public class randomstringgenerator {

	public static void main(String[] args) {
		

		randomstringgenerator rn = new randomstringgenerator();
		rn.givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect();
		
	}
	
	public void givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    System.out.println(generatedString);

}
}