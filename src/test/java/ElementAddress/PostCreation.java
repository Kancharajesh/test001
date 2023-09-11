package ElementAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostCreation {
	
WebDriver driver;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]\r\n"
			+ "")
	private WebElement CreatePostPlusIcon;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.LinearLayout\r\n"
			+ "")
	private WebElement CreateProfilePlusIconProducts;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
	private WebElement CreateProfilePlusIconKeepMeHidden;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.LinearLayout")
	private WebElement CreatePostPlusIconWhenOptionsAreOpen;
	
	
//ContactOption
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]")
	private WebElement ContactOption; //xpath when options are enable
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.Switch")
		private WebElement ContactOption_SpaarksCall_Option;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.Switch")
		private WebElement ContactOption_NormalCall_Option;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[2]/android.widget.Switch")
		private WebElement ContactOption_Chat_Option;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]")
	private WebElement PublicOPtion;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
	private WebElement GalleryOPtion;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout")
	private WebElement PollOption;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private WebElement ProductOption;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView")
	private WebElement DropDown_Post_to;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
		private WebElement DropDown_Post_to_CommunityOption;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")
		private WebElement DropDown_Post_to_MarketOption;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView")
		private WebElement DropDown_Post_to_FriendsOption;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement Select1stImage;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement Select2stImage;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement Select3stImage;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement Select4stImage;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement Select5stImage;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView")
	private WebElement SelectCamera;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	private WebElement Camera_TakePhoto_Button;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
	private WebElement Camera_TakenPhoto_SaveButton;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView")
	private WebElement Added_image_count;
	
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
	private WebElement SaveButtonAfterSelectingTheImages;
	
//Draft
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.ImageView")
	private WebElement Draft_Page_DropDownButton;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]")
	private WebElement Draft_Page_DropDown_PostsOption;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout")
	private WebElement Draft_Page_DropDown_ProductOption;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout")
	private WebElement Draft_Page_DropDown_JobOption;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement Draft_Page_BackButton_OnTop;
	
//jobs
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.view.ViewGroup/android.widget.ImageView")
		private WebElement CreateProfilePlusIconJobOption;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]")
		private WebElement JobOption;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText")
		private WebElement JobTitle;
		@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
		private WebElement FirstPosition_JobTitleText_FromDraft;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")
		private WebElement JobSummary;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText")
		private WebElement JobDescription;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
		private WebElement JobSkills;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView[2]")
		private WebElement JobSkillsCancelButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.ImageView")
		private WebElement JobAddImage;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]")
		private WebElement JobAddImage_DeleteButton;
		@FindBy(id = "com.osos.spaarksapp:id/post")
		private WebElement JobPostButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView")
		private WebElement JobDraftButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView")
		private WebElement JobDraftBack_ButtonOnTop;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[2]")
		private WebElement DraftJob_DeleteButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]")
		private WebElement IsideJobDraft_DeletePopup_yesButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")
		private WebElement DraftJob_EditButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView")
		private WebElement JobBackButtonOnTop;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
		private WebElement JobBackButton_OnTop_Popup_DeleteButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]")
		private WebElement JobBackButton_OnTop_Popup_SaveDraftButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
		private WebElement JobTitleReuiredText;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]")
		private WebElement JobSummaryReuiredText;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView[2]")
		private WebElement JobDescriptionReuiredText;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView[2]")
		private WebElement JobSkillsReuiredText;
	
//Product
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText")
	private WebElement ProductTitle;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout")
	private WebElement ProductTitle_and_Required_FullText;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")
	private WebElement ProductPrice;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private WebElement ProductPrice_and_Required_FullText;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText")
	private WebElement ProductDescription;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private WebElement ProductDescription_and_Required_FullText;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.ImageView")
	private WebElement ProductAddImage;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]")
	private WebElement ProductAddImage_and_Required_FullText;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView")
	private WebElement ProductPostButton;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView")
	private WebElement Product_BackButton_OnTop;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView")
	private WebElement ProductDraft_BackButton_OnTop;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement Product_BackButton_OnTop_Save;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView")
	private WebElement Product_Draft_Button;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[1]")
	private WebElement Product_Draft_EiditButton;
	
	
