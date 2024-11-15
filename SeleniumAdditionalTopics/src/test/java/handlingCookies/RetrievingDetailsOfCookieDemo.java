package handlingCookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RetrievingDetailsOfCookieDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");

		// Retrieving all the cookies which got dropped by www.ebay.com into the browser
		Set<Cookie> cookies = driver.manage().getCookies();
		
		Iterator<Cookie> itr = cookies.iterator();
		
		while (itr.hasNext()) {
			
			Cookie cookie = itr.next();
			
			System.out.println("Name of the cookie: " + cookie.getName());
			System.out.println("Value of the cookie: " + cookie.getValue());
			System.out.println("Domain of the cookie: " + cookie.getDomain());
			System.out.println("Path of the cookie: " + cookie.getPath());
			System.out.println("Expiry of the cookie: " + cookie.getExpiry());
			System.out.println("---------------------------------------------------");
		}
		
		driver.quit();

	}
}
