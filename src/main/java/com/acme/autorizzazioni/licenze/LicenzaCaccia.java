package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LicenzaCaccia extends LicenzaImp {
	private String atc;
	private String numeroDiSerie; 
	private String tipologiaPrede;
	
	public LicenzaCaccia(int numeroLicenza, Persona titolare, int annoDiScadenza , String atc, String numeroDiSerie, String tipologiaPrede) {
		super(numeroLicenza, titolare, annoDiScadenza);
		this.atc = atc;
		this.numeroDiSerie = numeroDiSerie;
		this.tipologiaPrede = tipologiaPrede;
		 
	}

	//aaaaaaaaa
}
