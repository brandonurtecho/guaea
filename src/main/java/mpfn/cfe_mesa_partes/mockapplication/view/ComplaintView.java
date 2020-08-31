package mpfn.cfe_mesa_partes.mockapplication.view;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import mpfn.cfe_mesa_partes.constants.DistrictComplaint;
import mpfn.cfe_mesa_partes.constants.Document;
import mpfn.cfe_mesa_partes.mockapplication.containers.DenouncedContainer;
import mpfn.cfe_mesa_partes.mockapplication.containers.FactContainer;
import mpfn.cfe_mesa_partes.mockapplication.containers.InvolvedContainer;
import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class ComplaintView {
	private static final Logger LOGGER = Logger.getLogger(ComplaintView.class.getName());
	private static final FactContainer factContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), FactContainer.class);
	private static final InvolvedContainer involvedContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), InvolvedContainer.class);
	private static final DenouncedContainer denouncedContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DenouncedContainer.class);
	
	public static void isDisplayedCheck(){
		LOGGER.info("Checking home page is displayed");
		BrowserDriver.waitForElement(factContainer.getCrimeNameField());
		//personalInfoContainer.getTitlePersonalInfo().isDisplayed();
	}
	
	public static void fillFactSectionForm(
			String descripcion, String delito, Boolean otros, String otroDelito, 
			String departamento, String provincia, String distrito, String lugar, String fecha, String hora){
		LOGGER.info("Filling forms");
		factContainer.getDescriptionFactField().sendKeys(descripcion);		
		if(!otros) {
			factContainer.getCrimeRefField().sendKeys(delito);
			factContainer.getCrimeRefField().sendKeys(Keys.ENTER);
		} else {
			Actions actions = new Actions(BrowserDriver.getCurrentDriver());
	    	actions.moveToElement(factContainer.getOthersCheckBox()).click().build().perform();
	    	BrowserDriver.waitForElement(factContainer.getCrimeNameField());
	    	factContainer.getCrimeNameField().sendKeys(otroDelito);
		}
		factContainer.getDepartmentField().sendKeys(departamento + Keys.ENTER);
		factContainer.getDepartmentField().sendKeys(Keys.ENTER);
		factContainer.getProvinceField().sendKeys(provincia + Keys.ENTER);
		factContainer.getProvinceField().sendKeys(Keys.ENTER);
		factContainer.getDistrictField().sendKeys(Keys.ENTER);
		BrowserDriver.getCurrentDriver().findElement(By.xpath("//*[@id='"+DistrictComplaint.findByDistrict(distrito)+"']")).click();		
		factContainer.getPlaceField().sendKeys(lugar);
		factContainer.getDateField().sendKeys(fecha);
				
		LOGGER.info("Filling forms successfully");
	}
	
	
	public static void fillInvolvedSectionForm(Boolean otro, String tipoDocumento, String numDocumento, String nomAgraviado) {
		if(otro) {
			Actions actions = new Actions(BrowserDriver.getCurrentDriver());
	    	actions.moveToElement(involvedContainer.getOtherInvolvedCheckBox()).click().build().perform();
			System.out.println(Document.findByKindDocumentInvolved(tipoDocumento));
			BrowserDriver.selectByValueComboBox(involvedContainer.getTypeDocumentCombo(), tipoDocumento);
			involvedContainer.getNumDocumentField().sendKeys(numDocumento);
			involvedContainer.getNameField().sendKeys(nomAgraviado);			
		}
		involvedContainer.getAddButton().click();
	}
	
	public static void fillDenouncedSectionForm(Boolean conocido, String tipoDocumento, String numDocumento, String nomDenunciado) {
		if(conocido) {
			Actions actions = new Actions(BrowserDriver.getCurrentDriver());
	    	actions.moveToElement(denouncedContainer.getKnown()).click().build().perform();
	    	denouncedContainer.getTypeDocumentCombo().sendKeys(tipoDocumento + Keys.ENTER);
	    	denouncedContainer.getTypeDocumentCombo().sendKeys(Keys.ENTER);
	    	denouncedContainer.getNumDocumentField().sendKeys(numDocumento);
	    	denouncedContainer.getNameField().sendKeys(nomDenunciado);			
		} else {
			Actions actions = new Actions(BrowserDriver.getCurrentDriver());
	    	actions.moveToElement(denouncedContainer.getUnknownCheckBox()).click().build().perform();
		}
		denouncedContainer.getAddButton().click();
	}
		
	public static void submit(){
		LOGGER.info("Clicking at the submit button");
		
		LOGGER.info("Submit successfully");
	}
		
	public static void isSuccessful(){
		LOGGER.info("Checking home page is redirect successfully");
		//BrowserDriver.waitForElement(.getTitlePersonalInfo());
	}
}
