package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.licenze.LicenzaCaccia;
import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoFactory;
import com.acme.autorizzazioni.tesserini.WrongTesserinoTypeException;

public class TesserinoPescaCreator {

	public static void create(LicenzaPesca licenza, int annoInCorso) throws WrongTesserinoTypeException {
		
		Tesserino tesserino = TesserinoFactory.create(TesserinoFactory.TESSERINO_PESCA);
		tesserino.setAnnoValidita(annoInCorso);
		System.out.println("Tesserino caccia inviato ad atc "+ licenza.getLocalita());
		}
}
