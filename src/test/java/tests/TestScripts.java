package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseClass;
import ElementAddress.HomePage;
import ElementAddress.Login;
import ElementAddress.PostCreation;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestScripts extends BaseClass{
	
	TestScripts(){
		super();
	}

    WebDriver driver;
    
    static ExtentReports report;
	static ExtentTest test;
	
    String appiumUrl="http://127.0.0.1:4723/wd/hub";
    
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() throws MalformedURLException, InterruptedException
	{
		report = new ExtentReports("C:\\Users\\ososa\\eclipse-workspace\\Mb01\\report\\report.html", true);
		test = report.startTest("Report of Login module");
		        DesiredCapabilities capabilities=new DesiredCapabilities();
		        capabilities.setCapability("automationName","UiAutomator2");
		        capabilities.setCapability("platformName","android");
		        capabilities.setCapability("deviceName","RT99621CA1A52610300");
		        capabilities.setCapability("appPackage","com.osos.spaarksapp");
		        capabilities.setCapability("appActivity","com.osos.spaarksapp.MainActivity");
		        capabilities.setCapability("autoGrantPermissions", "true");
		        capabilities.setCapability("noReset",false);
		        URL url=new URL(appiumUrl);
		        driver=new AndroidDriver(url,capabilities);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        //To Grant all permissions
		        //HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		        //browserstackOptions.put("autoAcceptAlerts", "true"); 
		        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
    
    @AfterMethod
	public void close()
	{
		driver.quit();
		report.endTest(test);
		report.flush();
	}
	
	//Open login page enter valid number and valid otp.
	@Test(priority = 1,retryAnalyzer = Retry.class)
	public void TC_Login_02() throws Exception{
		Login Login=new Login(driver);
		
		//scrolling
		 //MobileElement elementToClick = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Seemore\").instance(0))"));
			//elementToClick.click();
		
		
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		boolean visible = Login.FullNameIsDisplayed();
		Assert.assertEquals(visible, true,"After entering valid number and otp the create profile screen is not showing");
	}
	
	//Open login page enter wrong number and click on send otp button.
	@Test(priority = 2,retryAnalyzer = Retry.class)
	public void TC_Login_03() throws InterruptedException{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField("123456789");
		Login.ClickOnGetOtpButton();
		String text = Login.GetInvalidEnterPhoneNumberErrorMessage();
		Assert.assertEquals(text, data.getProperty("InvalidPhoneNumberErrorMessage"),"The invalid phone number error message is incorrect");
	}
	
	//While login enter valid number and wrong otp.
	@Test(priority = 3,retryAnalyzer = Retry.class)
	public void TC_Login_04() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1Wrong();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1500);
		String visible = Login.GetWrongOtpAlertMessageText();
		Assert.assertEquals(visible, data.getProperty("WrongOtpAlertMessage"),"The invalid otp alert message is incorrect");
	}
	
	//While creating new account after otp verification, first screen of create profile, after all the criteria fulfill click on next button.
	@Test(priority = 4,retryAnalyzer = Retry.class)
	public void TC_Login_05() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		Thread.sleep(1500);
		boolean visible = Login.LocationTextfieldIsDisplayed();
		Assert.assertEquals(visible, true,"After all criteria full fill of first screen of create profile the second screen is not displayed");
	}
	
	//After otp verification click on "create a business account insted" link.
	@Test(priority = 5,retryAnalyzer = Retry.class)
	public void TC_Login_06() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1500);
		Login.ClickOnCreateABusinessAccountInsteadLink();
		Login.ClickOnBusinessPopupNextButton();
		Thread.sleep(1000);
		boolean visible = Login.BusinessTitleTextfieldIsDisplayed();
		Assert.assertEquals(visible, true,"The Business account create profile first screen is not displayed");
	}
	
	//While login with phone number - Fill all valid credential in first screen of create profile.Fill all valid credential in second screen of create profile. and click on next button.
	@Test(priority = 6,retryAnalyzer = Retry.class)
	public void TC_Login_07() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1500);
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		//Image upload in profile picture
	      Login.ClickOnProfilePicture();
	      Login.ClickOnProfilePictureFirstImage();
	      Login.ClickOnImageUpload_NextButton();
		Login.SendTextInLocation("Hyderabad");
		Login.SendTextInBio(data.getProperty("Bio"));
		Login.SendTextInEmailAddress(BaseClass.RandomText()+data.getProperty("EmailAddress"));
		Login.ClickOnVerifyButton();
		boolean visibility = Login.Otp1IsDisplayed();
		Assert.assertEquals(visibility, true,"The email verification otp screen is not displayed");
	}
	
	//Validate the error message of Username & Fullname 
	@Test(priority = 7,retryAnalyzer = Retry.class)
	public void TC_Login_08() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1000);
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		Login.SendTextInUsernameTextField("89878658");
		String error1 = Login.Get_Username_ErrorMessage();
		String error2 = Login.GetFullNameErrorMessage();
		Assert.assertEquals(error1, data.getProperty("Username_Error_Message"), "The username error message is not same");
		Assert.assertEquals(error2, data.getProperty("FullName_Error_Message"), "The Fullname error message is not same");
	}

	//Create complete community account using phone number.
	@Test(priority = 8,retryAnalyzer = Retry.class)
	public void TC_Login_09() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Thread.sleep(500);
		Login.ClickOnGetOtpButton();
		Thread.sleep(500);
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1000);
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		//Image upload in profile picture
	      Login.ClickOnProfilePicture();
	      Login.ClickOnProfilePictureFirstImage();
	      Login.ClickOnImageUpload_NextButton();
		Login.SendTextInLocation("Hyderabad");
		Login.SendTextInBio(data.getProperty("Bio"));
		Login.SendTextInEmailAddress(BaseClass.RandomText()+data.getProperty("EmailAddress"));
		Login.ClickOnVerifyButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
		//HomePage.ClickOnProfile();
		//boolean visible = ProfilePage.EditProfileButtonIsDisplayed();
		//Assert.assertEquals(visible, true,"After creating the account it is not showing user profile");
	}
	
	//create complete business account using phone number
	@Test(priority = 9,retryAnalyzer = Retry.class)
	public void TC_Login_10() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1500);
		Login.ClickOnCreateABusinessAccountInsteadLink();
		Login.ClickOnBusinessPopupNextButton();
		Login.SendTextInBusinessAccountFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInBusinessAccountUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.SendTextInBusinessTitle(data.getProperty("BusinessTitle"));
		Login.TickMarkBusinessAccountCheckBox();
		Login.ClickOnNextButton();
		//Image upload in profile picture
	      Login.ClickOnProfilePicture();
	      Login.ClickOnProfilePictureFirstImage();
	      Login.ClickOnImageUpload_NextButton();
		Login.SendTextInLocation("Hyderabad");
		Login.SendTextInBio(data.getProperty("Bio"));
		Login.SendTextInEmailAddress(BaseClass.RandomText()+data.getProperty("EmailAddress"));
		Login.ClickOnVerifyButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
		//HomePage.ClickOnProfile();
		//boolean visible = ProfilePage.EditProfileButtonIsDisplayed();
		//Assert.assertEquals(visible, true,"After creating the account it is not showing user profile");
	}
	
	//Login with phone number after otp verification click on back button on top and click Yes on popup   
	@Test(priority = 10,retryAnalyzer = Retry.class)
	public void TC_Login_11() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1500);
		Login.ClickOnBackButtonOnTop1stScreen();
		Login.ClickOnExitLoginPopupYesButton();
	}
	
	// Login with phone number > fill all valid credential in 1st create profile screen > Click on next button. > click on back button on top. > and click Yes on popup
	@Test(priority = 11,retryAnalyzer = Retry.class)
	public void TC_Login_12() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Thread.sleep(500);
		Login.ClickOnGetOtpButton();
		Thread.sleep(500);
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1000);
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		Login.ClickOnBackButtonOnTop2ndScreen();
		Login.ClickOnExitLoginPopupYesButton();
	}
	
	// Login with phone number > fill all valid credential in 1st create profile screen > Click on next button. >Click on Finish_later button.
	@Test(priority = 12,retryAnalyzer = Retry.class)
	public void TC_Login_13() throws Exception{
		Login Login=new Login(driver);
		Thread.sleep(1000);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Thread.sleep(500);
		Login.ClickOnGetOtpButton();
		Thread.sleep(500);
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1000);
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		Login.ClickOnFinishLaterLink();
		Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
	}
	
	// Login with phone number > fill all valid credential in 1st create profile screen > Click on next button. > click on back button on top. > and click Cancel on popup
	@Test(priority = 13,retryAnalyzer = Retry.class)
	public void TC_Login_14() throws Exception{
		Login Login=new Login(driver);
		Thread.sleep(1000);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Thread.sleep(500);
		Login.ClickOnGetOtpButton();
		Thread.sleep(500);
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1000);
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		Login.ClickOnBackButtonOnTop2ndScreen();
		Login.ClickOnExitLoginPopupCancelButton();
		Assert.assertEquals(true, Login.LocationTextfieldIsDisplayed());
	}
	
	//Login with phone number > click on 'business account' link >click on next > Fill all the credential in create profile screen and click on next button > now click on back button on top > and click yes on popup
	@Test(priority = 14,retryAnalyzer = Retry.class)
	public void TC_Login_15() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1500);
		Login.ClickOnCreateABusinessAccountInsteadLink();
		Login.ClickOnBusinessPopupNextButton();
		Thread.sleep(1000);
		Login.SendTextInBusinessAccountFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInBusinessAccountUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.SendTextInBusinessTitle(data.getProperty("BusinessTitle"));
		Login.TickMarkBusinessAccountCheckBox();
		Login.ClickOnNextButton();
		Login.ClickOnBackButtonOnTop2ndScreen();
		Login.ClickOnExitLoginPopupYesButton();
		Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
	}
	
	//Login with phone number > click on business link > Fill all credential > Click on 'community link' > fill all credential and click on next button > fill all credential click on verify
	@Test(priority = 15,retryAnalyzer = Retry.class)
	public void TC_Login_16() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1500);
		Login.ClickOnCreateABusinessAccountInsteadLink();
		Login.ClickOnBusinessPopupNextButton();
		Thread.sleep(1000);
		Login.SendTextInBusinessAccountFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInBusinessAccountUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.SendTextInBusinessTitle(data.getProperty("BusinessTitle"));
		Login.TickMarkBusinessAccountCheckBox();
		Login.ClickOnCreateAcommunityAccountInsteadLink();
		Thread.sleep(1000);
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		//Image upload in profile picture
	      Login.ClickOnProfilePicture();
	      Login.ClickOnProfilePictureFirstImage();
	      Login.ClickOnImageUpload_NextButton();
	    Login.SendTextInLocation("Hyderabad");
     	Login.SendTextInBio(data.getProperty("Bio"));
	    Login.SendTextInEmailAddress(BaseClass.RandomText()+data.getProperty("EmailAddress"));
	    Login.ClickOnVerifyButton();
	    Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
	    Login.ClickOnVerifyOtpButton();
	    Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
	}
	
	//Login with phone number >In user name, enter an already existing name >verify  at the bottom, it will show suggestions.
	@Test(priority = 16,retryAnalyzer = Retry.class)
	public void TC_Login_17() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Login.ClickOnGetOtpButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Login.SendTextInUsernameTextField("abdul");
		Assert.assertEquals(Login.UsernameSuggetionsIsDisplayed(), true);
	}
	
	//Login with phone number > In Create profile first screen fill all with valid credential > In second screen select one image for profile picture and again change the profile picture and complete the profile by verifying the emai.
	@Test(priority = 17,retryAnalyzer = Retry.class)
	public void TC_Login_18() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Thread.sleep(500);
		Login.ClickOnGetOtpButton();
		Thread.sleep(500);
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1000);
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		//Image upload in profile picture
	      Login.ClickOnProfilePicture();
	      Login.ClickOnProfilePictureFirstImage();
	      Login.ClickOnImageUpload_NextButton();
              	Login.ClickOnProfilePicture();
              	Login.ClickOnProfilePicture();
              	Login.ClickOnProfilePictureSecondImage();
              	Login.ClickOnImageUpload_NextButton();
		Login.SendTextInLocation("Hyderabad");
		Login.SendTextInBio(data.getProperty("Bio"));
		Login.SendTextInEmailAddress(BaseClass.RandomText()+data.getProperty("EmailAddress"));
		Login.ClickOnVerifyButton();
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
	}
	
	//Login with phone number > Fill all credential in first create profile screen tick mark and remove the check box two times and click on next button, verify the second screen is shown.
	@Test(priority = 18,retryAnalyzer = Retry.class)
	public void TC_Login_19() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Thread.sleep(500);
		Login.ClickOnGetOtpButton();
		Thread.sleep(500);
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1000);
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.UnTickMarked_CheckBox();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		Assert.assertEquals(true, Login.LocationTextfieldIsDisplayed());
	}
	
	//Login with phone number > Enter full name, user name and clear again fill, Click on next button and verify
	@Test(priority = 19,retryAnalyzer = Retry.class)
	public void TC_Login_20() throws Exception{
		Login Login=new Login(driver);
		PostCreation PostCreation=new PostCreation(driver);
		PostCreation.ClickOnCreatePostPlusIcon();
		Login.SendInputInPhoneNumberTextField(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
		Thread.sleep(500);
		Login.ClickOnGetOtpButton();
		Thread.sleep(500);
		Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
		Login.ClickOnVerifyOtpButton();
		Thread.sleep(1000);
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.ClearTextInFullNameTextField();
		Login.SendTextInFullNameTextField(data.getProperty("FullName"));
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClearTextInUsernameTextField();
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		Assert.assertEquals(true, Login.LocationTextfieldIsDisplayed());
	}
	
	                                 //Gmail Login Scripts    
	
	/*//Login with gmail > fill all the credential in first screen of create profile > click on next button > fill all the credential in second screen of create profile and click on verify button > click on verify button on otp screen.
	@Test(priority = 18)
	public void TC_Login_19() throws Exception{
		Login Login=new Login(driver);
		HomePage HomePage=new HomePage(driver);
		HomePage.ClickOnLoginButton();
		Login.ClickOnGooggleButton();
		Login.ClickOnSecondMailID();
		Thread.sleep(1000);
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnEmailDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		//Image upload in profile picture
	      Login.ClickOnProfilePicture();
	      Login.ClickOnProfilePictureFirstImage();
	      Login.ClickOnImageUploadButton();
        Login.SendTextInLocation("Hyderabad");
       	Login.SendTextInBio(data.getProperty("Bio"));
  	    Login.SendPhoneNumberInEmailAccountPhoneNumber(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
  	    Login.ClickOnVerifyButton();
  	    Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
  	    Login.ClickOnVerifyOtpButton();
	}
	
	//Login with Email > click on business link > Fill all credential > Click on Next button > fill all credential and click on next button > verify the phone number otp.
	@Test(priority = 19)
	public void TC_Login_20() throws Exception{
		
		Login Login=new Login(driver);
		HomePage HomePage=new HomePage(driver);
		HomePage.ClickOnLoginButton();
		Login.ClickOnGooggleButton();
		Login.ClickOnSecondMailID();
		Thread.sleep(1000);
		Login.ClickOnCreateABusinessAccountInsteadLink();
		Login.ClickOnBusinessPopupNextButton();
		Login.SendTextInBusinessAccountUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.SendTextInBusinessTitle(data.getProperty("BusinessTitle"));
		Login.TickMarkBusinessAccountCheckBox();
		Login.ClickOnNextButton();
		//Image upload in profile picture
	      Login.ClickOnProfilePicture();
	      Login.ClickOnProfilePictureFirstImage();
	      Login.ClickOnImageUploadButton();
        Login.SendTextInLocation("Hyderabad");
     	Login.SendTextInBio(data.getProperty("Bio"));
	    Login.SendPhoneNumberInEmailAccountPhoneNumber(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
	    Login.ClickOnVerifyButton();
	    Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
	    Login.ClickOnVerifyOtpButton();
	}
	
	//Login with Email > click on 'business account' link >click on next > Fill all the credential in create profile screen and click on next button > now click on back button on top >and click yes on popup
	@Test(priority = 20)
	public void TC_Login_21() throws Exception{
		
		Login Login=new Login(driver);
		HomePage HomePage=new HomePage(driver);
		HomePage.ClickOnLoginButton();
		Login.ClickOnGooggleButton();
		Login.ClickOnSecondMailID();
		Thread.sleep(1000);
		Login.ClickOnCreateABusinessAccountInsteadLink();
		Login.ClickOnBusinessPopupNextButton();
		Login.SendTextInBusinessAccountUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.SendTextInBusinessTitle(data.getProperty("BusinessTitle"));
		Login.TickMarkBusinessAccountCheckBox();
		Login.ClickOnNextButton();
		Login.ClickOnBackButtonOnTop2ndScreen();
		Login.ClickOnExitLoginPopupYesButton();
	}
	
	//Login with Email >Fill all the credential in create profile screen and click on next button > now click on back button on top > and click yes on popup
	@Test(priority = 21)
	public void TC_Login_22() throws Exception{
		Login Login=new Login(driver);
		HomePage HomePage=new HomePage(driver);
		HomePage.ClickOnLoginButton();
		Login.ClickOnGooggleButton();
		Login.ClickOnSecondMailID();
		Thread.sleep(1000);
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnEmailDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		Login.ClickOnBackButtonOnTop2ndScreen();
		Login.ClickOnExitLoginPopupYesButton();
	}
	
	//Login with Email >Fill all the credential in create profile screen and click on next button >Now click on finish later link.
	@Test(priority = 22)
	public void TC_Login_23() throws Exception{
		Login Login=new Login(driver);
		HomePage HomePage=new HomePage(driver);
		HomePage.ClickOnLoginButton();
		Login.ClickOnGooggleButton();
		Login.ClickOnSecondMailID();
		Thread.sleep(1000);
		Login.SendTextInUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.ClickOnEmailDateOfBirthTextField();
		Login.ClickOnDateOfBirthOkButton();
		Login.TickMarkCheckBox();
		Login.ClickOnNextButton();
		Login.ClickOnFinishLaterLink();
	}
	
	//Login with Email >Click on business account link >click on next button on popup >Fill all the credential in create profile screen and click on next button >Now click on finish later link.
	@Test(priority = 23)
	public void TC_Login_24() throws Exception{
		Login Login=new Login(driver);
		HomePage HomePage=new HomePage(driver);
		HomePage.ClickOnLoginButton();
		Login.ClickOnGooggleButton();
		Login.ClickOnSecondMailID();
		Thread.sleep(900);
		Login.ClickOnCreateABusinessAccountInsteadLink();
		Login.ClickOnBusinessPopupNextButton();
		Login.SendTextInBusinessAccountUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.SendTextInBusinessTitle(data.getProperty("BusinessTitle"));
		Login.TickMarkBusinessAccountCheckBox();
		Login.ClickOnNextButton();
		Login.ClickOnFinishLaterLink();
	}
	
	//Login with Email >In user name, enter an already existing name >verify  at the bottom, it will show suggestions.
	@Test(priority = 24)
	public void TC_Login_25() throws Exception{
		Login Login=new Login(driver);
		HomePage HomePage=new HomePage(driver);
		HomePage.ClickOnLoginButton();
		Login.ClickOnGooggleButton();
		Login.ClickOnSecondMailID();
		Thread.sleep(1000);
		Login.SendTextInUsernameTextField("abdul");
		Object visibility = Login.UsernameSuggetionsIsDisplayed();
		Assert.assertEquals(visibility, true);
	}
	
	//Login with Email >switch to business Business account >In Create profile first screen fill all with valid credential > In second screen select one image for profile picture and again change the profile picture and complete the profile by verifying the emai.
	@Test(priority = 25)
	public void TC_Login_26() throws Exception{
		Login Login=new Login(driver);
		HomePage HomePage=new HomePage(driver);
		HomePage.ClickOnLoginButton();
		Login.ClickOnGooggleButton();
		Login.ClickOnSecondMailID();
		Thread.sleep(1000);
		Login.ClickOnCreateABusinessAccountInsteadLink();
		Login.ClickOnBusinessPopupNextButton();
		Login.SendTextInBusinessAccountUsernameTextField(data.getProperty("Username")+BaseClass.RandomText());
		Login.SendTextInBusinessTitle(data.getProperty("BusinessTitle"));
		Login.TickMarkBusinessAccountCheckBox();
		Login.ClickOnNextButton();
		//Image upload in profile picture
	      Login.ClickOnProfilePicture();
	      Login.ClickOnProfilePicture();
	      Login.ClickOnProfilePictureFirstImage();
	      Login.ClickOnImageUploadButton();
          Login.ClickOnProfilePicture();
          Login.ClickOnProfilePicture();
          Login.ClickOnProfilePictureSecondImage();
          Login.ClickOnImageUploadButton();
        Login.SendTextInLocation("Hyderabad");
        Login.SendTextInBio(data.getProperty("Bio"));
    	Login.SendPhoneNumberInEmailAccountPhoneNumber(data.getProperty("EnterPhoneNumberTextField")+BaseClass.MobileNumber());
    	Login.ClickOnVerifyButton();
    	Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
    	Login.ClickOnVerifyOtpButton();
	}
	
	//Login with Email  > Click on 'terms and services' link.
	@Test(priority = 26)
	public void TC_Login_27() throws Exception{
		Login Login=new Login(driver);
		HomePage HomePage=new HomePage(driver);
		HomePage.ClickOnLoginButton();
		Login.ClickOnGooggleButton();
		Login.ClickOnSecondMailID();
		Thread.sleep(1000);
		Login.ClickOnTermsOfServicesLink();
		Login.ClickOnTermsOfServicesLinkJustOnceBrowserButton();
		boolean visible = Login.TermsAndPoliciesPageIsDisplayed();
		Assert.assertEquals(visible, true);
	}*/
}