//Poll
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]")
		private WebElement PollQuestion;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView")
		private WebElement Poll_BackButtOnTop;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView")
		private WebElement Poll_DraftButton;
		@FindBy(xpath = "")
		private WebElement Poll_DraftEdit_Button;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
		private WebElement Poll_Add_anotherOption_Button;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[2]")
		private WebElement Poll_Choice_1;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[3]")
		private WebElement Poll_Choice_2;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")
		private WebElement Poll_Choice_3;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText")
		private WebElement Poll_Choice_4;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		private WebElement Poll_Choice_3_CloseButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView")
		private WebElement Poll_Choice_4_CloseButton;
		
//Normal-community post
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
		private WebElement Normal_post_TextArea;
		@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView")
		private WebElement Normal_post_DraftOption;
			@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView")
			private WebElement Post_To_DropDown_Button;
			@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
			private WebElement Post_To_DropDown_Community_Option;
			@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")
			private WebElement Post_To_DropDown_Market_Option;
			@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView")
			private WebElement Post_To_DropDown_Friends_Option;
	
	public PostCreation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnCreatePostPlusIcon()
	{CreatePostPlusIcon.click();}
	public boolean CreatePostPlusIcon_IsDisplayed()
	{return CreatePostPlusIcon.isDisplayed();}
	
	public void ClickOnCreateProfilePlusIconJobOption()
	{
		CreateProfilePlusIconJobOption.click();
	}
	
	public void ClickOnCreateProfilePlusIconProductsOption()
	{
		CreateProfilePlusIconProducts.click();
	}
	
	public void ClickOnCreateProfilePlusIconKeepMeHiddenOption()
	{
		CreateProfilePlusIconKeepMeHidden.click();
	}
	
	public void ClickOnCreatePostPlusIconWhenOptionsAreOpen()
	{
		CreatePostPlusIconWhenOptionsAreOpen.click();
	}
	
	
//Normal-community post
	public void SendTextIn_Normal_post_TextArea(String data)
	{
		Normal_post_TextArea.sendKeys(data);
	}
	public String Get_post_Draft_Count()
	{
		return Normal_post_DraftOption.getText();
	}
	public void GetTextIn_Normal_post_TextArea()
	{
		Normal_post_DraftOption.getText();
	}
	public void ClickOn_PostTo_DropDown_Button()
	{Post_To_DropDown_Button.click();}
	public void ClickOn_PostTo_DropDown_Community_Option()
	{Post_To_DropDown_Community_Option.click();}
	public void ClickOn_PostTo_DropDown_Market_Option()
	{Post_To_DropDown_Market_Option.click();}
	public void ClickOn_PostTo_DropDown_Friends_Option()
	{Post_To_DropDown_Friends_Option.click();}
	
