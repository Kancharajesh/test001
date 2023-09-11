package ElementAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(id = "com.osos.spaarksapp:id/loginbtn")
	private WebElement LoginButton;
	
	@FindBy(id = "")
	private WebElement Profile;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout/android.widget.ImageView")
	private WebElement HomeButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.Button[2]")
	private WebElement LogoutButton;
	
/////////////////////////////////////////////////////////////////////////////////////////////	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);}
/////////////////////////////////////////////////////////////////////////////////////////////	
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}
	public void ClickOnProfile()
	{
		Profile.click();
	}
	public void ClickOnHomeButton()
	{
		HomeButton.click();
	}
	public void ClickOnLogoutButton()
	{
		LogoutButton.click();
	}
}
