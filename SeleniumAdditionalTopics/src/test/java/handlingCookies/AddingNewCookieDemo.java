package handlingCookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddingNewCookieDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");

		// Retrieving all the cookies which got dropped by www.ebay.com into the browser
		Set<Cookie> cookies = driver.manage().getCookies();
		
		Iterator<Cookie> itr = cookies.iterator();
		while (itr.hasNext()) {
			
			Cookie cookie = itr.next();
			System.out.println(cookie.getName() + "--" + cookie.getValue());
		}
		
		// Add a new cookie
		Cookie c = new Cookie("**************QAFox.com**************", "Arun Motoori");
		driver.manage().addCookie(c);
		
		// again retrieving all the existing cookies freshly
		Set<Cookie> cookiesAfterDelete = driver.manage().getCookies();

		System.out.println("--------------------------------");
		
		Iterator<Cookie> itr2 = cookiesAfterDelete.iterator();
		while (itr2.hasNext()) {
			
			Cookie cookie = itr2.next();
			System.out.println(cookie.getName() + "--" + cookie.getValue());
		}
		
		driver.quit();
	}
}
