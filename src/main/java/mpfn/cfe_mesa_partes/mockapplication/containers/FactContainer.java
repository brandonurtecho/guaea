package mpfn.cfe_mesa_partes.mockapplication.containers;

import org.openqa.selenium.WebElement;

import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class FactContainer {
	
	public WebElement getDescriptionFactField() {
		return BrowserDriver.findById("field-descriptionFact");
	}
	
	public WebElement getCrimeRefField() {
		return BrowserDriver.findById("field-crimeRef");
	}

	public WebElement getOthersCheckBox() {
		return BrowserDriver.findById("checkbox-others");
	}

	public WebElement getCrimeNameField() {
		return BrowserDriver.findById("field-crimeName");
	}

	public WebElement getDepartmentField() {
		return BrowserDriver.findById("field-department");
	}
	
	public WebElement getProvinceField() {
		return BrowserDriver.findById("field-province");
	}
	
	public WebElement getDistrictField() {
		return BrowserDriver.findById("field-district");
	}
	
	public WebElement getPlaceField() {
		return BrowserDriver.findById("field-place");
	}
	
	public WebElement getDateField() {
		return BrowserDriver.findById("field-date");
	}

}
