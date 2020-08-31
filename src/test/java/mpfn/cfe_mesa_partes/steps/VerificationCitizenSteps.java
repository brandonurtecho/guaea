package mpfn.cfe_mesa_partes.steps;

import java.util.logging.Logger;

import cucumber.api.java8.En;
import mpfn.cfe_mesa_partes.mockapplication.NavigatorFactory;

public class VerificationCitizenSteps implements En {
	private static final Logger LOGGER = Logger.getLogger(VerificationCitizenSteps.class.getName());
	
	public VerificationCitizenSteps() {

		And("^Registro mis datos como mi '(.+)', '(.+)' y '(.+)' o '(.+)' o '(.+)' o '(.+)' o '(.+)'$", 
				(String dni, String fechaNacimiento, String ultimoDigitoDni, 
						String nombreMadre, String nombrePadre, String fechaEmisionDni, String numeroUbigeo) -> {
			LOGGER.info("I'm registering my verification data");
			NavigatorFactory.getNavigator().registrarVerificacion(dni, fechaNacimiento, ultimoDigitoDni, nombreMadre, nombrePadre, fechaEmisionDni, numeroUbigeo);
		});
		
		Then("^El registro fue exitoso$", () -> {
			LOGGER.info("I'm seeing the verification page");
		});
	}
	

}
