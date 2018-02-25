package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{


	public CreateLead() {

		PageFactory.initElements(driver, this);

	}


	@FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement comName; 
	public CreateLead companyName() {
		type(comName, "Google");//Load Google site
		return this; 
	}


	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement firName; 
	public CreateLead firstName () {
		type(firName, "Amina");
		return this;
	}


	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement lasName; 
	public CreateLead lastName() {	
		type(lasName, "Fathima");
		return this; 

	}
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	WebElement subButton; 
	public CreateLead clickSubmit() {
		
		click(subButton);
		return this;
	}
	
	

}
