package ElementAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;

	@FindBy(className =  "android.widget.EditText")
	private WebElement EnterPhoneNumberTextField;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement InvalidEnterPhoneNumberErrorMessage;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	private WebElement GetOtpButton; 
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout")
	private WebElement GooggleButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")
	private WebElement SecoundMailID;
	
	//Otp Start
	
	@FindBy(id = "com.osos.spaarksapp:id/box1")
	private WebElement Otp1;
	
	//AndroidElement emailET= (AndroidElement)driver.findElementById("com.XXX.XXX:id/email");
	
	@FindBy(id = "com.osos.spaarksapp:id/box2")
	private WebElement Otp2;
	
	@FindBy(id = "com.osos.spaarksapp:id/box3")
	private WebElement Otp3;
	
	@FindBy(id = "com.osos.spaarksapp:id/box4")
	private WebElement Otp4;
	
	@FindBy(id = "com.osos.spaarksapp:id/box5")
	private WebElement Otp5;
	
	@FindBy(id = "com.osos.spaarksapp:id/box6")
	private WebElement Otp6;
	
	//Otp End
	
	@FindBy(id = "com.osos.spaarksapp:id/button2")
	private WebElement VerifyOtpButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")
	private WebElement WrongOtpAlertMessage;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement FullName;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
	private WebElement FullNameErrorMessage;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement BusinessAccountFullName;
	
	@FindBy(id ="com.osos.spaarksapp:id/username_edit")
	private WebElement Username;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]")
	private WebElement UsernameSuggetions;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]")
	private WebElement UsernameErrorMessage;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.TextView[2]")
	private WebElement TermsOfServicesLink;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
	private WebElement TermsOfServicesLinkJustOnceBrowserButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView")
	private WebElement TermsAndPoliciesPage; //After Clicking on link policy page.
	
	@FindBy(id ="com.osos.spaarksapp:id/username_ediBu")
	private WebElement BusinessAccountUsername;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]")
	private WebElement DateOfBirthTextField;
	
	@FindBy(id = "android:id/button1")
	private WebElement DateOfBirthOkButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView")
	private WebElement EmailDateOfBirthTextField;
	
	@FindBy(id = "com.osos.spaarksapp:id/box")
	private WebElement CheckBox;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.CheckBox")
	private WebElement CheckBox_Selected;
	
	@FindBy(id = "com.osos.spaarksapp:id/box2")
	private WebElement BusinessAccountCheckBox;
	
	@FindBy()
	private WebElement ReferralCodeTextField;
	
	@FindBy(id = "com.osos.spaarksapp:id/gotoBussiness")
	private WebElement CreateABusinessAccountInsteadLink;
	
	@FindBy(id = "com.osos.spaarksapp:id/gotoBussiness")
	private WebElement CreateAcommunityAccountInsteadLink;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
	private WebElement ProfilePicture;
	
	@FindBy(id = "android:id/button1")
	private WebElement ProfilePicturePermissionCancelButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement ProfilePictureFirstImage;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement ProfilePictureSecondImage;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
	private WebElement ImageUpload_NextButton;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView")
	private WebElement ImageUploadCameraIcon;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	private WebElement ImageUploadCamera_TakePictureButton;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout")
	private WebElement ImageUploadCamera_TakenPicture_SaveButton;
	
	@FindBy(id = "com.osos.spaarksapp:id/adLocation")
	private WebElement Location;
	
	@FindBy(id = "com.osos.spaarksapp:id/bioEdit")
	private WebElement Bio;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement EmailAddress;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement EmailAccountPhoneNumber;
	
	@FindBy(className = "android.widget.Button")
	private WebElement FinishLaterLink;
	
	@FindBy()
	private WebElement PreviousButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.TextView[2]")
	private WebElement VerifyButton;
	
	@FindBy(id = "com.osos.spaarksapp:id/idNextClick")
	private WebElement NextButton;
	
	@FindBy(id = "com.osos.spaarksapp:id/next")
	private WebElement BusinessPopupNextButton;
	
	@FindBy(id = "com.osos.spaarksapp:id/idBusinessCategoriesList")
	private WebElement BusinessTitle;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView")
	private WebElement BackButtonOnTop1stScreen;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.ImageView")
	private WebElement BackButtonOnTop2ndScreen;
	
	@FindBy(id = "com.osos.spaarksapp:id/appCompatTextView2")
	private WebElement ExitLoginPopupYesButton;
	
	@FindBy(id = "com.osos.spaarksapp:id/appCompatTextView")
	private WebElement ExitLoginPopupCancelButton;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SendInputInPhoneNumberTextField(String data)
	{
		EnterPhoneNumberTextField.sendKeys(data); 
	}
	
	public String GetInvalidEnterPhoneNumberErrorMessage()
	{
		return InvalidEnterPhoneNumberErrorMessage.getText();
	}
	
	public void ClickOnGetOtpButton()
	{
		GetOtpButton.click();
	}
	
	public void ClickOnGooggleButton()
	{
		GooggleButton.click();
	}
	
	public void ClickOnSecondMailID()
	{
		SecoundMailID.click();
	}
	
	//Otp Starts
	
	public void SendOtp1()
	{
		Otp1.sendKeys("1");
	}
	public void SendOtp1Wrong()
	{
		Otp1.sendKeys("0");
	}
	public void SendOtp2()
	{
		Otp2.sendKeys("2");
	}
	public void SendOtp3()
	{
		Otp3.sendKeys("3");
	}
	public void SendOtp4()
	{
		Otp4.sendKeys("4");
	}
	public void SendOtp5()
	{
		Otp5.sendKeys("5");
	}
	public void SendOtp6()
	{
		Otp6.sendKeys("6");
	}
	//Otp Ends
	
	public void ClickOnVerifyOtpButton()
	{
		VerifyOtpButton.click();
	}
	
	public void SendTextInFullNameTextField(String data)
	{
		FullName.sendKeys(data);
	}
	
	public void ClearTextInFullNameTextField()
	{
		FullName.clear();
	}
	
	public void SendTextInBusinessAccountFullNameTextField(String data)
	{
		BusinessAccountFullName.sendKeys(data);
	}
	
	public boolean FullNameIsDisplayed()
	{
		return FullName.isDisplayed();
	}
	
	public String GetFullNameErrorMessage()
	{
		return FullNameErrorMessage.getText();
	}
	
	public void SendTextInUsernameTextField(String data)
	{
		Username.sendKeys(data);
	}
	
	public void ClearTextInUsernameTextField()
	{
		Username.clear();
	}
	
	public void ClickOnTermsOfServicesLink()
	{
		TermsOfServicesLink.click();
	}
	
	public void ClickOnTermsOfServicesLinkJustOnceBrowserButton()
	{
		TermsOfServicesLinkJustOnceBrowserButton.click();
	}
	
	public boolean UsernameSuggetionsIsDisplayed()
	{
		return UsernameSuggetions.isDisplayed();
	}
	
	public boolean TermsAndPoliciesPageIsDisplayed()
	{
		return TermsAndPoliciesPage.isDisplayed();
	}
	
	public String Get_Username_ErrorMessage()
	{
		return UsernameErrorMessage.getText();
	}
	
	public boolean Username_ErrorMessage_isDisplayed()
	{
		return UsernameErrorMessage.isDisplayed();
	}
	
	public void SendTextInBusinessAccountUsernameTextField(String data)
	{
		BusinessAccountUsername.sendKeys(data);
	}
	
	public void ClickOnDateOfBirthTextField()
	{
		DateOfBirthTextField.click();
	}
	
	public void ClickOnDateOfBirthOkButton()
	{
		DateOfBirthOkButton.click();
	}
	
	public void ClickOnEmailDateOfBirthTextField()
	{
		EmailDateOfBirthTextField.click();
	}
	
	public void TickMarkCheckBox()
	{
		CheckBox.click();
	}
	
	public void UnTickMarked_CheckBox()
	{
		CheckBox_Selected.click();
	}
	
	public void TickMarkBusinessAccountCheckBox()
	{
		BusinessAccountCheckBox.click();
	}
	
	public void SendTextInReferralCodeTextField(String data)
	{
		ReferralCodeTextField.sendKeys(data);
	}
	
	public void ClickOnCreateABusinessAccountInsteadLink()
	{
		CreateABusinessAccountInsteadLink.click();
	}
	
	public void ClickOnCreateAcommunityAccountInsteadLink()
	{
		CreateAcommunityAccountInsteadLink.click();
	}
	
	public void ClickOnNextButton()
	{
		NextButton.click();
	}
	
	public void ClickOnBusinessPopupNextButton()
	{
		BusinessPopupNextButton.click();
	}
	
	public String GetWrongOtpAlertMessageText()
	{
		return WrongOtpAlertMessage.getText();
	}
	
	//Second Screen of create profile
	
	public void SendTextInLocation(String data)
	{
		Location.sendKeys(data);
	}
	
	public void SendTextInEmailAddress(String data)
	{
		EmailAddress.sendKeys(data);
	}
	
	public void SendPhoneNumberInEmailAccountPhoneNumber(String data)
	{
		EmailAccountPhoneNumber.sendKeys(data);
	}
	
	public void SendTextInBio(String data)
	{
		Bio.sendKeys(data);
	}
	
	public boolean LocationTextfieldIsDisplayed()
	{
		return Location.isDisplayed();
	}
	
	public void ClickOnFinishLaterLink()
	{
		FinishLaterLink.click();
	}
	
	public void SendTextInBusinessTitle(String data)
	{
		BusinessTitle.sendKeys(data);
	}
	
	public boolean BusinessTitleTextfieldIsDisplayed()
	{
		return BusinessTitle.isDisplayed();
	}
	
	public void ClearTheBusinessTitle()
	{
		BusinessTitle.clear();
	}
	
	public void ClickOnBackButtonOnTop1stScreen()
	{
		BackButtonOnTop1stScreen.click();
	}
	
	public void ClickOnBackButtonOnTop2ndScreen()
	{
		BackButtonOnTop2ndScreen.click();
	}
	
	public void ClickOnExitLoginPopupYesButton()
	{
		ExitLoginPopupYesButton.click();
	}
	public void ClickOnExitLoginPopupCancelButton()
	{
		ExitLoginPopupCancelButton.click();
	}
	
	public void ClickOnProfilePicture()
	{
		ProfilePicture.click();
	} 
	
	public void ClickOnProfilePicturePermissionCancelButton()
	{
		ProfilePicturePermissionCancelButton.click();
	} 
	
	public void ClickOnProfilePictureFirstImage()
	{
		ProfilePictureSecondImage.click();
	}
	
	public void ClickOnProfilePictureSecondImage()
	{
		ProfilePictureSecondImage.click();
	}
	
	public void ClickOnImageUpload_NextButton()
	{
		ImageUpload_NextButton.click();
	}
	public void ClickOnImageUploadCameraIcon()
	{
		ImageUploadCameraIcon.click();
	}
	public void ClickOnImageUploadCamera_TakePictureButton()
	{
		ImageUploadCamera_TakePictureButton.click();
	}
	public void ClickOnImageUploadCamera_TakenPicture_SaveButton()
	{
		ImageUploadCamera_TakenPicture_SaveButton.click();
	}
	
	public void ClickOnVerifyButton()
	{
		VerifyButton.click();
	}
	
	public boolean Otp1IsDisplayed()
	{
		return Otp1.isDisplayed();
	}
}
