package seleniumsession;

import org.openqa.selenium.WebDriver;

public class tryutlmethods {

	public static void main(String[] args) {
		

		browserutl br = new browserutl();
		
		br.driverinit("chrome");
		
		br.launchUrl("https://www.facebook.com/");
		System.out.println(br.gettitle());
		br.maxbrowser();
		br.closebrowser();
		
		

	}

}
