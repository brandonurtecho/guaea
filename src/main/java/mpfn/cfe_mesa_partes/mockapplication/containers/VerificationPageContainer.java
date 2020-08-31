package mpfn.cfe_mesa_partes.mockapplication.containers;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;

import mpfn.cfe_mesa_partes.utils.BrowserDriver;

import static mpfn.cfe_mesa_partes.constants.RandomVerification.CODE_UBIGEO_LABEL;
import static mpfn.cfe_mesa_partes.constants.RandomVerification.DIGITO_DNI_LABEL;
import static mpfn.cfe_mesa_partes.constants.RandomVerification.EMISSION_DATE_DNI_LABEL;
import static mpfn.cfe_mesa_partes.constants.RandomVerification.NAME_FATHER_LABEL;
import static mpfn.cfe_mesa_partes.constants.RandomVerification.NAME_MOTHER_LABEL;

public class VerificationPageContainer {

	

	public WebElement getTitleCitizenVerification() {
		return BrowserDriver.findById("title-citizen-verification");
	}

	public WebElement getDniField() {
		return BrowserDriver.findById("field-dni");
	}

	public WebElement getDateBirthField() {
		return BrowserDriver.findById("field-date-birth");
	}
	

	public WebElement getRandomVerificationLabel() {
		return BrowserDriver.findById("random-verification");
	}
	
	public WebElement getDigitoDniField() {
		return BrowserDriver.findById("field-digito-dni");
	}
	
	public WebElement getNameMotherField() {
		return BrowserDriver.findById("field-name-mother");
	}
	
	public WebElement getNameFatherField() {
		return BrowserDriver.findById("field-name-father");
	}
	
	public WebElement getCodeUbigeoField() {
		return BrowserDriver.findById("field-code-ubigeo");
	}
	
	public WebElement getEmissionDateDniField() {
		return BrowserDriver.findById("field-date-emission-dni");
	}
	
	public WebElement getVerificationField() {
		String verificationLabel = getRandomVerificationLabel().getText();
		Map<String, WebElement> verificationMap = new HashMap<String, WebElement>();
		verificationMap.put(DIGITO_DNI_LABEL, getDigitoDniField());
		verificationMap.put(NAME_MOTHER_LABEL, getNameMotherField());
		verificationMap.put(NAME_FATHER_LABEL, getNameFatherField());
		verificationMap.put(CODE_UBIGEO_LABEL, getCodeUbigeoField());
		verificationMap.put(EMISSION_DATE_DNI_LABEL, getEmissionDateDniField());
		return verificationMap.get(verificationLabel);
	}
	
	public WebElement getBtnVerificationCitizenContinue() {
		return BrowserDriver.findById("btnVerificationCitizenContinue");
	}
}
