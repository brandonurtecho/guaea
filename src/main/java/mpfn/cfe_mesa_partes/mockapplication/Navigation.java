package mpfn.cfe_mesa_partes.mockapplication;

import java.util.List;
import java.util.Map;

import mpfn.cfe_mesa_partes.constants.ActionsHome;
import mpfn.cfe_mesa_partes.mockapplication.view.ComplaintView;
import mpfn.cfe_mesa_partes.mockapplication.view.HomeView;
import mpfn.cfe_mesa_partes.mockapplication.view.PersonalInfoView;
import mpfn.cfe_mesa_partes.mockapplication.view.VerificationCitizenView;

public class Navigation {

	public void irPantallaInicio() {
		HomeView.isDisplayedCheck();
	}

	public void hacerAccionPantallaInicio(String accion) {
		ActionsHome ac = ActionsHome.actionsForName(accion);
		switch (ac) {
		case COMPLAINT_PENAL:
			HomeView.makeComplaintPenal();
			break;
		case COMPLAINT_WOMAN:
			HomeView.makeComplaintWoman();
			break;
		case DOCUMENTS_PENAL:
			HomeView.makeDocumentsPenal();
			break;
		case DOCUMENTS_WOMAN:
			HomeView.makeDocumentsWoman();
			break;
		}
	}

	public void verPantallaVerificacion() {
		HomeView.isSuccessful();
	}

	public void registrarVerificacion(String dni, String fechaNacimiento, String ultimoDigitoDni, String nombreMadre,
			String nombrePadre, String fechaEmisionDni, String numeroUbigeo) {
		
		VerificationCitizenView.fillForms(dni, fechaNacimiento, ultimoDigitoDni, nombreMadre, nombrePadre,
				fechaEmisionDni, numeroUbigeo);
		VerificationCitizenView.submit();
		
	}

	public void verPantallaDeDatosPersonales() {
		VerificationCitizenView.isSuccessful();
	}

	public void registrarDatosPersonales(String celular, String email, String reemail) {
		PersonalInfoView.fillForms(celular, email, reemail);
		PersonalInfoView.agreed();
		PersonalInfoView.submit();
	}

	public void verPantallaFormularioPrincipal() {
		// HomeView.isSuccessful();
	}

	public void registrarInfoHecho(List<String> infoHecho) {
		
		ComplaintView.fillFactSectionForm(
					infoHecho.get(0), infoHecho.get(1), 
					Boolean.parseBoolean(infoHecho.get(2)),
					infoHecho.get(3), infoHecho.get(4), 
					infoHecho.get(5), infoHecho.get(6), 
					infoHecho.get(7), infoHecho.get(8),
					infoHecho.get(0)
				);
	}

	public void registrarAgraviado(List<Map<String,String>> infoAgraviado) {
		
		for(int i=0; i<infoAgraviado.size(); i++) {
			ComplaintView.fillInvolvedSectionForm(
						Boolean.parseBoolean(infoAgraviado.get(i).get("CAMPO_OTRO")), 
						infoAgraviado.get(i).get("CAMPO_TIPO_DOCUMENTO"), 
						infoAgraviado.get(i).get("CAMPO_NUMERO_DOCUMENTO"), 
						infoAgraviado.get(i).get("CAMPO_NOMBRES")
					);
		}
	}
	
	//fillDenouncedSectionForm
	public void registrarDenunciado(List<Map<String,String>> infoDenunciado) {
		
		for(int i=0; i<infoDenunciado.size(); i++) {
			ComplaintView.fillDenouncedSectionForm(
						Boolean.parseBoolean(infoDenunciado.get(i).get("CAMPO_CONOCIDO")), 
						infoDenunciado.get(i).get("CAMPO_TIPO_DOCUMENTO"), 
						infoDenunciado.get(i).get("CAMPO_NUMERO_DOCUMENTO"), 
						infoDenunciado.get(i).get("CAMPO_NOMBRES")
					);
		}
	}
	
}
