package handlingCookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RetrievingAllCookiesDemo {

	public static void main(String[] args) {
				
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");

		// Retrieving all the cookies which got dropped by www.ebay.com into the browser
		Set<Cookie> cookies = driver.manage().getCookies();
		
		Iterator<Cookie> itr = cookies.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		driver.quit();
	}
}