//ContactOption
	public void ClickOnContactOption()
	{ContactOption.click();}
		public void ClickOn_ContactOption_SpaarksCall_Option()
		{ContactOption_SpaarksCall_Option.click();}
			public boolean IsEnable_ContactOption_SpaarksCall_Option()
			{return ContactOption_SpaarksCall_Option.isEnabled();}
			
		public void ClickOn_ContactOption_NormalCall_Option()
		{ContactOption_NormalCall_Option.click();}
			public boolean IsEnable_ContactOption_NormalCall_Option()
			{return ContactOption_NormalCall_Option.isEnabled();}
			
		public void ClickOn_ContactOption_Chat_Option()
		{ContactOption_Chat_Option.click();}
			public boolean IsEnable_ContactOption_Chat_Option()
			{return ContactOption_Chat_Option.isEnabled();}
	
	public void ClickOnPublicOPtion()
	{
		PublicOPtion.click();
	}
	public void ClickOnGalleryOPtion()
	{
		GalleryOPtion.click();
	}
	
	public void ClickOn_DropDown_Postto()
	{
		DropDown_Post_to.click();
	}
	
	public void ClickOn_DropDown_Postto_CommunityOption()
	{
		DropDown_Post_to_CommunityOption.click();
	}
	
	public void ClickOn_DropDown_Postto_MarketOption()
	{
		DropDown_Post_to_MarketOption.click();
	}
	
	public void ClickOn_DropDown_Postto_FriendsOption()
	{
		DropDown_Post_to_FriendsOption.click();
	}
	
	//Job
		public void ClickOnJobOption()
		{JobOption.click();}
		public void SendTextInJobTitle(String data)
		{JobTitle.sendKeys(data);}
		public boolean JobTitle_textfield_IsDisplayed()
		{return JobTitle.isDisplayed();}
		public void ClearTextInJobTitle()
		{JobTitle.clear();}
		public String GetJobTitle_Text()
		{return JobTitle.getText();}
		public String GetFirstPosition_JobTitleText_FromDraft()
		{return FirstPosition_JobTitleText_FromDraft.getText();}
		public void SendTextInJobSummary(String data)
		{JobSummary.sendKeys(data);}
		public void ClearTextInJobSummary()
		{JobSummary.clear();}
		public String GetText_from_JobSummary()
		{return JobSummary.getText();}
		public void SendTextInJobDescription(String data)
		{JobDescription.sendKeys(data);}
		public void ClearTextInJobDescription()
		{JobDescription.clear();}
		public void ClickOnJobDescription()
		{JobDescription.click();}
		public void SendTextInJobSkills(String data)
		{JobSkills.sendKeys(data);}
		public void ClickOnJobSkills()
		{JobSkills.click();}
		public void ClickOnJobSkillsCancelButton()
		{JobSkillsCancelButton.click();}
		public void ClickOnJobAddImage()
		{JobAddImage.click();}
		public void ClickOnJobAddImage_DeleteButton()
		{JobAddImage_DeleteButton.click();}
		public void ClickOnJobPostButton()
		{JobPostButton.click();}
		public void ClickOnJobDraftButton()
		{JobDraftButton.click();}
		public void ClickOnJobDraftBack_ButtonOnTop()
		{JobDraftBack_ButtonOnTop.click();}
		public void ClickOnJobDraft_DeleteButton()
		{DraftJob_DeleteButton.click();}
		public void ClickOnJobDraft_EditButton()
		{DraftJob_EditButton.click();}
		public void ClickOnJobBackButtonOnTop()
		{JobBackButtonOnTop.click();}
		public void ClickOnJobBackButton_OnTop_Popup_DeleteButton()
		{JobBackButton_OnTop_Popup_DeleteButton.click();}
		public boolean JobBackButton_OnTop_Popup_DeleteButton_IsDisplayed()
		{return JobBackButton_OnTop_Popup_DeleteButton.isDisplayed();}
		public void ClickOnJobBackButton_OnTop_Popup_SaveDraftButton()
		{ JobBackButton_OnTop_Popup_SaveDraftButton.click();}
		public void ClickOn_IsideJobDraft_DeletePopup_yesButton()
		{ IsideJobDraft_DeletePopup_yesButton.click();}
		public boolean JobTitleReuiredTextIsDisplayed()
		{return JobTitleReuiredText.isDisplayed();}
		public boolean JobSummaryReuiredTextIsDisplayed()
		{return JobSummaryReuiredText.isDisplayed();}
		public boolean JobDescriptionReuiredTextIsDisplayed()
		{return JobDescriptionReuiredText.isDisplayed();}
		public boolean JobSkillsReuiredTextIsDisplayed()
		{return JobSkillsReuiredText.isDisplayed();}
		
//Product
	public void ClickOnProductOption(){
		ProductOption.click();}
	public void SendTextIn_ProductTitle(String data){
		ProductTitle.sendKeys(data);}
	public void Clear_TextIn_ProductTitle(){
		ProductTitle.clear();}
	public String GetText_from_ProductTitle(){
		return ProductTitle.getText();}
	public String Get_ProductTitle_and_Required_FullText(){
		return ProductTitle_and_Required_FullText.getText();}
	public void SendTextIn_ProductPrice(String data){
		ProductPrice.sendKeys(data);}
	public void Clear_TextIn_ProductPrice(){
		ProductPrice.clear();}
	public String GetText_from_ProductPrice(){
		return ProductPrice.getText();}
	public String Get_ProductPrice_and_Required_FullText(){
		return ProductPrice_and_Required_FullText.getText();}
	public void SendTextIn_ProductDescription(String data){
		ProductDescription.sendKeys(data);}
	public void Clear_TextIn_ProductDescription(){
		ProductDescription.clear();}
	public String GetText_from_ProductDescription(){
		return ProductDescription.getText();}
	public String Get_ProductDescription_and_Required_FullText(){
		return ProductDescription_and_Required_FullText.getText();}
	public void ClickOn_ProductAddImage(){
		ProductAddImage.click();}
	public String Get_ProductAddImage_and_Required_FullText(){
		return ProductAddImage_and_Required_FullText.getText();}
	public void ClickOn_ProductPostButton(){
		ProductPostButton.click();}
	public void ClickOn_Product_BackButton(){
		Product_BackButton_OnTop.click();}
	public void ClickOn_Product_BackButton_OnTop_Save(){
		Product_BackButton_OnTop_Save.click();}
	public void ClickOn_Product_Draft_Button(){
		Product_Draft_Button.click();}
	public void ClickOn_Product_Draft_EiditButton(){
		Product_Draft_EiditButton.click();}
	public void ClickOn_ProductDraft_BackButton(){
		ProductDraft_BackButton_OnTop.click();}
		
