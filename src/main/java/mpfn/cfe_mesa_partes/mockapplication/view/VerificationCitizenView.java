package mpfn.cfe_mesa_partes.mockapplication.view;

import static mpfn.cfe_mesa_partes.constants.RandomVerification.CODE_UBIGEO_LABEL;
import static mpfn.cfe_mesa_partes.constants.RandomVerification.DIGITO_DNI_LABEL;
import static mpfn.cfe_mesa_partes.constants.RandomVerification.EMISSION_DATE_DNI_LABEL;
import static mpfn.cfe_mesa_partes.constants.RandomVerification.NAME_FATHER_LABEL;
import static mpfn.cfe_mesa_partes.constants.RandomVerification.NAME_MOTHER_LABEL;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import mpfn.cfe_mesa_partes.mockapplication.containers.PersonalInfoContainer;
import mpfn.cfe_mesa_partes.mockapplication.containers.VerificationPageContainer;
import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class VerificationCitizenView {
	private static final Logger LOGGER = Logger.getLogger(VerificationCitizenView.class.getName());
	private static final VerificationPageContainer verificationPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), VerificationPageContainer.class);
	private static final PersonalInfoContainer personalInfoContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PersonalInfoContainer.class);
	
	public static void isDisplayedCheck(){
		LOGGER.info("Checking home page is displayed");
		BrowserDriver.waitForElement(verificationPageContainer.getTitleCitizenVerification());
		verificationPageContainer.getTitleCitizenVerification().isDisplayed();
	}
	
	public static void fillForms(String dni, String fechaNacimiento, String ultimoDigitoDni, 
			String nombreMadre, String nombrePadre, String fechaEmisionDni, String numeroUbigeo){
		LOGGER.info("Filling forms");
		verificationPageContainer.getDniField().sendKeys(dni);
		verificationPageContainer.getDateBirthField().sendKeys(fechaNacimiento);
		String verification = verificationPageContainer.getRandomVerificationLabel().getText();
		switch(verification){
		case CODE_UBIGEO_LABEL:
			verificationPageContainer.getCodeUbigeoField().sendKeys(numeroUbigeo);
			break;
		case DIGITO_DNI_LABEL:
			verificationPageContainer.getDigitoDniField().sendKeys(ultimoDigitoDni);
			break;
		case EMISSION_DATE_DNI_LABEL:
			verificationPageContainer.getEmissionDateDniField().sendKeys(fechaEmisionDni);
			break;
		case NAME_FATHER_LABEL:
			verificationPageContainer.getNameFatherField().sendKeys(nombrePadre);
			break;
		case NAME_MOTHER_LABEL:
			verificationPageContainer.getNameMotherField().sendKeys(nombreMadre);
			break;
		}
		LOGGER.info("Filling forms successfully");
	}
	
	public static void submit(){
		LOGGER.info("Clicking at the submit button");
		BrowserDriver.waitForElement(verificationPageContainer.getBtnVerificationCitizenContinue());
		verificationPageContainer.getBtnVerificationCitizenContinue().click();
		LOGGER.info("Submit successfully");
	}
		
	public static void isSuccessful(){
		LOGGER.info("Checking home page is redirect successfully");
		BrowserDriver.waitForElement(personalInfoContainer.getTitlePersonalInfo());
	}
}
