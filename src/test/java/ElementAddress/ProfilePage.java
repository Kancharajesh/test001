package ElementAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	WebDriver driver;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Profile\"]/android.widget.FrameLayout/android.widget.ImageView")
	private WebElement EditProfile;
	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean EditProfileButtonIsDisplayed()
	{
		 return EditProfile.isDisplayed();
	}
}
