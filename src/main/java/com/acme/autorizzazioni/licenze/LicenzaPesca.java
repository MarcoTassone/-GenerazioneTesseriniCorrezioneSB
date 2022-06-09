package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LicenzaPesca extends LicenzaImp {
	private String tipo;  
	private String localita;
	
	public LicenzaPesca(int numeroLicenza, Persona titolare, int annoDiScadenza , String tipo, String localita) {
		super(numeroLicenza, titolare, annoDiScadenza);
		this.tipo = tipo;
		this.localita = localita; 
		 
	}

}
