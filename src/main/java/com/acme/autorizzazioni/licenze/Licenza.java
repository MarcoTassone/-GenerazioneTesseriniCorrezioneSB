package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

public interface Licenza {

	int getAnnoDiScadenza();

	int getNumeroLicenza();

	Persona getTitolare();

	void setAnnoDiScadenza(int annoDiScadenza);

	void setNumeroLicenza(int numeroLicenza);

	void setTitolare(Persona titolare);
	
	boolean isValid();

}