package mpfn.cfe_mesa_partes.mockapplication.containers;

import org.openqa.selenium.WebElement;

import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class DenouncedContainer {
	
	public WebElement getKnown() {
		return BrowserDriver.findById("input-166");
	}
	
	public WebElement getUnknownCheckBox() {
		return BrowserDriver.findById("input-168");
	}

	public WebElement getTypeDocumentCombo() {
		return BrowserDriver.findById("field-type-document-denounced");
	}

	public WebElement getNumDocumentField() {
		return BrowserDriver.findById("field-num-document-denounced");
	}
	
	public WebElement getNameField() {
		return BrowserDriver.findById("field-name-document-denounced");
	}
		
	public WebElement getAddButton() {
		return BrowserDriver.findById("btnAddDenounced");
	}
	

}
