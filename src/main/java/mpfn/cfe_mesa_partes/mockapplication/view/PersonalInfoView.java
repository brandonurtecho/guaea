package mpfn.cfe_mesa_partes.mockapplication.view;

import java.util.logging.Logger;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import mpfn.cfe_mesa_partes.mockapplication.containers.FactContainer;
import mpfn.cfe_mesa_partes.mockapplication.containers.PersonalInfoContainer;
import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class PersonalInfoView {
	private static final Logger LOGGER = Logger.getLogger(PersonalInfoView.class.getName());
	private static final PersonalInfoContainer personalInfoContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PersonalInfoContainer.class);
	private static final FactContainer factContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), FactContainer.class);
	
	public static void isDisplayedCheck(){
		LOGGER.info("Checking home page is displayed");
		BrowserDriver.waitForElement(personalInfoContainer.getTitlePersonalInfo());
		personalInfoContainer.getTitlePersonalInfo().isDisplayed();
	}
	
	public static void fillForms(String celular, String email, String reemail){
		LOGGER.info("Filling forms");
		/*personalInfoContainer.getPhoneField().sendKeys(celular);
		personalInfoContainer.getEmailField().sendKeys(email);
		personalInfoContainer.getReEmailField().sendKeys(reemail);*/
		LOGGER.info("Filling forms successfully");
	}
	
	public static void agreed(){
		LOGGER.info("Agreedding with personal information");

		Actions actions = new Actions(BrowserDriver.getCurrentDriver());
    	actions.moveToElement(personalInfoContainer.getAgreedCheckBox()).click().build().perform();
		
		LOGGER.info("Agreedding successfully");
	}
	
	public static void submit(){
		LOGGER.info("Clicking at the submit button");
		BrowserDriver.waitForElement(personalInfoContainer.getBtnPersonalInfoContinue());
		personalInfoContainer.getBtnPersonalInfoContinue().click();
		LOGGER.info("Submit successfully");
	}
		
	public static void isSuccessful(){
		LOGGER.info("Checking home page is redirect successfully");
		BrowserDriver.waitForElement(factContainer.getDescriptionFactField());
	}
}
