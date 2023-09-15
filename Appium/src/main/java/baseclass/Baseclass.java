package baseclass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Baseclass {

	 public static AppiumDriver driver;
	    
	    @Parameters({"deviceName","udid", "platformVersion","url"})
	    public void setup(String deviceName, String udid,String platformVersion,String url) throws InterruptedException, MalformedURLException
	    {
	        DesiredCapabilities cap=new DesiredCapabilities();
	        cap.setCapability("deviceName", deviceName);
	        cap.setCapability("udid", udid);
	        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
	        cap.setCapability("appPackage", "com.android.calculator2");
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("platformVersion", platformVersion);
	        driver=new AppiumDriver(new URL(url), cap);
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        Thread.sleep(5000);
	     
	    }

	}
	

