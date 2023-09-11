package Base;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ElementAddress.HomePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

	WebDriver driver;
	public Properties data;
		//static ExtentReports report;
		//static ExtentTest test;
	//String appiumUrl="http://127.0.0.1:4723/wd/hub";
    WebDriverWait wait;
	 
	public BaseClass()
	{
		data = new Properties();
		File dataFile = new File(System.getProperty("user.dir")+"\\\\src\\\\test\\\\java\\\\TestData\\\\DataFile");
		try {
		FileInputStream fis = new FileInputStream(dataFile);
		data.load(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	/*@BeforeMethod
	public void setup() throws MalformedURLException
	{
		report = new ExtentReports("C:\\Users\\ososa\\eclipse-workspace\\Mb01\\report\\report.html", true);
		test = report.startTest("Report of Login module");
		        DesiredCapabilities capabilities=new DesiredCapabilities();
		        capabilities.setCapability("automationName","UiAutomator2");
		        capabilities.setCapability("platformName","android");
		        capabilities.setCapability("deviceName","RT99621CA1A52610300");
		        capabilities.setCapability("appPackage","com.osos.spaarksapp");
		        capabilities.setCapability("appActivity","com.osos.spaarksapp.MainActivity");
		        capabilities.setCapability("noReset",false);
		        URL url=new URL(appiumUrl);
		        driver=new AndroidDriver(url,capabilities);
		        HomePage HomePage=new HomePage(driver);
		        HomePage.ClickOnLogoutButton();
		        //To Grant all permissions
		        //HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		       // browserstackOptions.put("autoAcceptAlerts", "true"); 
		        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
		report.endTest(test);
		report.flush();
	}*/
	
	public static int MobileNumber() throws Exception {
		
		 Random generator = new Random();
		   generator.setSeed(System.currentTimeMillis());
		     
		   int num = generator.nextInt(99999) + 99999;
		   if (num < 100000 || num > 999999) {
		   num = generator.nextInt(99999) + 99999;
		   if (num < 100000 || num > 999999) {
		   throw new Exception("Unable to generate PIN at this time..");}}
		   return num;
		   }
	
	public static String RandomText() throws Exception
	   {
		    String alphabet = "abcdefghijklmnopqrstuvwxyz";
		    StringBuilder sb = new StringBuilder();
		    Random random = new Random(); 
		    int length = 7;
		    for(int i = 0; i < length; i++) {
		      int index = random.nextInt(alphabet.length());
		      char randomChar = alphabet.charAt(index);
		      sb.append(randomChar);
		    }
		    String randomString = sb.toString();
		    return randomString;
		  }
	
	/*public static String Scroll_Till_Elemet(String ElementName) throws Exception
	   {
		
		String seemore = "see more";
		MobileElement elementToClick = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + seemore + "\").instance(0))"));			
		elementToClick.click();
	   }*/
	  }