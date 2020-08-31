package mpfn.cfe_mesa_partes.mockapplication.containers;

import org.openqa.selenium.WebElement;

import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class HomePageContainer {
	
	public WebElement getTitleWelcomeHome() {
		return BrowserDriver.findById("title-welcome-home");
	}
	
	public WebElement getComplaintPenalButton() {
		return BrowserDriver.findById("btnMakeComplaintPenal");
	}

	public WebElement getDocumentsPenalButton() {
		return BrowserDriver.findById("btnMakeDocumentsPenal");
	}

	public WebElement getComplaintWomanButton() {
		return BrowserDriver.findById("btnMakeComplaintWoman");
	}

	public WebElement getDocumentsWomanButton() {
		return BrowserDriver.findById("btnMakeDocumentsWoman");
	}

}
