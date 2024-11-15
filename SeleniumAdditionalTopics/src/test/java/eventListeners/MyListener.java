package eventListeners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class MyListener implements WebDriverListener {

	// ich überschreibe nur einige Methoden
	
	public void afterClick(WebElement element) {
		System.out.println("afterClick - Clicking on an Element: " + element);
	}
	
	public void afterQuit(WebDriver driver) {
		System.out.println("afterQuit - Test execution completed");
	}
	
	
	public void beforeGet(WebDriver driver, String url) {
		System.out.println("beforeGet - Before navigated to: " + url);
	}
	
	public void afterGet(WebDriver driver, String url) {
		System.out.println("afterGet - After navigated to: " + url);
	}
	
	public void beforeTo(WebDriver.Navigation navigation, String url) {
		System.out.println("beforeTo - Before navigated to: " + url);
	}

	public void afterTo(WebDriver.Navigation navigation, String url) {	
		System.out.println("afterTo - After navigated to: " + url);		
	}

	
	public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
		System.out.println("beforeSendKeys - Before typing in an Element: " + element + " entered the value: ");
		
		for(int i=0; i<keysToSend.length; i++) {
			
			System.out.println(keysToSend[i]+ " " );
		}
	}
	
	public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
		System.out.println("afterSendKeys - After typing in an Element: " + element + " entered the value: ");
		
		for(int i=0; i<keysToSend.length; i++) {
			
			System.out.println(keysToSend[i]+ " " );
		}
	}

	
	public void beforeFindElement(WebDriver driver, By locator) {
		System.out.println("beforeFindElement - Before finding element by locator: " + locator.toString());
	}

	public void afterFindElement(WebDriver driver, By locator, WebElement result) {
		System.out.println("afterFindElement - After finding element: " + result);
	}

	public void beforeFindElement(WebElement element, By locator) {
		System.out.println("beforeFindElement(WebElement element, By locator) - Finding element: " + element);
	}

	public void afterFindElement(WebElement element, By locator, WebElement result) {	
		System.out.println("afterFindElement(WebElement element, By locator, WebElement result) - Finded element: " + element);
	}

	
	public void beforeClear(WebElement element) {
		System.out.println("beforeClear - Before clearing: " + element);
	}
	
	public void afterClear(WebElement element) {
		System.out.println("afterClear - After clearing: " + element);
	}
	
	
	public void beforeAccept(Alert alert) {
		System.out.println("beforeAccept - Before accepting alert");
	}
	
	public void afterAccept(Alert alert) {
		System.out.println("afterAccept - After accepting alert");
	}
	
	public void beforeDismiss(Alert alert) {
		System.out.println("beforeDismiss - Before dismiss alert");
	}

	public void afterDismiss(Alert alert) {
		System.out.println("afterDismiss - After dismiss alert");
	}
	
	
	public void beforeWindow(WebDriver.TargetLocator targetLocator, String nameOrHandle) {
		System.out.println("beforeWindow - Before switching to window: " + nameOrHandle);
	}
	
	public void afterWindow(
		      WebDriver.TargetLocator targetLocator, String nameOrHandle, WebDriver driver) {
		System.out.println("afterWindow - After switching to window: " + nameOrHandle);
	}

	
	public void beforeRefresh(WebDriver.Navigation navigation) {
		System.out.println("beforeRefresh - Before refreshing the page");
	}

	public void afterRefresh(WebDriver.Navigation navigation) {
		System.out.println("afterRefresh - After refreshing the page");
	}

	
	public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {
		System.out.println("beforeExecuteScript - Before executing the script: " + script);
	}

	public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {
		System.out.println("afterExecuteScript - After executing the script: " + script);
	}
	
	
	public void beforeGetText(WebElement element) {
		System.out.println("beforeGetText - Before retrieving the text from: " + element);
	}

	public void afterGetText(WebElement element, String result) {
		System.out.println("AfterGetText - After retrieving the text: '" + result + "' from: " + element);
	}

	
	public void beforeMaximize(WebDriver.Window window) {
		System.out.println("beforeMaximize - This action will be performed each time before WebDriver.Window.maximize() is called.");
	}

	public void afterMaximize(WebDriver.Window window) {
		System.out.println("afterMaximize - This action will be performed each time after WebDriver.Window.maximize() is called.");
	}  

	public void beforeFullscreen(WebDriver.Window window) {
		System.out.println("beforeFullscreen - This action will be performed each time before WebDriver.Window.fullscreen() is called.");
	}

	public void afterFullscreen(WebDriver.Window window) {
		System.out.println("afterFullscreen - This action will be performed each time after WebDriver.Window.fullscreen() is called.");
	}  

	
	public void beforeBack(WebDriver.Navigation navigation) {
		System.out.println("beforeBack - This action will be performed each time before WebDriver.Navigation.back() is called.");
	}

	public void afterBack(WebDriver.Navigation navigation) {
		System.out.println("afterBack - This action will be performed each time after WebDriver.Navigation.back() is called.");
	}

	public void beforeForward(WebDriver.Navigation navigation) {
		System.out.println("beforeForward - This action will be performed each time before WebDriver.Navigation.forward() is called.");
	}
	
	public void afterForward(WebDriver.Navigation navigation) {
		System.out.println("afterForward - This action will be performed each time after WebElement.findElements(By) is called.");
	}


	public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
		System.out.println("onError - Notifies registered listeners about an error that occurred during the execution of a decorated method in " + method.getName());
	}
	
	
}
