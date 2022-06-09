package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.licenze.LicenzaCaccia;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoFactory;
import com.acme.autorizzazioni.tesserini.WrongTesserinoTypeException;

public class TesserinoCacciaCreator {

	public static void create(LicenzaCaccia licenza, int annoInCorso) throws WrongTesserinoTypeException {
		
		Tesserino tesserino = TesserinoFactory.create(TesserinoFactory.TESSERINO_CACCIA);
		tesserino.setAnnoValidita(annoInCorso);
		System.out.println("Tesserino caccia inviato ad atc "+ licenza.getAtc());
		}
}
