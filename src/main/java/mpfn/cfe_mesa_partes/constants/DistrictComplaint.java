package mpfn.cfe_mesa_partes.constants;

import java.util.HashMap;
import java.util.Map;

public class DistrictComplaint {

	public static String findByDistrict(String dis) {
		Map<String, String> districts = new HashMap<String, String>();
		districts.put("BARRANCO", "list-item-225-0");
		districts.put("BREÑA", "list-item-225-1");
		districts.put("JESUS MARIA", "list-item-225-2");
		districts.put("LA VICTORIA", "list-item-225-3");
		districts.put("LIMA", "list-item-225-4");
		districts.put("LINCE", "list-item-225-5");
		districts.put("MAGDALENA DEL MAR", "list-item-225-6");
		districts.put("MIRAFLORES", "list-item-225-7");
		districts.put("PUEBLO LIBRE", "list-item-225-8");
		districts.put("RIMAC", "list-item-225-9");
		districts.put("SAN BORJA", "list-item-225-10");
		districts.put("SAN ISIDRO", "list-item-225-11");
		districts.put("SAN LUIS", "list-item-225-12");
		districts.put("SAN MIGUEL", "list-item-225-13");
		districts.put("SANTIAGO DE SURCO", "list-item-225-14");
		districts.put("SURQUILLO", "list-item-225-15");		
		return districts.get(dis);
	}
	
}