//Poll
		public void Click_On_PollOption()
		{ PollOption.click();}
		public void SendTextIn_PollQuestion(String data)
		{ PollQuestion.sendKeys(data);}
		public String GetTextIn_Poll_Question()
		{return PollQuestion.getText();}
		public void ClearTextIn_PollQuestion()
		{ PollQuestion.clear();}
		public void SendTextIn_Poll_Choice_1(String data)
		{ Poll_Choice_1.sendKeys(data);}
		public void ClearTextIn_Poll_Choice_1()
		{ Poll_Choice_1.clear();}
		public String GetTextIn_Poll_Choice_1()
		{ return Poll_Choice_1.getText();}
		public boolean Poll_Choice_1_IsDisplayed()
		{ return Poll_Choice_1.isDisplayed();}
		public void SendTextIn_Poll_Choice_2(String data)
		{ Poll_Choice_2.sendKeys(data);}
		public void ClearTextIn_Poll_Choice_2()
		{ Poll_Choice_2.clear();}
		public String GetTextIn_Poll_Choice_2()
		{ return Poll_Choice_2.getText();}
		public void SendTextIn_Poll_Choice_3(String data)
		{ Poll_Choice_3.sendKeys(data);}
		public void SendTextIn_Poll_Choice_4(String data)
		{ Poll_Choice_4.sendKeys(data);}
		public void ClickOn_Poll_Add_anotherOption_Button(){
			Poll_Add_anotherOption_Button.click();}
		public void ClickOn_Poll_BackButtonOnTop(){
			Poll_BackButtOnTop.click();}
		public void ClickOn_Poll_DraftButton(){
			Poll_DraftButton.click();}
		public void ClickOn_Poll_DraftEdit_Button(){
			Poll_DraftEdit_Button.click();}
		public void Click_On_Poll_Choice_3_CloseButton()
		{ Poll_Choice_3_CloseButton.click();}
		public void Click_On_Poll_Choice_4_CloseButton()
		{ Poll_Choice_4_CloseButton.click();}
		
	
//Draft
		public void ClickOnDraft_Page_DropDownButton(){
			Draft_Page_DropDownButton.click();}
		public void SelectDraft_Page_DropDown_PostsOption(){
			Draft_Page_DropDown_PostsOption.click();}
		public void SelectDraft_Page_DropDown_ProductOption(){
			Draft_Page_DropDown_ProductOption.click();}
		public void SelectDraft_Page_DropDown_JobOption(){
			Draft_Page_DropDown_JobOption.click();}
		public void ClickOn_Draft_Page_BackButton(){
			Draft_Page_BackButton_OnTop.click();}
		
	//ImagesSelection
	public void Select1stImage()
	{Select1stImage.click();}
	public void Select2stImage()
	{Select2stImage.click();}
	public void Select3stImage()
	{Select3stImage.click();}
	public void Select4stImage()
	{Select4stImage.click();}
	public void Select5stImage()
	{Select5stImage.click();}
	public void clickOn_Camera()
	{SelectCamera.click();}
	public void clickOn_CameraTakePhoto_Button()
	{Camera_TakePhoto_Button.click();}
	public void clickOnCamera_TakenPhoto_SaveButton()
	{Camera_TakenPhoto_SaveButton.click();}
	public void ClickOnSaveButtonAfterSelectingTheImages()
	{SaveButtonAfterSelectingTheImages.click();}
	public String ImageAdded_Count()
	{return Added_image_count.getText();}
}
