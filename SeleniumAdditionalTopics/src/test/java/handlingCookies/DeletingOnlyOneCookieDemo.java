package handlingCookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeletingOnlyOneCookieDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");

		// Retrieving all the cookies which got dropped by www.ebay.com into the browser
		Set<Cookie> cookies = driver.manage().getCookies();
		
		Iterator<Cookie> itr = cookies.iterator();
		while (itr.hasNext()) {
			
			Cookie cookie = itr.next();
			
			// Delete the cookie "ebay"
			if (cookie.getName().equals("ebay")) {
				
				System.out.println("Deleting the cookie: " + cookie.getName());
				driver.manage().deleteCookie(cookie);
				System.out.println("-------------------------------");
			}
		}
		
		// again retrieving all the existing cookies freshly
		Set<Cookie> cookiesAfterDelete = driver.manage().getCookies();
		
		Iterator<Cookie> itr2 = cookiesAfterDelete.iterator();
		while (itr2.hasNext()) {
			
			System.out.println(itr2.next().getName());
		}
		
		driver.quit();
	}
}
