package mpfn.cfe_mesa_partes.constants;

public enum ActionsHome {

	COMPLAINT_PENAL(new String[]{"denuncia penal"}),
	DOCUMENTS_PENAL(new String[]{"presentar documentos caso penal"}),
	COMPLAINT_WOMAN(new String[]{"denuncia penal violencia contra la mujer"}),
	DOCUMENTS_WOMAN(new String[]{"presentar documentos caso violencia contra la mujer"});
			
	private String[] aliases;
	
	private ActionsHome(String[] aliases){
        this.aliases = aliases;
	}

	public static ActionsHome actionsForName(String action) throws IllegalArgumentException{
        for(ActionsHome a: values()){
        	for(String alias: a.aliases){
        		if(alias.equalsIgnoreCase(action)){
        			return a;
        		}
        	}
        }
        throw actionNotFound(action);
    }

    private static IllegalArgumentException actionNotFound(String a) {
        return new IllegalArgumentException(("Invalid action type [" + a + "]"));
    }
}
