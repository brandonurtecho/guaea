package mpfn.cfe_mesa_partes.constants;

import java.util.HashMap;
import java.util.Map;

public class Document {

	public static String findByKindDocumentInvolved(String doc) {
		Map<String, String> documents = new HashMap<>();
		documents.put("Carnet de Extranjería", "list-item-245-0");
		documents.put("DNI", "list-item-245-1");
		documents.put("Pasaporte", "list-item-245-2");
		documents.put("Permiso Temporal de Permanencia", "list-item-245-3");
		documents.put("RUC", "list-item-245-4");	
		return documents.get(doc);
	}
	
	public static String findByKindDocumentDenounced(String doc) {
		Map<String, String> documents = new HashMap<>();
		documents.put("Carnet de Extranjería", "list-item-254-0");
		documents.put("DNI", "list-item-254-1");
		documents.put("Pasaporte", "list-item-254-2");
		documents.put("Permiso Temporal de Permanencia", "list-item-254-3");
		documents.put("RUC", "list-item-254-4");	
		return documents.get(doc);
	}
	
}
