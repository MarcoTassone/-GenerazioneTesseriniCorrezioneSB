package com.acme.autorizzazioni.licenze;

public class LicenzaFactory {
	public final static int LICENZA_DI_CACCIA = 1;
	public final static int LICENZA_DI_PESCA = 2;
	
	public static Licenza create(int tipoLicenza) throws WrongLicenzeTypeException {
		Licenza licenza = null;
		if(tipoLicenza == LICENZA_DI_CACCIA) {
			licenza = new LicenzaCaccia();
		} else if(tipoLicenza == LICENZA_DI_PESCA) {
			licenza = new LicenzaPesca();
		} else {
			throw new WrongLicenzeTypeException("Tipo licenza specificata errato");
		}
		
		return licenza;
	}
}
