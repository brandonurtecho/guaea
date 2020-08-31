package mpfn.cfe_mesa_partes.steps;

import java.util.logging.Logger;

import cucumber.api.java8.En;
import mpfn.cfe_mesa_partes.mockapplication.NavigatorFactory;

public class PersonalInfoSteps implements En {
	private static final Logger LOGGER = Logger.getLogger(PersonalInfoSteps.class.getName());
	
	public PersonalInfoSteps() {

		And("^Registro mis datos personales como '(.+)', '(.+)', '(.+)'$", (String celular, String email, String reemail) -> {
			LOGGER.info("I'm registering my personal information");
			NavigatorFactory.getNavigator().registrarDatosPersonales(celular, email, reemail);
		});
		
		Then("^El registro de mi informacion personal fue exitosa '(.+)'$", (String accion) -> {
			LOGGER.info("I'm seeing the form of " + accion);
			NavigatorFactory.getNavigator().verPantallaFormularioPrincipal();
		});
	}
	

}
