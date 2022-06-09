package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class LicenzaImp implements Licenza {
	private int numeroLicenza;
	private Persona titolare;
	private int annoDiScadenza;
	@Override
	public boolean isValid() {
		return true;
	}		
	
}
