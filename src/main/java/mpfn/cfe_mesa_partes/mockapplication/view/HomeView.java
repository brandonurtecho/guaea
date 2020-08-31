package mpfn.cfe_mesa_partes.mockapplication.view;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import mpfn.cfe_mesa_partes.mockapplication.containers.HomePageContainer;
import mpfn.cfe_mesa_partes.mockapplication.containers.VerificationPageContainer;
import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class HomeView {
	private static final Logger LOGGER = Logger.getLogger(HomeView.class.getName());
	private static final HomePageContainer homePageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);
	private static final VerificationPageContainer verificationPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), VerificationPageContainer.class);
	
	public static void isDisplayedCheck(){
		LOGGER.info("Checking home page is displayed");
		BrowserDriver.waitForElement(homePageContainer.getTitleWelcomeHome());
		homePageContainer.getTitleWelcomeHome().isDisplayed();
	}
	
	public static void makeComplaintPenal(){
		LOGGER.info("Clicking at the complaint penal button");
		homePageContainer.getComplaintPenalButton().click();
		LOGGER.info("Clicking successfully");
	}
	
	public static void makeDocumentsPenal(){
		LOGGER.info("Clicking at the documents penal button");
		homePageContainer.getDocumentsPenalButton().click();
		LOGGER.info("Clicking successfully");
	}
	
	public static void makeComplaintWoman(){
		LOGGER.info("Clicking at the complaint woman button");
		homePageContainer.getComplaintWomanButton().click();
		LOGGER.info("Clicking successfully");
	}
	
	public static void makeDocumentsWoman(){
		LOGGER.info("Clicking at the documents woman button");
		homePageContainer.getDocumentsWomanButton().click();
		LOGGER.info("Clicking successfully");
	}
	
	public static void isSuccessful(){
		LOGGER.info("Checking home page is redirect successfully");
		BrowserDriver.waitForElement(verificationPageContainer.getTitleCitizenVerification());
	}
}
