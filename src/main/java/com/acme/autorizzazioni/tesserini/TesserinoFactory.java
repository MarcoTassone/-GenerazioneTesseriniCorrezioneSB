package com.acme.autorizzazioni.tesserini;

public class TesserinoFactory {
	public final static String TESSERINO_CACCIA = "C";
	public final static String TESSERINO_PESCA = "P";
	
	
	public static final Tesserino create(String tipoTesserino) throws WrongTesserinoTypeException {
		Tesserino tesserino = null;
		
		
		if(tipoTesserino.equals(TESSERINO_CACCIA)) {
			tesserino = new TesserinoCaccia();
		} else if(tipoTesserino.equals(TESSERINO_PESCA)) {
			tesserino = new TesserinoPesca();
		} else {
			throw new WrongTesserinoTypeException("Tipologi di tesserino non esistente");
		}
		
		
		return tesserino;
		
	}
}
