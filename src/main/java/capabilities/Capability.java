package capabilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability {
	
public static AndroidDriver<AndroidElement> capability () throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"My_emulator");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.fdroid.fdroid");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".views.main.MainActivity");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		return driver;
	}

}
