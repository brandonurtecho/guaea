package mpfn.cfe_mesa_partes.steps;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import mpfn.cfe_mesa_partes.mockapplication.NavigatorFactory;

public class PenalComplaintSteps implements En {
	private static final Logger LOGGER = Logger.getLogger(PenalComplaintSteps.class.getName());
	
	public PenalComplaintSteps() {
		Given("^Veo la pantalla del formulario principal de denuncia$", () -> {
			LOGGER.info("Veo la pantalla");
		});
		
		Then("^Completo los datos generales asociados al hecho de mi denuncia$", (DataTable dt) -> {
			LOGGER.info("Filling general data of a fact");
			List<String> infoHecho = dt.asList(String.class);
			NavigatorFactory.getNavigator().registrarInfoHecho(infoHecho);
		});
		
		And("^Agrego a agraviado$", (DataTable dt) -> {
			LOGGER.info("Filling general data of a involved");			
			List<Map<String, String>> infoAgraviados = dt.asMaps(String.class, String.class);
			NavigatorFactory.getNavigator().registrarAgraviado(infoAgraviados);
			
		});
		
		And("^Agrego a denunciado$", (DataTable dt) -> {
			LOGGER.info("Filling general data of a denounced");			
			List<Map<String, String>> infoDenunciados = dt.asMaps(String.class, String.class);
			NavigatorFactory.getNavigator().registrarDenunciado(infoDenunciados);
			
		});
	}
	

}
