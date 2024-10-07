package testscript;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import capabilities.Capability;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class FDroid_Test extends Capability {
	
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException {
		
		driver = capability();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test(priority = 1)
	public void tc() throws InterruptedException {
		
		System.out.println("F-Droid Opened");
		 
		// clicked on nearby icon
		driver.findElement(MobileBy.AccessibilityId("Nearby")).click();
			
		// clicked on settings 
		driver.findElement(MobileBy.AccessibilityId("Settings")).click();
			
		// clicked on theme 
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Theme\"))")).click();
			
		// clicking on dark theme
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dark\")")).click();
			
		// clicked on categories icon
		driver.findElement(MobileBy.AccessibilityId("Categories")).click();
		
	}
	
	  @Test(priority = 2)
	    public void openNotifications() throws InterruptedException {
		    
	        // Open notifications or interact with elements in a list
	        driver.openNotifications();
	        Thread.sleep(10000);
	        
	        // cliked on do not disturb option
	        driver.findElement(MobileBy.AccessibilityId("Do Not Disturb.")).click();
	               
	        // Pressed the back button
	        driver.pressKey(new KeyEvent(AndroidKey.BACK));
	        Thread.sleep(5000);
	             
	    }
	  
	  @Test(priority = 3)
	    public void switchApp() throws InterruptedException {
		          
	        // Switched to generalStore app
	        driver.activateApp("com.androidsample.generalstore");
	           
	        // Wait and get the message text from the messaging app
	        Thread.sleep(5000);
	        String msg = driver.findElement(MobileBy.id("com.androidsample.generalstore:id/toolbar_title")).getText();
	        System.out.println(msg);
	       	        
	        // Perform app switch and press the Home button
	        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	        Thread.sleep(5000);
	             
	        //cliced on search icon
	        driver.findElement(MobileBy.AccessibilityId("Search")).click();
	        Thread.sleep(5000);
	        	        
	        // entering copy text in search 
	        driver.findElement(MobileBy.id("org.fdroid.fdroid:id/search")).sendKeys(msg);
	           
	    }  
	  
	  @AfterTest
	    public void tearDown() {
	        // Close the app and quit the driver session
	            driver.quit();
	        }
}
