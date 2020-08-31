package mpfn.cfe_mesa_partes.hook;

import java.util.logging.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import mpfn.cfe_mesa_partes.utils.BrowserDriver;

public class Hook {
	
	private static final Logger LOGGER = Logger.getLogger(Hook.class.getName());
	//WebDriver driver;
		
	@Before
	public void initializeTest() {
		LOGGER.info("Opening browser");
		/*System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(0, 0));
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
        driver.manage().window().setSize(dim);        
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		*/
		BrowserDriver.loadPage("http://127.0.0.1:8080/#/");
	}

	@After
	public void tearDownTest() {
		LOGGER.info("Closing the browser");
		//BrowserDriver.close();
	}
}
