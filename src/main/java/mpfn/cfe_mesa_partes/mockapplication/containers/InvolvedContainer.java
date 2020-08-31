package mpfn.cfe_mesa_partes.mockapplication.containers;

import org.openqa.selenium.WebElement;

import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class InvolvedContainer {
	
	public WebElement getImInvolved() {
		return BrowserDriver.findById("input-142");
	}
	
	public WebElement getOtherInvolvedCheckBox() {
		return BrowserDriver.findById("input-144");
	}

	public WebElement getTypeDocumentCombo() {
		return BrowserDriver.findById("field-type-document");
	}

	public WebElement getNumDocumentField() {
		return BrowserDriver.findById("field-num-document");
	}
	
	public WebElement getNameField() {
		return BrowserDriver.findById("field-name-document");
	}
	
	public WebElement getAddButton() {
		return BrowserDriver.findById("btnAddInvolved");
	}
	

}
