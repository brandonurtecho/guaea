package mpfn.cfe_mesa_partes.mockapplication.containers;

import org.openqa.selenium.WebElement;

import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class PersonalInfoContainer {
	
	public WebElement getTitlePersonalInfo() {
		return BrowserDriver.findById("title-personal-info");
	}
	
	public WebElement getPhoneField() {
		return BrowserDriver.findById("field-phone");
	}

	public WebElement getEmailField() {
		return BrowserDriver.findById("field-email");
	}

	public WebElement getReEmailField() {
		return BrowserDriver.findById("field-reemail");
	}

	public WebElement getAgreedCheckBox() {
		return BrowserDriver.findById("agreed");
	}
	
	public WebElement getBtnPersonalInfoContinue() {
		return BrowserDriver.findById("btnPersonalInfoContinue");
	}

}
