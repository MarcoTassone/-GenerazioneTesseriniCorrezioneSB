package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.licenze.titolari.TitolareLicenzaFactory;
import com.acme.autorizzazioni.persone.Persona;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Licenza licenzaCaccia = LicenzaFactory.create(LicenzaFactory.LICENZA_DI_CACCIA);
			
			licenzaCaccia.setAnnoDiScadenza(2000);
			licenzaCaccia.setNumeroLicenza(200);
			
			//Persona titolareLicenza = TitolareLicenzaFactory.create(  TitolareLicenzaFactory.TITOLARE_LICENZA   );
			
			/*
			Persona titolareLicenza = TitolareLicenzaFactory.create( );
			titolareLicenza.setNome("Mauro");
			titolareLicenza.setCognome("Larese");
			titolareLicenza.setEmail("mauro.larese@gmail.com");
			titolareLicenza.setIndirizzo("via Roma 117");
			titolareLicenza.setCitta("Belluno");
			titolareLicenza.setCap("32100");
			*/
			
			 // inverse of control - IoC
			 // dependency injection
			
			Persona titolareLicenza = TitolareLicenzaFactory.create(TitolareLicenzaFactory.TITOLARE_LICENZA, 
					"Mauro", "Larese", "via Roma 20", "mauro.larese@gmail.com", "32100", "Belluno");
			
			licenzaCaccia.setTitolare(titolareLicenza);
			
		} catch (Exception e) {
			System.out.println(" Si è verificato un errore : " + e.getMessage() );
		}
		
	}
	
	
}
