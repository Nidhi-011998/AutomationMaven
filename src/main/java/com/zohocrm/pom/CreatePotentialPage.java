package com.zohocrm.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreatePotentialPage {
	@FindBy(xpath = "//input[@name='property(Amount)']")
	private WebElement AmountTxtField;

	@FindBy(xpath = "//input[@name='property(Potential Name)']")
	private WebElement PotentialNameTxtField;

	@FindBy(xpath = "//input[@name='property(Closing Date)']")
	private WebElement ClosingDateTxtField;

	@FindBy(xpath = "//input[@name='property(Account Name)']")
	private WebElement AccountNameTxtField;

	@FindBy(xpath = "//select[@name='property(Stage)']")
	private WebElement StageDropdown;

	@FindBy(xpath = "//select[@name='property(Type)']")
	private WebElement TypeDropdown;

	@FindBy(xpath = "//input[@name='property(Probability)']")
	private WebElement ProbabilityTxtField;

	@FindBy(xpath = "//input[@name='property(Next Step)']")
	private WebElement NextStepTxtField;

	@FindBy(xpath = "//select[@name='property(Lead Source)']")
	private WebElement LeadSourceDropdown;

	@FindBy(xpath = "//select[@name='property(Campaign Source)']")
	private WebElement CampaignSourceDropdown;
	
	@FindBy(xpath = "//textarea[@name='property(Description)']")
	private WebElement DescriptionTxtField;
	
	@FindBy(xpath = "(//input[@value='Save'])[last()]")
	private WebElement savebtn;
	
	@FindBy(xpath = "(//input[@value='Save & New'])[last()]")
	private WebElement SaveAndNewbtn;
	
	@FindBy(xpath = "(//input[@value='Cancel'])[last()]")
	private WebElement Cancelbtn;
	
	public CreatePotentialPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAmountTxtField() {
		return AmountTxtField;
	}

	public WebElement getPotentialNameTxtField() {
		return PotentialNameTxtField;
	}

	public WebElement getClosingDateTxtField() {
		return ClosingDateTxtField;
	}

	public WebElement getAccountNameTxtField() {
		return AccountNameTxtField;
	}

	public WebElement getStageDropdown() {
		return StageDropdown;
	}

	public WebElement getTypeDropdown() {
		return TypeDropdown;
	}

	public WebElement getProbabilityTxtField() {
		return ProbabilityTxtField;
	}

	public WebElement getNextStepTxtField() {
		return NextStepTxtField;
	}

	public WebElement getLeadSourceDropdown() {
		return LeadSourceDropdown;
	}

	public WebElement getCampaignSourceDropdown() {
		return CampaignSourceDropdown;
	}

	public WebElement getDescriptionTxtField() {
		return DescriptionTxtField;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getSaveAndNewbtn() {
		return SaveAndNewbtn;
	}

	public WebElement getCancelbtn() {
		return Cancelbtn;
	}
	
	

}
