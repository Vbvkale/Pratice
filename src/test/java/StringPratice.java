import java.util.regex.Pattern;

import com.google.inject.matcher.Matcher;

public class StringPratice {

	public static void main(String[] args) {

		System.out.println(numbersInverted("test123code456"));
		
		System.out.println(numbersInverted("t1e2s3tc4o5d6e"));

	}

	static String numbersInverted(String str) {
		StringBuilder sb = new StringBuilder();
		java.util.regex.Matcher matcher = Pattern.compile("\\d+").matcher(str);
		
		int lastInitialPos = 0;
		while (matcher.find()) {
			int start = matcher.start();
			String inverted = new StringBuilder(matcher.group()).reverse().toString();
			sb.append(str.substring(lastInitialPos, start)).append(inverted);
			lastInitialPos = matcher.end();
		}
		if (sb.length() == 0) // If no number was found
			return str;
		else
			return sb.append(str.substring(lastInitialPos)).toString();
	}

}
