package mpfn.cfe_mesa_partes.utils;

import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import mpfn.cfe_mesa_partes.constants.Browsers;

public class BrowserFactory {
	
	private static final String BROWSER_PROP_KEY = "browser";
	
	/**
	 * creates the browser driver specified in the system property "browser"
	 * if no property is set then a firefox browser driver is created.
	 * The allow properties are firefox, safari and chrome
	 * e.g to run with safari, pass in the option -Dbrowser=safari at runtime
	 * @return WebDriver
	 */
	public static WebDriver getBrowser() {
		Browsers browser;
		WebDriver driver;
		/*
		if(System.getProperty(BROWSER_PROP_KEY)==null){
			browser = Browsers.FIREFOX;
		}else{
			browser = Browsers.browserForName(System.getProperty(BROWSER_PROP_KEY));
		}
		switch(browser){
			case CHROME:
				driver = createChromeDriver();
				break;
			case SAFARI:
				driver = createSafariDriver();
				break;
			case FIREFOX:
			default:
				driver = createFirefoxDriver();
				break;
		}*/
		driver = createChromeDriver();
		addAllBrowserSetup(driver);
		return driver;
	}

	private static WebDriver createSafariDriver() {
		return new SafariDriver();
	}

	private static WebDriver createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		return new ChromeDriver();
	}
	
	private static WebDriver createFirefoxDriver() {
        return new FirefoxDriver();
    }

	private static void addAllBrowserSetup(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(0, 0));
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
        driver.manage().window().setSize(dim);
	}

}
