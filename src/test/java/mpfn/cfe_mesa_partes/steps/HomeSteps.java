package mpfn.cfe_mesa_partes.steps;

import java.util.logging.Logger;

import cucumber.api.java8.En;
import mpfn.cfe_mesa_partes.mockapplication.NavigatorFactory;

public class HomeSteps implements En {
	private static final Logger LOGGER = Logger.getLogger(HomeSteps.class.getName());
	
	public HomeSteps() {
		Given("^Navego a la pantalla de inicio$", () -> {
			LOGGER.info("Entering: I'm entering to the home page");
			NavigatorFactory.getNavigator().irPantallaInicio();
		});
		
		When("^Hago una '(.+)' en la pantalla principal$", (String accion) -> {
			LOGGER.info("I'm executing an action");
			NavigatorFactory.getNavigator().hacerAccionPantallaInicio(accion);
		});
		
		Then("^Deberia ver la pantalla de verificacion de ciudadano$", () -> {
			LOGGER.info("Entering: I should see that I logged in ");
			NavigatorFactory.getNavigator().verPantallaVerificacion();
		});
	}
	

}
