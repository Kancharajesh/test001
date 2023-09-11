package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseClass;
import ElementAddress.HomePage;
import ElementAddress.Login;
import ElementAddress.PostCreation;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class PostCreationTests extends BaseClass{
	
	PostCreationTests(){
		super();
	}

    AndroidDriver driver;
    
    static ExtentReports report;
	static ExtentTest test;
	 DesiredCapabilities capabilities=new DesiredCapabilities();
	
    String appiumUrl="http://127.0.0.1:4723/wd/hub";
    
	@BeforeMethod
	public void setup() throws MalformedURLException, InterruptedException
	{
		report = new ExtentReports("C:\\Users\\ososa\\eclipse-workspace\\Mb01\\report\\report.html", true);
		test = report.startTest("Report of Login module");
		       
		        capabilities.setCapability("automationName","UiAutomator2");
		        capabilities.setCapability("platformName","android");
		        capabilities.setCapability("deviceName","RT99621CA1A52610300");
		        capabilities.setCapability("appPackage","com.osos.spaarksapp");
		        capabilities.setCapability("appActivity","com.osos.spaarksapp.MainActivity");
		        capabilities.setCapability("autoGrantPermissions", "true");
		        //capabilities.setCapability("noReset",false);
		        URL url=new URL(appiumUrl);
		        driver=new AndroidDriver(url,capabilities);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    	capabilities.setCapability("noReset",false);
		    	PostCreation PostCreation=new PostCreation(driver);
		    	PostCreation.ClickOnCreatePostPlusIcon();
		    	Login Login=new Login(driver);
				Login.SendInputInPhoneNumberTextField(data.getProperty("ExixtingAccount"));
				Login.ClickOnGetOtpButton();
				Login.SendOtp1();Login.SendOtp2();Login.SendOtp3();Login.SendOtp4();Login.SendOtp5();Login.SendOtp6();
				Login.ClickOnVerifyOtpButton();
	} 
    
    @AfterMethod
	public void close()
	{
		driver.quit();
		report.endTest(test);
		report.flush();
	}
    
	                                                             //JOB
	
    //>login with phone number >Click on plus icon select jobs >enter all the credential except photo and click on post button.
    @Test(priority = 1,retryAnalyzer = Retry.class)
	public void TC_PostCreation_01() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreateProfilePlusIconJobOption();
    	PostCreation.SendTextInJobTitle(data.getProperty("JobTitle"));
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.SendTextInJobDescription(data.getProperty("JobDescription"));
    	PostCreation.SendTextInJobSkills(data.getProperty("JobSkills"));
    	PostCreation.ClickOnJobSkills();
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
    //Open the job directly from plus icon, Without entering any data in job click on post and verify the 'Required' text should display on Job title,summary,description,skills and verify the required text should display only where text is not written(accept skill).
    @Test(priority = 2,retryAnalyzer = Retry.class)
	public void TC_PostCreation_02() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreateProfilePlusIconJobOption();
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.JobTitleReuiredTextIsDisplayed(),"Job title required text is not displayed");
    	Assert.assertEquals(true, PostCreation.JobSummaryReuiredTextIsDisplayed(),"Job Summary required text is not displayed");
    	Assert.assertEquals(true, PostCreation.JobDescriptionReuiredTextIsDisplayed(),"Job Description required text is not displayed");
    	Assert.assertEquals(true, PostCreation.JobSkillsReuiredTextIsDisplayed(),"Job skill required text is not displayed");
    	PostCreation.SendTextInJobTitle(data.getProperty("JobTitle"));
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.SendTextInJobDescription(data.getProperty("JobDescription"));
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.JobSkillsReuiredTextIsDisplayed(),"Job skill required text is not displayed when only skill is empty");
    	PostCreation.ClearTextInJobDescription();
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.JobDescriptionReuiredTextIsDisplayed(),"Job Description required text is not displayed when only Description is empty");
    	PostCreation.ClearTextInJobSummary();
    	Thread.sleep(1000);
    	PostCreation.SendTextInJobDescription(data.getProperty("JobDescription"));
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.JobSummaryReuiredTextIsDisplayed(),"Job Summary required text is not displayed when only Summary is empty");
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.ClearTextInJobTitle();
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.JobTitleReuiredTextIsDisplayed(),"Job title required text is not displayed when only Summary is empty");
    }
    
    //Open the job directly from plus icon, Fill all credential in job select 5 images and post job
    @Test(priority = 3,retryAnalyzer = Retry.class)
   	public void TC_PostCreation_03() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreateProfilePlusIconJobOption();
       	PostCreation.SendTextInJobTitle(data.getProperty("JobTitle"));
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.SendTextInJobDescription(data.getProperty("JobDescription"));
    	PostCreation.SendTextInJobSkills(data.getProperty("JobSkills"));
    	PostCreation.ClickOnJobSkills();
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    	PostCreation.ClickOnJobAddImage();
    	PostCreation.Select1stImage();
    	PostCreation.Select2stImage();
    	PostCreation.Select3stImage();
    	PostCreation.Select4stImage();
    	PostCreation.Select5stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
  //Open the job directly from plus icon, Fill all credential in job select 5 images and delete the images again add 3 images and post job.
    @Test(priority = 4,retryAnalyzer = Retry.class)
    public void TC_PostCreation_04() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreateProfilePlusIconJobOption();
       	PostCreation.SendTextInJobTitle(data.getProperty("JobTitle"));
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.SendTextInJobDescription(data.getProperty("JobDescription"));
    	PostCreation.SendTextInJobSkills(data.getProperty("JobSkills"));
    	PostCreation.ClickOnJobSkills();
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    	PostCreation.ClickOnJobAddImage();
    	PostCreation.Select1stImage();
    	PostCreation.Select2stImage();
    	PostCreation.Select3stImage();
    	PostCreation.Select4stImage();
    	PostCreation.Select5stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOnJobAddImage_DeleteButton();
    	PostCreation.ClickOnJobAddImage_DeleteButton();
    	PostCreation.ClickOnJobAddImage_DeleteButton();
    	PostCreation.ClickOnJobAddImage_DeleteButton();
    	PostCreation.ClickOnJobAddImage_DeleteButton();
    	PostCreation.ClickOnJobAddImage();
    	PostCreation.Select1stImage();
    	PostCreation.Select2stImage();
    	PostCreation.Select3stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
  //Open the job from inside, Fill all credential in job select 5 images and post job
    @Test(priority = 5,retryAnalyzer = Retry.class)
    public void TC_PostCreation_05() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnJobOption();
       	PostCreation.SendTextInJobTitle(data.getProperty("JobTitle"));
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.SendTextInJobDescription(data.getProperty("JobDescription"));
    	PostCreation.SendTextInJobSkills(data.getProperty("JobSkills"));
    	PostCreation.ClickOnJobSkills();
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    	PostCreation.ClickOnJobAddImage();
    	Thread.sleep(900);
    	PostCreation.Select1stImage();
    	PostCreation.Select2stImage();
    	PostCreation.Select3stImage();
    	PostCreation.Select4stImage();
    	PostCreation.Select5stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
    //Open the job from inside, Fill some credential, click on back button verify the Draft pop up should display, click on back button and delete.
    @Test(priority = 6,retryAnalyzer = Retry.class)
    public void TC_PostCreation_06() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnJobOption();
       	PostCreation.SendTextInJobTitle(data.getProperty("JobTitle"));
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.ClickOnJobBackButtonOnTop();
    	Assert.assertEquals(true, PostCreation.JobBackButton_OnTop_Popup_DeleteButton_IsDisplayed(),"In job when we fill some fields and after clicking on back button on top it is not showing the Draft popup");
    	PostCreation.ClickOnJobBackButton_OnTop_Popup_DeleteButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    //Open the job from inside, Create a job by adding 10 skills and 2 images.
    @Test(priority = 7,retryAnalyzer = Retry.class)
    public void TC_PostCreation_07() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnJobOption();
       	PostCreation.SendTextInJobTitle(data.getProperty("JobTitle"));
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.SendTextInJobDescription(data.getProperty("JobDescription"));
       	PostCreation.ClickOnJobSkills();
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.B));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.D));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.F));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));;
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.G));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.H));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.J));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    	PostCreation.ClickOnJobAddImage();
    	Thread.sleep(900);
    	PostCreation.Select1stImage();
    	PostCreation.Select2stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
  //Open the job from inside, Fill all the credential and 2 images add two skills and delete one then post the job.
    @Test(priority = 8,retryAnalyzer = Retry.class)
    public void TC_PostCreation_08() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnJobOption();
       	PostCreation.SendTextInJobTitle(data.getProperty("JobTitle"));
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.SendTextInJobDescription(data.getProperty("JobDescription"));
    	PostCreation.ClickOnJobSkills();
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.B));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    	PostCreation.ClickOnJobSkillsCancelButton();
    	PostCreation.ClickOnJobAddImage();
    	Thread.sleep(900);
    	PostCreation.Select1stImage();
    	PostCreation.Select3stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOnJobPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    //Open the job from inside, Add text in summary ,navigate to product check that text is visible in product description, navigate to poll check same text should display. navigate to job fill all remaining category and post the job.
    @Test(priority = 9,retryAnalyzer = Retry.class)
    public void TC_PostCreation_09() throws Exception{

    }
    
    //Open the job directly from plus icon, Save one job in draft , open the draft and delete that job, validate the post get deleted.
    @Test(priority =10,retryAnalyzer = Retry.class)
   	public void TC_PostCreation_10() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       		String text=data.getProperty("JobTitle")+BaseClass.RandomText();
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreateProfilePlusIconJobOption();
       	PostCreation.SendTextInJobTitle(text);
    	PostCreation.SendTextInJobSummary(data.getProperty("JobSummary"));
    	PostCreation.ClickOnJobBackButtonOnTop();
    	PostCreation.ClickOnJobBackButton_OnTop_Popup_SaveDraftButton();
    		PostCreation.ClickOnCreatePostPlusIcon();
    		PostCreation.ClickOnCreateProfilePlusIconJobOption();
       	PostCreation.ClickOnJobDraftButton();
       	PostCreation.ClickOnJobDraft_DeleteButton();
       	PostCreation.ClickOn_IsideJobDraft_DeletePopup_yesButton();
       	Assert.assertNotEquals(text,PostCreation.GetFirstPosition_JobTitleText_FromDraft());
    }
    
  //Open the job directly from plus icon, Save one job in draft , open the draft and Edit that job , And save in draft , validate the changes.
    @Test(priority =11,retryAnalyzer = Retry.class)
   	public void TC_PostCreation_11() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	String text=data.getProperty("JobTitle")+BaseClass.RandomText();
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreateProfilePlusIconJobOption();
       	PostCreation.SendTextInJobTitle(data.getProperty("JobTitle")+BaseClass.RandomText());
       	PostCreation.ClickOnJobBackButtonOnTop();
    	PostCreation.ClickOnJobBackButton_OnTop_Popup_SaveDraftButton();
    		/*PostCreation.ClickOnCreatePostPlusIcon();
    		PostCreation.ClickOnCreateProfilePlusIconJobOption();
    		PostCreation.ClickOnJobDraftButton();*/
       	Thread.sleep(900);
       	PostCreation.ClickOnJobDraft_EditButton();
       	PostCreation.ClearTextInJobTitle();
       	PostCreation.SendTextInJobTitle(text);
       	PostCreation.ClickOnJobDraftBack_ButtonOnTop();
       	PostCreation.ClickOnJobBackButton_OnTop_Popup_SaveDraftButton();
    	PostCreation.ClickOnJobDraft_EditButton();
    	Assert.assertEquals(PostCreation.GetJobTitle_Text(), text);
    }
                                                                                 //PRODUCT
    
   //Open the product from inside, Fill all credential and upload 1 images and click on post button.
    @Test(priority = 12,retryAnalyzer = Retry.class)
    public void TC_PostCreation_12() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnProductOption();
       	PostCreation.SendTextIn_ProductTitle(data.getProperty("ProductTitle"));
       	PostCreation.SendTextIn_ProductPrice(data.getProperty("ProductPrice"));
       	PostCreation.SendTextIn_ProductDescription(data.getProperty("ProductDescription"));
       	PostCreation.ClickOn_ProductAddImage();
       	Thread.sleep(900);
    	PostCreation.Select1stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOn_ProductPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
    //Open the product from inside, Fill all credential and upload 5 images and click on post button.
    @Test(priority = 13,retryAnalyzer = Retry.class)
    public void TC_PostCreation_13() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnProductOption();
       	PostCreation.SendTextIn_ProductTitle(data.getProperty("ProductTitle"));
       	PostCreation.SendTextIn_ProductPrice(data.getProperty("ProductPrice"));
       	PostCreation.SendTextIn_ProductDescription(data.getProperty("ProductDescription"));
       	PostCreation.ClickOn_ProductAddImage();
       	Thread.sleep(900);
    	PostCreation.Select1stImage();
    	PostCreation.Select2stImage();
    	PostCreation.Select3stImage();
    	PostCreation.Select4stImage();
    	PostCreation.Select5stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOn_ProductPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
  //Open the product from inside, Click on post the required text should shown on field, if we enter text in a particular field and click on post, that field required text should get disappear.
    @Test(priority = 14)
    public void TC_PostCreation_14() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnProductOption();
       	PostCreation.ClickOn_ProductPostButton();
       	System.out.println(PostCreation.Get_ProductTitle_and_Required_FullText());
       	System.out.println(PostCreation.Get_ProductPrice_and_Required_FullText());
       	System.out.println(PostCreation.Get_ProductDescription_and_Required_FullText());
       	
       		/*Assert.assertEquals(false, PostCreation.Get_ProductTitle_and_Required_FullText().contains("Required"),"job title required text is not displayed");
       		Assert.assertEquals(false, PostCreation.Get_ProductPrice_and_Required_FullText().contains("Required"),"job price required text is not displayed");
       		Assert.assertEquals(false, PostCreation.Get_ProductDescription_and_Required_FullText().contains("Required"),"job Description required text is not displayed");
       		Assert.assertEquals(false, PostCreation.Get_ProductAddImage_and_Required_FullText().contains("Required"));
    	PostCreation.SendTextIn_ProductTitle(data.getProperty("ProductTitle"));
    		Assert.assertEquals(false, PostCreation.Get_ProductTitle_and_Required_FullText().contains("Required"));
    	PostCreation.SendTextIn_ProductPrice(data.getProperty("ProductPrice"));
    		Assert.assertEquals(false, PostCreation.Get_ProductPrice_and_Required_FullText().contains("Required"));
       	PostCreation.SendTextIn_ProductDescription(data.getProperty("ProductDescription"));
       		Assert.assertEquals(false, PostCreation.Get_ProductDescription_and_Required_FullText().contains("Required"));*/
    }
    
    //Open the product from inside, Add product in draft with Product title , price , description. And edit then validate
    @Test(priority = 15,retryAnalyzer = Retry.class)
    public void TC_PostCreation_15() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnProductOption();
       	PostCreation.SendTextIn_ProductTitle(data.getProperty("ProductTitle"));
       	PostCreation.SendTextIn_ProductPrice(data.getProperty("ProductPrice"));
       	PostCreation.SendTextIn_ProductDescription(data.getProperty("ProductDescription"));
       	PostCreation.ClickOn_Product_BackButton();
    	PostCreation.ClickOnJobBackButton_OnTop_Popup_SaveDraftButton();
    		/*PostCreation.ClickOnCreatePostPlusIcon();
    		PostCreation.ClickOnCreateProfilePlusIconProductsOption();
    		PostCreation.ClickOn_Product_Draft_Button();*/
    	PostCreation.ClickOn_Product_Draft_EiditButton();
    	Assert.assertEquals(data.getProperty("ProductTitle"),PostCreation.GetText_from_ProductTitle());
    	Assert.assertEquals(data.getProperty("ProductPrice"),PostCreation.GetText_from_ProductPrice());
    	Assert.assertEquals(data.getProperty("ProductDescription"),PostCreation.GetText_from_ProductDescription());
    }
    
    //Open the product from inside, fill all credential and close the app open it again, validate & post.
    @Test(priority = 16,retryAnalyzer = Retry.class)
    public void TC_PostCreation_16() throws Exception{
       
    }
    
  //Open the Normal post ,send text, navigate to product, fill product title and price, one image and post the product.
    @Test(priority = 17,retryAnalyzer = Retry.class)
    public void TC_PostCreation_17() throws Exception{
       	PostCreation PostCreation=new PostCreation(driver);
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("CommunityPostText"));
       	PostCreation.ClickOnProductOption();
       	Assert.assertEquals(data.getProperty("CommunityPostText"), PostCreation.GetText_from_ProductDescription());
       	PostCreation.SendTextIn_ProductTitle(data.getProperty("ProductTitle"));
       	PostCreation.SendTextIn_ProductPrice(data.getProperty("ProductPrice"));
       	PostCreation.ClickOn_ProductAddImage();
       	Thread.sleep(900);
    	PostCreation.Select1stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
    //Open the product from inside, fill product title and price,description one image and save it in draft, in draft click on edit validate the data and post the product.
    @Test(priority = 18,retryAnalyzer = Retry.class)
    public void TC_PostCreation_18() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnProductOption();
    	PostCreation.SendTextIn_ProductTitle(data.getProperty("ProductTitle"));
    	PostCreation.SendTextIn_ProductPrice(data.getProperty("ProductPrice"));
    	PostCreation.SendTextIn_ProductDescription(data.getProperty("ProductDescription"));
    	PostCreation.ClickOn_ProductAddImage();
    	Thread.sleep(900);
    	PostCreation.Select1stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOn_Product_BackButton();
    	PostCreation.ClickOn_Product_BackButton_OnTop_Save();
    		/*PostCreation.ClickOnCreatePostPlusIcon();
    		PostCreation.ClickOnCreateProfilePlusIconProductsOption();
    		PostCreation.ClickOn_Product_Draft_Button();*/
    	PostCreation.ClickOn_Product_Draft_EiditButton();
    	Assert.assertEquals(data.getProperty("ProductTitle"), PostCreation.GetText_from_ProductTitle());
    	Assert.assertEquals(data.getProperty("ProductPrice"), PostCreation.GetText_from_ProductPrice());
    	Assert.assertEquals(data.getProperty("ProductDescription"),PostCreation.GetText_from_ProductDescription() );
    	PostCreation.ClickOn_ProductPostButton();
    	//Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
    //Open the product from inside, Fill all the credential and save it in draft, open the draft make some changes and again save it in draft, again edit it validate the data is updated.
    @Test(priority = 19,retryAnalyzer = Retry.class)
    public void TC_PostCreation_19() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnProductOption();
    	PostCreation.SendTextIn_ProductTitle(data.getProperty("ProductTitle"));
    	PostCreation.SendTextIn_ProductPrice(data.getProperty("ProductPrice"));
    	PostCreation.SendTextIn_ProductDescription(data.getProperty("ProductDescription"));
    	PostCreation.ClickOn_ProductAddImage();
    	Thread.sleep(900);
    	PostCreation.Select1stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOn_Product_BackButton();
    	PostCreation.ClickOn_Product_BackButton_OnTop_Save();
    		/*PostCreation.ClickOnCreatePostPlusIcon();
    		PostCreation.ClickOnCreateProfilePlusIconProductsOption();
    		PostCreation.ClickOn_Product_Draft_Button();*/
    	PostCreation.ClickOn_Product_Draft_EiditButton();
    	PostCreation.Clear_TextIn_ProductTitle();
    	PostCreation.Clear_TextIn_ProductPrice();
    	PostCreation.Clear_TextIn_ProductDescription();
    	PostCreation.SendTextIn_ProductTitle(data.getProperty("ProductTitle_1"));
    	PostCreation.SendTextIn_ProductPrice(data.getProperty("ProductPrice_1"));
    	PostCreation.SendTextIn_ProductDescription(data.getProperty("ProductDescription_1"));
    	PostCreation.ClickOn_ProductDraft_BackButton();
    	PostCreation.ClickOn_Product_BackButton_OnTop_Save();
    		//PostCreation.ClickOnCreatePostPlusIcon();
    		//PostCreation.ClickOnCreateProfilePlusIconProductsOption();
    		//PostCreation.ClickOn_Product_Draft_Button();
    	PostCreation.ClickOn_Product_Draft_EiditButton();
    	Assert.assertEquals(data.getProperty("ProductTitle_1"),PostCreation.GetText_from_ProductTitle());
    	Assert.assertEquals(data.getProperty("ProductPrice_1"),PostCreation.GetText_from_ProductPrice());
    	Assert.assertEquals(data.getProperty("ProductDescription_1"),PostCreation.GetText_from_ProductDescription());
    }
    //Open the product from inside, Save a product in draft, click on job open the draft select product click on edit and post the product.
    @Test(priority = 20,retryAnalyzer = Retry.class)
    public void TC_PostCreation_20() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.ClickOnProductOption();
    	PostCreation.SendTextIn_ProductTitle(data.getProperty("ProductTitle"));
    	PostCreation.SendTextIn_ProductPrice(data.getProperty("ProductPrice"));
    	PostCreation.SendTextIn_ProductDescription(data.getProperty("ProductDescription"));
    	PostCreation.ClickOn_ProductAddImage();
    	Thread.sleep(900);
    	PostCreation.Select1stImage();
    	PostCreation.ClickOnSaveButtonAfterSelectingTheImages();
    	PostCreation.ClickOn_Product_BackButton();
    	PostCreation.ClickOn_Product_BackButton_OnTop_Save();
    		PostCreation.ClickOn_Draft_Page_BackButton();
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreateProfilePlusIconJobOption();
    	PostCreation.ClickOnJobDraftButton();
    	PostCreation.ClickOnDraft_Page_DropDownButton();
    	PostCreation.SelectDraft_Page_DropDown_ProductOption();
    	PostCreation.ClickOn_Product_Draft_EiditButton();
    	PostCreation.ClickOn_ProductPostButton();
    	//Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
                                                                  //POLL
    //Open the poll from inside, create two choice poll in community
    @Test(priority = 21,retryAnalyzer = Retry.class)
    public void TC_PostCreation_21() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
    //Open the poll from inside, create three choice poll in community
    @Test(priority = 22,retryAnalyzer = Retry.class)
    public void TC_PostCreation_22() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       		PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_3(data.getProperty("ChoiceThree"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
    //Open the poll from inside, create four choice poll in community
    @Test(priority = 23,retryAnalyzer = Retry.class)
    public void TC_PostCreation_23() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       		PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_3(data.getProperty("ChoiceThree"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_4(data.getProperty("ChoiceFour"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
    //Open the poll from inside, Post two/three/four choice poll in friends.validate Home_post_plus icon should display.
    @Test(priority = 24,retryAnalyzer = Retry.class)
    public void TC_PostCreation_24() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.ClickOn_DropDown_Postto();
       	PostCreation.ClickOn_DropDown_Postto_FriendsOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.ClickOn_DropDown_Postto();
       	PostCreation.ClickOn_DropDown_Postto_FriendsOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       		PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_3(data.getProperty("ChoiceThree"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.ClickOn_DropDown_Postto();
       	PostCreation.ClickOn_DropDown_Postto_FriendsOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       		PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_3(data.getProperty("ChoiceThree"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_4(data.getProperty("ChoiceFour"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
  //Open the poll from inside, Post two/three/four choice poll in market. validate Home_post_plus icon should display.
    @Test(priority = 25,retryAnalyzer = Retry.class)
    public void TC_PostCreation_25() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.ClickOn_DropDown_Postto();
       	PostCreation.ClickOn_DropDown_Postto_MarketOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.ClickOn_DropDown_Postto();
       	PostCreation.ClickOn_DropDown_Postto_MarketOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       		PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_3(data.getProperty("ChoiceThree"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
       	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.ClickOn_DropDown_Postto();
       	PostCreation.ClickOn_DropDown_Postto_MarketOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       		PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_3(data.getProperty("ChoiceThree"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_4(data.getProperty("ChoiceFour"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
  //Open the poll from inside,Post poll in community when Spaarks call is enable both other are disable.
    @Test(priority = 26,retryAnalyzer = Retry.class)
    public void TC_PostCreation_26() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOnContactOption();
       	if(PostCreation.IsEnable_ContactOption_SpaarksCall_Option()==false)
       	{
       		PostCreation.ClickOn_ContactOption_SpaarksCall_Option();
       	}
       	if(PostCreation.IsEnable_ContactOption_NormalCall_Option()==false)
       	{
       		System.out.println(PostCreation.IsEnable_ContactOption_NormalCall_Option());
       		PostCreation.ClickOn_ContactOption_NormalCall_Option();
       	}
       	if(PostCreation.IsEnable_ContactOption_Chat_Option()==false)
       	{
       		PostCreation.ClickOn_ContactOption_Chat_Option();
       	}
       	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
  //Open the poll from inside,Post poll in community when Spaarks call is disable both other are enable.
    @Test(priority = 27,retryAnalyzer = Retry.class)
    public void TC_PostCreation_27() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOnContactOption();
       	if(PostCreation.IsEnable_ContactOption_SpaarksCall_Option()==true)
       	{
       		PostCreation.ClickOn_ContactOption_SpaarksCall_Option();
       	}
       	if(PostCreation.IsEnable_ContactOption_NormalCall_Option()==true)
       	{
       		System.out.println(PostCreation.IsEnable_ContactOption_NormalCall_Option());
       		PostCreation.ClickOn_ContactOption_NormalCall_Option();
       	}
       	if(PostCreation.IsEnable_ContactOption_Chat_Option()==true)
       	{
       		PostCreation.ClickOn_ContactOption_Chat_Option();
       	}
       	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
  //Open the poll from inside,Post poll in market when Spaarks call is disable both other are enable.
    @Test(priority = 28,retryAnalyzer = Retry.class)
    public void TC_PostCreation_28() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
       	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       	PostCreation.Click_On_PollOption();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOnContactOption();
       	if(PostCreation.IsEnable_ContactOption_SpaarksCall_Option()==true)
       	{
       		PostCreation.ClickOn_ContactOption_SpaarksCall_Option();
       	}
       	if(PostCreation.IsEnable_ContactOption_NormalCall_Option()==true)
       	{
       		System.out.println(PostCreation.IsEnable_ContactOption_NormalCall_Option());
       		PostCreation.ClickOn_ContactOption_NormalCall_Option();
       	}
       	if(PostCreation.IsEnable_ContactOption_Chat_Option()==true)
       	{
       		PostCreation.ClickOn_ContactOption_Chat_Option();
       	}
       	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
       	PostCreation.ClickOn_DropDown_Postto();
       	PostCreation.ClickOn_DropDown_Postto_MarketOption();
    	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    //Open the community post from out side, Send text in question, navigate to poll and fill other two poll options and send
    @Test(priority = 29,retryAnalyzer = Retry.class)
    public void TC_PostCreation_29() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("CommunityPostText"));
    	PostCreation.Click_On_PollOption();
    	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    //Create poll add 3 choices and send text in all 3 choices delete the 3rd choice and add again 3rd choice add text in 3rd choice and post
    @Test(priority = 30,retryAnalyzer = Retry.class)
    public void TC_PostCreation_30() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.Click_On_PollOption();
    	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
    	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       		PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_3(data.getProperty("ChoiceThree"));
       	PostCreation.Click_On_Poll_Choice_3_CloseButton();
       	PostCreation.ClickOn_Poll_Add_anotherOption_Button();
       	PostCreation.SendTextIn_Poll_Choice_3(data.getProperty("ChoiceThree"));
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    //create poll without entering question entering both poll option click on post & validate - with entering question without entering both poll option & click on post button validate
    @Test(priority = 31,retryAnalyzer = Retry.class)
    public void TC_PostCreation_31() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.Click_On_PollOption();
    	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_ProductPostButton();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.ClearTextIn_Poll_Choice_1();
       	PostCreation.ClearTextIn_Poll_Choice_2();
       	PostCreation.ClickOn_ProductPostButton();
       	Assert.assertEquals(true,PostCreation.Poll_Choice_1_IsDisplayed());
    }
    //Save poll in draft without question and in draft edit that poll and post
    @Test(priority = 32,retryAnalyzer = Retry.class)
    public void TC_PostCreation_32() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.Click_On_PollOption();
    	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_Poll_BackButtonOnTop();
       	PostCreation.ClickOn_Product_BackButton_OnTop_Save();
       		/*PostCreation.ClickOnCreatePostPlusIcon();
       		PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       		PostCreation.Click_On_PollOption();*/
       	PostCreation.ClickOn_Poll_DraftButton();
       	PostCreation.ClickOn_Poll_DraftEdit_Button();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
       	PostCreation.ClickOn_ProductPostButton();
       	//Assert.assertEquals(true,PostCreation.Poll_Choice_1_IsDisplayed());
    }
    //Save poll in draft with all field filled, in draft edit that poll and again save it in draft again open validate changes and post
    @Test(priority = 33,retryAnalyzer = Retry.class)
    public void TC_PostCreation_33() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.Click_On_PollOption();
    	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestion"));
    	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOne"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwo"));
       	PostCreation.ClickOn_Poll_BackButtonOnTop();
       	PostCreation.ClickOn_Product_BackButton_OnTop_Save();
       		/*PostCreation.ClickOnCreatePostPlusIcon();
       		PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
       		PostCreation.Click_On_PollOption();*/
       	PostCreation.ClickOn_Poll_DraftButton();
       	PostCreation.ClickOn_Poll_DraftEdit_Button();
       	PostCreation.ClearTextIn_PollQuestion();
       	PostCreation.ClearTextIn_Poll_Choice_1();
       	PostCreation.ClearTextIn_Poll_Choice_2();
       	PostCreation.SendTextIn_PollQuestion(data.getProperty("PollQuestionUpdate"));
    	PostCreation.SendTextIn_Poll_Choice_1(data.getProperty("ChoiceOneUpdate"));
       	PostCreation.SendTextIn_Poll_Choice_2(data.getProperty("ChoiceTwoUpdate"));
       	PostCreation.ClickOn_Poll_BackButtonOnTop();
       	PostCreation.ClickOn_Product_BackButton_OnTop_Save();
    	PostCreation.ClickOn_Poll_DraftEdit_Button();
    	Assert.assertEquals(data.getProperty("PollQuestionUpdate"),PostCreation.GetTextIn_Poll_Choice_1());
    	Assert.assertEquals(data.getProperty("ChoiceOneUpdate"),PostCreation.GetTextIn_Poll_Choice_1());
    	Assert.assertEquals(data.getProperty("ChoiceTwoUpdate"),PostCreation.GetTextIn_Poll_Question());
    	PostCreation.ClickOn_ProductPostButton();
    	//Assert.assertEquals(true,PostCreation.Poll_Choice_1_IsDisplayed());
    }
    
                                     //Normal post
    //Create normal post in community / market / friends - with text only and validate
    @Test(priority = 34,retryAnalyzer = Retry.class)
    public void TC_PostCreation_34() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("CommunityPostText"));
    	PostCreation.ClickOn_ProductPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.ClickOn_PostTo_DropDown_Button();
    	PostCreation.ClickOn_PostTo_DropDown_Market_Option();
    	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("MarketPostText"));
    	PostCreation.ClickOn_ProductPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.ClickOn_PostTo_DropDown_Button();
    	PostCreation.ClickOn_PostTo_DropDown_Friends_Option();
    	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("FriendsPostText"));
    	PostCreation.ClickOn_ProductPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
  //Create normal post in community / market / friends - with image taken with camera and post
    @Test(priority = 35,retryAnalyzer = Retry.class)
    public void TC_PostCreation_35() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("CommunityPostText"));
    	PostCreation.ClickOnGalleryOPtion();
    	PostCreation.clickOn_Camera();
    	PostCreation.clickOn_CameraTakePhoto_Button();
    	PostCreation.clickOnCamera_TakenPhoto_SaveButton();
    	Thread.sleep(1000);
    	PostCreation.ClickOn_ProductPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.ClickOn_PostTo_DropDown_Button();
    	PostCreation.ClickOn_PostTo_DropDown_Market_Option();
    	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("MarketPostText"));
    	PostCreation.ClickOnGalleryOPtion();
    	PostCreation.clickOn_Camera();
    	PostCreation.clickOn_CameraTakePhoto_Button();
    	PostCreation.clickOnCamera_TakenPhoto_SaveButton();
    	Thread.sleep(1000);;
    	PostCreation.ClickOn_ProductPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.ClickOn_PostTo_DropDown_Button();
    	PostCreation.ClickOn_PostTo_DropDown_Friends_Option();
    	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("FriendsPostText"));
    	PostCreation.ClickOnGalleryOPtion();
    	PostCreation.clickOn_Camera();
    	PostCreation.clickOn_CameraTakePhoto_Button();
    	PostCreation.clickOnCamera_TakenPhoto_SaveButton();
    	Thread.sleep(1000);
    	PostCreation.ClickOn_ProductPostButton();
    	Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    
  //Create normal post in community add multiple images through camera and validate.
    @Test(priority = 36,retryAnalyzer = Retry.class)
    public void TC_PostCreation_36() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("CommunityPostText"));
    	for(int i=1;i<=5;i++)
    	{
    		PostCreation.ClickOnGalleryOPtion();
        	PostCreation.clickOn_Camera();
        	PostCreation.clickOn_CameraTakePhoto_Button();
        	PostCreation.clickOnCamera_TakenPhoto_SaveButton();
        	Thread.sleep(1000);
        	if(i==1)
        	{
        		System.out.println(PostCreation.ImageAdded_Count());
        		Assert.assertEquals("1/1",PostCreation.ImageAdded_Count());
        	}
        	if(i==2)
        	{
        		System.out.println(PostCreation.ImageAdded_Count());
        		Assert.assertEquals("2/2",PostCreation.ImageAdded_Count());
        	}
        	if(i==3)
        	{
        		System.out.println(PostCreation.ImageAdded_Count());
        		Assert.assertEquals("3/3",PostCreation.ImageAdded_Count());
        	}
        	if(i==4)
        	{
        		System.out.println(PostCreation.ImageAdded_Count());
        		Assert.assertEquals("4/4",PostCreation.ImageAdded_Count());
        	}
        	if(i==5)
        	{
        		System.out.println(PostCreation.ImageAdded_Count());
        		Assert.assertEquals("5/5",PostCreation.ImageAdded_Count());
        	}
    	}
    	PostCreation.ClickOn_ProductPostButton();
    	//Assert.assertEquals(true, PostCreation.CreatePostPlusIcon_IsDisplayed());
    }
    //Save one post in draft. Validate the post count.
    @Test(priority = 37,retryAnalyzer = Retry.class)
    public void TC_PostCreation_37() throws Exception{
    	PostCreation PostCreation=new PostCreation(driver);
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	String count=PostCreation.Get_post_Draft_Count();
    	System.out.println(count);
    	String str = count;
        int index1 = 8;
        int index2 = 9;
        char ch1 = str.charAt(index1);
        char ch2 = str.charAt(index2);
        System.out.println(ch1+ch2);
    	PostCreation.SendTextIn_Normal_post_TextArea(data.getProperty("CommunityPostText"));
    	PostCreation.ClickOnJobBackButtonOnTop();
    	PostCreation.ClickOnJobBackButton_OnTop_Popup_SaveDraftButton();
    	PostCreation.ClickOn_Draft_Page_BackButton();
    	PostCreation.ClickOnCreatePostPlusIcon();
    	PostCreation.ClickOnCreatePostPlusIconWhenOptionsAreOpen();
    	//Assert.assertNotEquals(count, PostCreation.Get_post_Draft_Count());
    	
        //System.out.println("Character at index " + index + " is : " + ch);
    }
}







